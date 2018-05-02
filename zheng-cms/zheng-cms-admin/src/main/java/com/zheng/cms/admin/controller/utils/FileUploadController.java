package com.zheng.cms.admin.controller.utils;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.aliyun.oss.OSSClient;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.qiniu.common.QiniuException;
import com.qiniu.http.Response;
import com.qiniu.storage.UploadManager;
import com.qiniu.storage.model.DefaultPutRet;
import com.qiniu.util.Auth;
import com.zheng.cms.admin.controller.manage.CmsArticleController;
import com.zheng.common.base.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * 文件上传控制器
 * created by zhuozhenxun on 20118-04-29
 */
@Controller
@Api(value = "文件", description = "文件Utils")
@RequestMapping("/manage/file")
public class FileUploadController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsArticleController.class);

    @ApiOperation(value = "编辑器图片上传到七牛云")
    @RequestMapping(value = "/imgupload")
    @ResponseBody
    public Object imgupload(
            @RequestParam(required = false, value = "imagefile") List<MultipartFile> imagefiles){

        //设置好账号的ACCESS_KEY和SECRET_KEY
        String accessKey = "1gtVJtFNb8mUPItW393Rqaxg41WveP0WWPP4kAUu";
        String secretKey = "JVLmiIlDhs1w9YPmrSQOHd71XbijtK_e7FYXgS9P";
        //要上传的空间
        String bucketname = "images";
        //密钥配置
        Auth auth = Auth.create(accessKey, secretKey);
        //创建上传对象
        UploadManager uploadManager = new UploadManager();

        //简单上传，使用默认策略，只需要设置上传的空间名就可以了
        String Uptoken = auth.uploadToken(bucketname);

        // 返回结果
        JSONObject jsonObject = new JSONObject();
        JSONArray jsonArray = new JSONArray();
        for (int i = 0; i < imagefiles.size(); i++) {
            String filename = imagefiles.get(i).getOriginalFilename(); // 获取文件名
            String prefix = filename.substring(filename.lastIndexOf(".")+1); // 获取后缀名

            //默认不指定key的情况下，以文件内容的hash值作为文件名
            String key = imagefiles.get(i).hashCode() + "." + prefix ;
            key = null;
            try {
                Response res = null;
                try {
                    res = uploadManager.put(imagefiles.get(i).getBytes(),key,Uptoken);
                } catch (IOException e) {
                    e.printStackTrace();
                }
                DefaultPutRet putRet = new Gson().fromJson(res.bodyString(), DefaultPutRet.class);
                System.out.println(res.bodyString());

                jsonArray.add("http://ou343dnae.bkt.clouddn.com/"+putRet.hash); // 添加进返回数据
            } catch (QiniuException ex) {
                Response r = ex.response;
                System.err.println(r.toString());
                try {
                    System.err.println(r.bodyString());
                } catch (QiniuException ex2) {
                    //ignore
                }
            }

            if(jsonArray.size() == imagefiles.size()){
                jsonObject.put("errno",0);
            }else {
                jsonObject.put("errno",1);
            }
            jsonObject.put("data", jsonArray);
        }
        return jsonObject;
    }

    @ApiOperation(value = "上传文件到本地文件夹")
    @RequestMapping(value = "/upload")
    @ResponseBody
    public Object upload( @RequestParam(required = false, value = "imagefile") List<MultipartFile> imagefiles) {
        JSONObject jsonObject = new JSONObject();
        String classpath = this.getClass().getResource("/").getPath().replaceFirst("/", "");
        String webappRoot = classpath.replaceAll("target/classes/", "") + "webapp/resources/upload";
        File uploaddir = new File(webappRoot); // 上传文件夹
        if (!uploaddir.exists()) {
            uploaddir.mkdirs();
        }
        for (int i = 0; i < imagefiles.size(); i++) {
            String filename = imagefiles.get(i).getOriginalFilename(); // 获取文件名
            String prefix = filename.substring(filename.lastIndexOf(".") + 1); // 获取后缀名
            //默认不指定key的情况下，以文件内容的hash值作为文件名
            String key = imagefiles.get(i).hashCode() + "." + prefix;
            File targetFile = new File(webappRoot, key);
            try {
                imagefiles.get(i).transferTo(targetFile);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        jsonObject.put("errno", "0");
        return  jsonObject;
    }


    @ApiOperation(value = "上传文件到阿里云")
    @RequestMapping(value = "/upload2Aliyun")
    @ResponseBody
    public Object upload2Aliyun( @RequestParam(required = false, value = "imagefile") List<MultipartFile> imagefiles){
        JSONObject jsonObject = new JSONObject();
        // endpoint以杭州为例，其它region请按实际情况填写
        String endpoint = "http://oss-cn-shenzhen.aliyuncs.com";
        // 云账号AccessKey有所有API访问权限，建议遵循阿里云安全最佳实践，创建并使用RAM子账号进行API访问或日常运维，请登录 https://ram.console.aliyun.com 创建
        String accessKeyId = "LTAIFyYu4S7cTTxH";
        String accessKeySecret = "c0tPze2VplmmMOLTJaPPTgvHKJDDFa";
        // 创建OSSClient实例
        OSSClient ossClient = new OSSClient(endpoint, accessKeyId, accessKeySecret);
        // 上传文件流

        for (int i = 0; i < imagefiles.size(); i++) {
            String filename = imagefiles.get(i).getOriginalFilename(); // 获取文件名
            String prefix = filename.substring(filename.lastIndexOf(".") + 1); // 获取后缀名
            //默认不指定key的情况下，以文件内容的hash值作为文件名
            String key = null;
            try {
                key = imagefiles.get(i).getInputStream().hashCode() + "." + prefix;
                System.out.println( key );
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                ossClient.putObject("shanmuzhuo","images/"+key, imagefiles.get(i).getInputStream());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        System.out.println("重新编译。。。。1234");
        // 关闭client
        ossClient.shutdown();
        jsonObject.put("errno", "0");
        return  jsonObject;
    }
}

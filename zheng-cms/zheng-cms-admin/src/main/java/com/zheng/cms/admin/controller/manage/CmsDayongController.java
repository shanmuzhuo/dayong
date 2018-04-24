package com.zheng.cms.admin.controller.manage;

import com.zheng.cms.common.constant.CmsResult;
import com.zheng.cms.common.constant.CmsResultConstant;
import com.zheng.cms.dao.model.CmsDayong;
import com.zheng.cms.rpc.api.CmsDayongService;
import com.zheng.common.base.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;


/**
 * 景点控制器
 * created by zhuozhenxun on 20118-04-20
 */
@Controller
@Api(value = "景点", description = "景点管理")
@RequestMapping("/manage/spot")
public class CmsDayongController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsArticleController.class);

    @Autowired
    private CmsDayongService cmsDayongService;

    /**
     * 景点列表
     *
     * @return
     */
    @ApiOperation(value = "景点管理主页")
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String sayHello() {
        System.out.println("hello 123456");
        return "/manage/dayong/index.jsp";
    }

    @ApiOperation(value = "新增景点")
    @RequiresPermissions("cms:dayong:add")
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(ModelMap modelMap) {
        return "/manage/dayong/add.jsp";
    }

    @ApiOperation(value = "新增景点")
    @RequiresPermissions("cms:dayong:add")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public  Object add(CmsDayong cmsDayong){
        long time = System.currentTimeMillis();
        Date date = new Date(time);

        System.out.println(time+"---------");
        cmsDayong.setCreatetime(date);
        cmsDayong.setSpotId(time+"");
        System.out.println(cmsDayong.getDayongName());
        System.out.println(cmsDayong.getCreatetime());
        int count = cmsDayongService.insert(cmsDayong);
        return new CmsResult(CmsResultConstant.SUCCESS, count);
    }
}

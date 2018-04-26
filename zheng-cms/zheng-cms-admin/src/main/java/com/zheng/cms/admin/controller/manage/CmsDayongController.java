package com.zheng.cms.admin.controller.manage;

import com.zheng.cms.common.constant.CmsResult;
import com.zheng.cms.common.constant.CmsResultConstant;
import com.zheng.cms.dao.model.CmsDayong;
import com.zheng.cms.dao.model.CmsDayongExample;
import com.zheng.cms.rpc.api.CmsDayongService;
import com.zheng.common.base.BaseController;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.commons.lang.StringUtils;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


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
        return "/manage/dayong/index.jsp";
    }


    @ApiOperation(value = "景点列表")
    @RequiresPermissions("cms:article:read")
    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public Object list(
            @RequestParam(required = false, defaultValue = "0", value = "offset") int offset,
            @RequestParam(required = false, defaultValue = "10", value = "limit") int limit,
            @RequestParam(required = false, defaultValue = "", value = "search") String search,
            @RequestParam(required = false, value = "sort") String sort,
            @RequestParam(required = false, value = "order") String order)
    {
        CmsDayongExample cmsDayongExample = new CmsDayongExample();
        if (!StringUtils.isBlank(sort) && !StringUtils.isBlank(order)) {
            cmsDayongExample.setOrderByClause(sort + " " + order);
        }
        if (StringUtils.isNotBlank(search)) {
            cmsDayongExample.or().andDayongNameLike("%" + search + "%");
        }
        List<CmsDayong> rows = cmsDayongService.selectByExampleForOffsetPage(cmsDayongExample, offset, limit);
        long total = cmsDayongService.countByExample(cmsDayongExample);
        Map<String, Object> result = new HashMap<>(2);
        result.put("rows", rows);
        result.put("total", total);
        return result;
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
        System.out.println(cmsDayong.getSpotId());
        System.out.println(cmsDayong.getCreatetime()+"time");
        System.out.println("1234123");
        int count = cmsDayongService.insertSelective(cmsDayong);
        return new CmsResult(CmsResultConstant.SUCCESS, count);
    }

    @ApiOperation(value = "修改景点")
    @RequiresPermissions("cms:spot:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.GET)
    public String update(@PathVariable("id") int id, ModelMap modelMap) {
        CmsDayong cmsDayong = cmsDayongService.selectByPrimaryKey(id);
        modelMap.put("spot", cmsDayong);
        return "/manage/dayong/update.jsp";
    }

    @ApiOperation(value = "修改景点")
    @RequiresPermissions("cms:spot:update")
    @RequestMapping(value = "/update/{id}", method = RequestMethod.POST)
    @ResponseBody
    public Object update(@PathVariable("id") int id, CmsDayong cmsDayong) {
        cmsDayong.setDayongId(id);
        int count = cmsDayongService.updateByPrimaryKeySelective(cmsDayong);
        return new CmsResult(CmsResultConstant.SUCCESS, count);
    }

    @ApiOperation(value = "删除景点")
    @RequiresPermissions("cms:spot:delete")
    @RequestMapping(value = "/delete/{ids}",method = RequestMethod.GET)
    @ResponseBody
    public Object delete(@PathVariable("ids") String ids) {
        int count = cmsDayongService.deleteByPrimaryKeys(ids);
        return new CmsResult(CmsResultConstant.SUCCESS, count);
    }
}

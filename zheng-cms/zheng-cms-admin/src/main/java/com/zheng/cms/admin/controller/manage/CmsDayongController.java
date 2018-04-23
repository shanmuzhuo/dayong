package com.zheng.cms.admin.controller.manage;

import com.zheng.cms.dao.model.CmsTopic;
import com.zheng.cms.dao.model.CmsTopicExample;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.zheng.common.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;


/**
 * 景点控制器
 * created by zhuozhenxun on 20118-04-20
 */
@Controller
@Api(value = "景点", description = "景点管理")
@RequestMapping("/manage/spot")
public class CmsDayongController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsArticleController.class);

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
}

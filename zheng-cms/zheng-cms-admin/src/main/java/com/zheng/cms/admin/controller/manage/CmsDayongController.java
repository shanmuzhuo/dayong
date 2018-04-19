package com.zheng.cms.admin.controller.manage;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.zheng.common.base.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * 景点控制器
 * created by zhuozhenxun on 20118-04-20
 */
@Controller
@RequestMapping("/manage/spot")
public class CmsDayongController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(CmsArticleController.class);

    @RequestMapping(value = "/demo")
    public String sayHello(){
        System.out.println("hello 123456");
        return thymeleaf("/index");
    }
}

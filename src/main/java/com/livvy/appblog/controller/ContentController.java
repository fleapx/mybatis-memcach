package com.livvy.appblog.controller;

import com.livvy.appblog.bean.User;
import com.livvy.appblog.service.UserService;
import com.livvy.appblog.test.AopTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-13
 * Time: 下午8:15
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/content")
public class ContentController {


    @Autowired
     private UserService userService;

     @Autowired
     AopTest aopTest;

    @RequestMapping(value = "/index")
    public ModelAndView index(Model model) {
        User user =  userService.getUserById(1);
//        aopTest.getParams();
        ModelAndView mav = new ModelAndView();
        mav.setView("index");
        return mav;
    }


}

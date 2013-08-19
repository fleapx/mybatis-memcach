package com.livvy.appblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.portlet.ModelAndView;

/**
 * Created with IntelliJ IDEA.
 * User: GuoZheng
 * Date: 13-8-15
 * Time: 下午7:04
 * To change this template use File | Settings | File Templates.
 */
@Controller
@RequestMapping(value = "/account")
public class AccountController {

    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public ModelAndView register() {
        ModelAndView mav = new ModelAndView();
        mav.setView("register");
        return mav;
    }
}

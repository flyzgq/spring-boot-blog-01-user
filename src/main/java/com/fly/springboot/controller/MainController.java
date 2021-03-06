package com.fly.springboot.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * @author fly
 * @date 2018/5/13 16:22
 * @description 主页控制器
 **/
@Controller
public class MainController {

    /**
     * 日志记录
     */
    public static final Logger LOGGER = LoggerFactory.getLogger(MainController.class);

    @GetMapping("/")
    public String root(){
        return "redirect:/index";
    }

    @GetMapping("/index")
    public String index(){
        return "index";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

    @GetMapping("/login-error")
    public String loginError(Model model){
        model.addAttribute("loginError", true);
        model.addAttribute("errorMsg", "登录失败，用户名或密码错误！");
        return "login";
    }

    @PostMapping("/register")
    public String register(){
        return "register";
    }
}

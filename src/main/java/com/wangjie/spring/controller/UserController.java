package com.wangjie.spring.controller;

import com.wangjie.spring.model.User;
import com.wangjie.spring.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import org.springframework.ui.Model;
import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangjie on 2016/4/20 0020.
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @RequestMapping("/showUser")
    public String toIndex(HttpServletRequest request, Model model) {
        int userId = Integer.parseInt(request.getParameter("id"));
        User user = this.userService.getUserById(userId);
        model.addAttribute("user", user);
        return "showUser";
    }
}
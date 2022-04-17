package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class LoginController {
    @RequestMapping("/login")
    public String login(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if ("wangshengchang".equals(username) && "1234".equals(password)) {
            //获取当前时间
            long time = System.currentTimeMillis();
            //时间转化为yyyy-MM-dd HH:mm:ss格式
            String timeStr = new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date(time));
            request.getSession().setAttribute("username", username);
            request.getSession().setAttribute("date", timeStr);
            return "page";


        } else {

            return "error";


        }
    }

}




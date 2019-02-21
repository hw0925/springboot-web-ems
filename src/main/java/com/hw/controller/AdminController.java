package com.hw.controller;


import com.hw.entity.Admin;
import com.hw.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/admin")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @RequestMapping("/login")
    public String login(String username, String password, HttpSession session){
        session.removeAttribute("error");
        System.out.println(username+"  "+password);
        boolean login = adminService.login(username, password);
        System.out.println(login);
        if(login){
            return "redirect:/emp/allEmp";


        }else{
            session.setAttribute("error","用户名或密码错误");
            return "redirect:/login.jsp";
        }
    }


    @RequestMapping("/regist")
    public String regist(Admin admin, String code, HttpSession session, ModelMap modelMap){
        System.out.println(admin+"   "+code);
        String safeCode = (String)session.getAttribute("code");
        if(safeCode.equals(code)){//验证码正确
            boolean regist = adminService.regist(admin);
            if(regist){
                return "redirect:/emp/allEmp";
            }else{
                modelMap.addAttribute("mes","用户名已经存在");
                return "regist";
            }

        }else{
            modelMap.addAttribute("mes","验证码错误");
            return "regist";
        }

    }

}

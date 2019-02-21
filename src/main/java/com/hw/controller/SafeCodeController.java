package com.hw.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.OutputStream;

@Controller
@RequestMapping("/code")
public class SafeCodeController {
    @RequestMapping("/getCode")
    public void getSafeCode(HttpSession session, HttpServletResponse res){
        OutputStream os=null;
        try {
            os=res.getOutputStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(80, 40, 4, 8);
        lineCaptcha.write(os);
        //获得验证码
        String code = lineCaptcha.getCode();
        session.setAttribute("code",code);
    }
}

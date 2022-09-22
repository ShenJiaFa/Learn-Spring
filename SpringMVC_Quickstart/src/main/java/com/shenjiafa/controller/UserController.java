package com.shenjiafa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Function:
 *
 * @author ShenJiaFa
 * @since 2022/9/22
 */
@Controller
public class UserController {

    @RequestMapping("/save")
    @ResponseBody
    public String save() {
        System.out.println("user save...");
        return "{'name':'shenjiafa'}";
    }

}

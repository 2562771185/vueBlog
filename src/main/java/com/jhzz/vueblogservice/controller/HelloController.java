package com.jhzz.vueblogservice.controller;

import org.springframework.web.bind.annotation.RestController;

/**
 * \* Created with IntelliJ IDEA.
 * \* @author: Huanzhi
 * \* Date: 2022/5/8
 * \* Time: 13:17
 * \* Description:
 * \
 */
@RestController
public class HelloController {

    public String hello() {
        return "hello";
    }
}

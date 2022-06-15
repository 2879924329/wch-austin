package com.wch.austin.controller;

import com.wch.austin.pojo.SmsParam;
import com.wch.austin.script.TencentSmsScript;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.HashSet;

/**
 * @author wch
 * @version 1.0
 * @date 2022/6/15 20:54
 */
@RestController
public class TestController {

    Logger logger = LoggerFactory.getLogger(TestController.class);

    @Autowired
    private TencentSmsScript tencentSmsScript;


    @GetMapping("/get")
    public String get(){
        logger.info("logback info");
        logger.error("logback error");
        return "hello austin!";
    }

    @GetMapping("/hello")
    public String hello(){
        SmsParam smsParam = SmsParam.builder()
                .phones(new HashSet<>(Arrays.asList("14787025700")))
                .content("3333")
                .build();

        return tencentSmsScript.send(smsParam);
    }
}

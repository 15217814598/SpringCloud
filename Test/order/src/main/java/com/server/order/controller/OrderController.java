package com.server.order.controller;

import org.apache.commons.lang.RandomStringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;


/**
 * @author D
 */
@RestController
public class OrderController {

    @GetMapping("/listOrder")
    public String listOrder() {
        Random random = new Random();
        int length = random.nextInt(100) + 1;
        String str = RandomStringUtils.randomAlphanumeric(length);
        return "随机获取1到100个随机字符串：" + str;
    }

}

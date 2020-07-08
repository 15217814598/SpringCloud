package com.server.account.controller;

import com.server.account.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author D
 */
@RestController
public class AccountController {

    @Autowired
    private OrderClient orderClient;

    @GetMapping("/getOrder")
    public String getOrder() {
        String result = orderClient.listOrder();
        System.out.println(result);
        return result;
    }

}

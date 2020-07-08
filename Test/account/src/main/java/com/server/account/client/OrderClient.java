package com.server.account.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author D
 */
@FeignClient(value = "eureka-client-order-server")
public interface OrderClient {

    @GetMapping("/listOrder")
    String listOrder();

}

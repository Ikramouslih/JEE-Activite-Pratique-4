package com.emsi.customarservice.web;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@RefreshScope
public class CustomerConfigTestController {

    @Value("${spring.h2.console.enabled}")
    private boolean enable;

    @Value("${global.params.p1}")
    private String p1;

    @Value("${global.params.p2}")
    private String p2;

    @Value("${customer.params.x}")
    private String x;

    @Value("${customer.params.y}")
    private String y;

    @GetMapping("/params")
    public Map<String, String> params(){
        Map<String, String> props = new HashMap<>();
        props.put("enable", String.valueOf(enable));
        props.put("p1", p1);
        props.put("p2", p2);
        props.put("x", x);
        props.put("y", y);
        return props;
    }

}

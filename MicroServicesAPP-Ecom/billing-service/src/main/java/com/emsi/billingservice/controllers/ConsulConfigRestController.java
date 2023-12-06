package com.emsi.billingservice.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class ConsulConfigRestController {

    @Autowired
    private MyConsulConfig myConsulConfig;
    @Autowired
    private MyVaultConfig myVaultConfig;

//   @Value("${token.accessTokenTimeout}")
//    private long accessTokenTimeout;

//    @Value("${token.refreshTokenTimeout}")
//    private long refreshTokenTimeout;
//
//
//   @GetMapping("/myconfig")
//    public Map<String, String> myConfig() {
//        Map<String, String> config = new HashMap<>();
//        config.put("accessTokeTimeOut", String.valueOf( accessTokenTimeout));
//        config.put("refreshTokenTimeOut", String.valueOf(refreshTokenTimeout));
//        return config;
//    }
//    @GetMapping("/myconfig")
//    public MyConsulConfig myConfig() {
//       return myConsulConfig;
//    }

    @GetMapping("/myfullconfig")
    public Map<String, Object> myFullConfig() {

        return Map.of("consul", myConsulConfig, "vault", myVaultConfig);
    }

}

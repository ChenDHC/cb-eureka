package com.cb.eureka.server.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProviderController {

    @Autowired
    private DiscoveryClient discoveryClient;

    @RequestMapping(value = "/hello")
    public String hello(){
        List<String> services = discoveryClient.getServices();
        for(String s : services){
            System.out.println("hello: "+s);
        }
        return "hello";
    }

    @RequestMapping(value = "/nice")
    public String nice(){
        List<String> services = discoveryClient.getServices();
        for(String s : services){
            System.out.println("nice: " + s);
        }
        return "nice";
    }

}
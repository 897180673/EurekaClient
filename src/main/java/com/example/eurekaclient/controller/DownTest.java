package com.example.eurekaclient.controller;

import com.netflix.discovery.DiscoveryClient;
import com.netflix.discovery.DiscoveryManager;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DownTest {

    @GetMapping(  "/offline" )
    public void offLine(){
        DiscoveryManager.getInstance().shutdownComponent();



    }
}

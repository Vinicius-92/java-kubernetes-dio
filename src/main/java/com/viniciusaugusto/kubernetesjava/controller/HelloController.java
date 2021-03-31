package com.viniciusaugusto.kubernetesjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @GetMapping
    public String sayHello() throws UnknownHostException {
        InetAddress ip = InetAddress.getLocalHost();
        System.out.println("Your current host/IP adress is : " + ip);
        return "Hello" + ip;
    }
}

package com.viniciusaugusto.kubernetesjava.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/mem")
public class MemoryController {

    @GetMapping
    public String stressMemory() throws InterruptedException {
        List<String> list = new ArrayList<>();
        byte[] b = new byte[1000000];
        for (int i = 0; i <= 200; i++) {
            Thread.sleep(500);
            list.add(new String(b));
            System.out.println("Count = " + i);
        }
        return "OK";
    }
}

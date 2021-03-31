package com.viniciusaugusto.kubernetesjava.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cpu")
public class CpuController {

    public String stressCpu() throws InterruptedException {
        final int NUM_TESTS = 500;
        long start = System.nanoTime();
        for (int i = 0; i < NUM_TESTS; i++) {
            Thread.sleep(100);
            System.out.println("Count = " + i);
            spin(500);
        }
        System.out.println("Took" + (System.nanoTime() - start) / 1000000 +
                "ms (expected " + (NUM_TESTS * 500) + ")");
        return "OK";
    }

    private void spin(int milliseconds) {
        long sleepTime = milliseconds * 1000000L; // converting to nanoseconds
        long startTime = System.nanoTime();
        while ((System.nanoTime() - startTime) < sleepTime) {
        }
    }
}

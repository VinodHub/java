package com.example.logging;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class AsyncService {

    @Async("customExecutor")
    public void processTask() {
        System.out.println(Thread.currentThread().getName() + " is running a background task");
        for (int i = 0; i < 10; i++) {
            System.out.println("*****************");
        }
    }
}

package com.example.logging;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainRunner implements CommandLineRunner {

    private AsyncService myAsyncService;

    public MainRunner(AsyncService myAsyncService) {
        this.myAsyncService = myAsyncService;
    }

    @Override
    public void run(String... args) throws Exception {
        for (int i = 0; i < 1000; i++) {
            myAsyncService.processTask();
        }
        for (int i = 0; i < 100 ; i++) {
            System.out.println("8888888888888888888888");
        }
    }
}

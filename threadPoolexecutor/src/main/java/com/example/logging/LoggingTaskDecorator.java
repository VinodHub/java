package com.example.logging;

import org.springframework.core.task.TaskDecorator;
import org.springframework.stereotype.Component;

public class LoggingTaskDecorator implements TaskDecorator {
    @Override
    public Runnable decorate(Runnable runnable) {
        return () -> {
            long start = System.currentTimeMillis();
            try {
                runnable.run();
            } finally {
                long end = System.currentTimeMillis();
                System.out.println("Task completed in " + (end - start) + "ms");
            }
        };
    }

}

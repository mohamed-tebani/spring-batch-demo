package com.example.springbatch;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class Scheduler {

    @Autowired
    private BatchLauncher batchLauncher;

    @Scheduled(fixedDelay = 15000)
    public void perform() throws Exception {
        log.info("Batch programed to turn every 8 seconds");
        batchLauncher.run();
    }
}

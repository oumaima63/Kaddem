package com.esprit.alternance.kaddem.batch;

import com.esprit.alternance.kaddem.batch.BatchLauncher;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class Scheduler {

    private BatchLauncher batchLauncher;


    /*1. Lancer le batch (traitement de lots de données) grace au batch runner */

    @Scheduled(fixedRate = 30000)
    public void perform() throws Exception {

        log.info("Batch programmé pour tourner toutes les 5 minutes");
        batchLauncher.run();
    }
}
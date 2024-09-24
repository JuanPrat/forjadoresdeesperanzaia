package com.forjadoresdeesperanza.iaautomation.Jobs;

import com.forjadoresdeesperanza.iaautomation.IA.IAWorker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class PublishCronJob {

    @Autowired
    IAWorker iaWorker;

    @Scheduled(cron = "0 * * * * *")
    public void execute(){
        System.out.println(iaWorker.callIA("hola"));
    }
}

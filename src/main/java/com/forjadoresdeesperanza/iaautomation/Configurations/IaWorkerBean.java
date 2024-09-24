package com.forjadoresdeesperanza.iaautomation.Configurations;

import com.forjadoresdeesperanza.iaautomation.IA.IAWorker;
import org.springframework.ai.chat.client.ChatClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class IaWorkerBean {

    @Bean
    public IAWorker iaWorker(ChatClient.Builder chatClientBuilder){
        return new IAWorker(chatClientBuilder);
    }
}

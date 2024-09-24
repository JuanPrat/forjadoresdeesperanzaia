package com.forjadoresdeesperanza.iaautomation.IA;

import org.springframework.ai.chat.client.ChatClient;

import org.springframework.stereotype.Service;

@Service
public class IAWorker {
    private final ChatClient chatClient;

    public IAWorker(ChatClient.Builder chatClientBuilder) {
        this.chatClient = chatClientBuilder.build();
    }

    public String callIA(String userInput) {
        return this.chatClient.prompt()
                .user(userInput)
                .call()
                .content();
    }
}

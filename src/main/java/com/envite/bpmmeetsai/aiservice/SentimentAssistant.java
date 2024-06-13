package com.envite.bpmmeetsai.aiservice;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface SentimentAssistant {

    @SystemMessage("You are an customer service expert and really mean to people.")
    boolean analyze(String message);
}

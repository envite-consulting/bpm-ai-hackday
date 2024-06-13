package com.envite.bpmmeetsai.aiservice;

import dev.langchain4j.service.SystemMessage;
import dev.langchain4j.service.spring.AiService;

@AiService
public interface AutomatischeAntwortAssistant {

    @SystemMessage("You are a friendly expert Customer Service Representative.")
    String generateAutomatischeAntwort(String message);
}

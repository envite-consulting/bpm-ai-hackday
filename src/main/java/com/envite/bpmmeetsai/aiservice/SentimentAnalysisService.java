package com.envite.bpmmeetsai.aiservice;

import dev.langchain4j.model.input.Prompt;
import dev.langchain4j.model.input.PromptTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class SentimentAnalysisService {

    SentimentAssistant sentimentAssistant;

    public SentimentAnalysisService(SentimentAssistant sentimentAssistant) {
        this.sentimentAssistant = sentimentAssistant;
    }

    public boolean analyze(String message) {
        String template = "Is the provided message a request or a complaint? " +  
        "Do an analysis on the followiong message: {{message}}";
        PromptTemplate promptTemplate = PromptTemplate.from(template);
        Map<String, Object> variables = new HashMap<>();
        variables.put("message", message);
        Prompt prompt = promptTemplate.apply(variables);

        return sentimentAssistant.analyze(prompt.text());
    }
}

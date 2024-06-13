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

    public double analyze(String message) {
        String template = "Please provide a score between 0 and 1; "
            + "How negative (0) or positive (1) is the following message: {{message}}";
        PromptTemplate promptTemplate = PromptTemplate.from(template);
        Map<String, Object> variables = new HashMap<>();
        variables.put("message", message);
        Prompt prompt = promptTemplate.apply(variables);

        return sentimentAssistant.analyze(prompt.text());
    }
}

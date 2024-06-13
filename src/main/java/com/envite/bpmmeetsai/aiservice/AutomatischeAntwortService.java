package com.envite.bpmmeetsai.aiservice;

import dev.langchain4j.model.input.Prompt;
import dev.langchain4j.model.input.PromptTemplate;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

@Component
public class AutomatischeAntwortService {

    AutomatischeAntwortAssistant automatischeAntwortAssistant;

    public AutomatischeAntwortService(AutomatischeAntwortAssistant automatischeAntwortAssistant) {
        this.automatischeAntwortAssistant = automatischeAntwortAssistant;
    }

    public String automatischBeantworten(String message) {
        String template = "Answer the following customer service request considering our AGBs and Storinerungszeiträume. {{message}}";
        PromptTemplate promptTemplate = PromptTemplate.from(template);
        Map<String, Object> variables = new HashMap<>();
        variables.put("message", message);
        Prompt prompt = promptTemplate.apply(variables);

        return automatischeAntwortAssistant.generateAutomatischeAntwort(message);
    }
}

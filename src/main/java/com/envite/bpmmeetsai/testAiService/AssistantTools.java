package com.envite.bpmmeetsai.testAiService;

import dev.langchain4j.agent.tool.Tool;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
class AssistantTools {

    @Tool
    String currentTime() {
        return LocalDateTime.now().toString();
    }
}

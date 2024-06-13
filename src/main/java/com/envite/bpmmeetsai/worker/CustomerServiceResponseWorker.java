package com.envite.bpmmeetsai.worker;

import com.envite.bpmmeetsai.aiservice.SentimentAnalysisService;
import com.envite.bpmmeetsai.aiservice.SentimentAssistant;
import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.Map;

@Slf4j
@RequiredArgsConstructor
@Component
public class CustomerServiceResponseWorker {

    private final SentimentAnalysisService sentimentAnalysisService;

    @JobWorker(name = "analyzeAnswer")
    public void analyzeAnswer(final JobClient client, final ActivatedJob job) {
        final Map<String, Object> variables = job.getVariablesAsMap();
        final String answer = (String) variables.get("OutputVariable_customerServiceAnswer");
        String analysis = sentimentAnalysisService.analyze(answer);
        log.info("Received answer '{}' for message '{}", analysis, answer);
        client.newCompleteCommand(job.getKey()).send().join();
    }
}

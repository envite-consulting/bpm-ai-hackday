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

    @JobWorker(name = "analysiereAnfrage")
    public void analysiereAnfrage(final JobClient client, final ActivatedJob job) {
        final Map<String, Object> variables = job.getVariablesAsMap();
        final String message = (String) variables.get("OutputVariable_kundenAnfrage");
        boolean analysis = sentimentAnalysisService.analyze(message);
        log.info("Received answer '{}' for message '{}", analysis, message);
        client.newCompleteCommand(job.getKey()).variable("anfrageIsBeschwerde", analysis).send().join();
    }
}

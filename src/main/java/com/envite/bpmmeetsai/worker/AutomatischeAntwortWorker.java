package com.envite.bpmmeetsai.worker;

import com.envite.bpmmeetsai.aiservice.AutomatischeAntwortService;
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
public class AutomatischeAntwortWorker {

    private final AutomatischeAntwortService automatischeAntwortService;

    @JobWorker(name = "automatischBeantworten", autoComplete = false)
    public void automatischBeantworten(final JobClient client, final ActivatedJob job) {
        final Map<String, Object> variables = job.getVariablesAsMap();
        final String message = (String) variables.get("OutputVariable_kundenAnfrage");
        String automatischeAntwort = automatischeAntwortService.automatischBeantworten(message);
        log.info("Received answer '{}' for message '{}", automatischeAntwort, message);
        client.newCompleteCommand(job.getKey()).variable("automatischeAntwort", automatischeAntwort).send().join();
    }
}

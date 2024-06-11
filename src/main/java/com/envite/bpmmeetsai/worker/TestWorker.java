package com.envite.bpmmeetsai.worker;

import io.camunda.zeebe.spring.client.annotation.JobWorker;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class TestWorker {

    @JobWorker(type = "testWorker")
    public void testMethod() {
        log.info("TestWorker.testMethod called");
    }
}

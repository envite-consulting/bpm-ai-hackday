package com.envite.bpmmeetsai.aiservice;

import com.envite.bpmmeetsai.model.Buchung;
import com.envite.bpmmeetsai.model.BuchungRepository;
import dev.langchain4j.agent.tool.Tool;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class BuchungRepoTool {

    private final BuchungRepository buchungRepository;

    @Tool("Searches for a booking using a bookingId")
    public Buchung searchBooking(String bookingId) {
        log.info("Searching for booking with ID {}", bookingId);
        return buchungRepository.getBuchungById(bookingId);
    }
}

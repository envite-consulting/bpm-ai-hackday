package com.envite.bpmmeetsai.model;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@RequiredArgsConstructor
public class BuchungRepository {

    public Buchung getBuchungById(String buchungId) {
        if (buchungId.equals("100")) {
            return new Buchung("100", "100", LocalDate.parse("2024-01-01"), LocalDate.parse("2025-01-10"), 100.0);
        } else if (buchungId.equals("200")) {
            return new Buchung("200", "100",  LocalDate.parse("2024-06-5"), LocalDate.parse("2024-06-15"), 100.0);
        } else {
            return new Buchung("300", "200",  LocalDate.parse("2024-01-02"), LocalDate.parse("2026-01-12"), 200.0);
        }
    }
}
package com.envite.bpmmeetsai.model;

import lombok.RequiredArgsConstructor;

import java.time.LocalDate;

@RequiredArgsConstructor
public class Buchung {

    private final String buchungsId;
    private final String kundeId;
    private final LocalDate buchungsDatum;
    private final LocalDate reiseDatum;
    private final double preis;

}

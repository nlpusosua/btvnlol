package com.company;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class SummonRift {
    private ArrayList<SKT>skts;
    private ArrayList<G2>g2s;
    private LocalDateTime timeMatch;

    public SummonRift(ArrayList<SKT> skts, ArrayList<G2> g2s, LocalDateTime timeMatch) {
        this.skts = skts;
        this.g2s = g2s;
        this.timeMatch = timeMatch;
    }

    @Override
    public String toString() {
        return "SummonRift{" +
                "skts=" + skts +
                ", g2s=" + g2s +
                ", timeMatch=" + timeMatch +
                '}';
    }
}

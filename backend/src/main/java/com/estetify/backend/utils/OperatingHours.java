package com.estetify.backend.utils;

import com.estetify.backend.utils.enums.Week;

import java.time.format.DateTimeFormatter;

public class OperatingHours {
    private Week week;
    private DateTimeFormatter hours;

    public OperatingHours(Week week, DateTimeFormatter hours) {
        this.week = week;
        this.hours = hours;
    }
}

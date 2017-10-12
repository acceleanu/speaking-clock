package com.wowcher;

import java.util.Optional;

import static java.util.Optional.empty;

public class MiddayStrategy implements ClockStrategy {
    @Override
    public Optional<String> toEnglish(int hours, int minutes) {
        if(hours == 12 && minutes == 0) {
            return Optional.of("midday");
        }
        return empty();
    }
}

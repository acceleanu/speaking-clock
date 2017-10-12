package com.wowcher;

import java.util.Optional;

import static java.util.Optional.empty;

public class MidnightStrategy implements ClockStrategy {
    @Override
    public Optional<String> toEnglish(int hours, int minutes) {
        if(hours == 0 && minutes == 0) {
            return Optional.of("midnight");
        }
        return empty();
    }
}

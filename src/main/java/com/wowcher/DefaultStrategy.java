package com.wowcher;

import java.util.Optional;

import static com.wowcher.NumberToEnglish.numberToEnglish;

public class DefaultStrategy implements ClockStrategy {
    @Override
    public Optional<String> toEnglish(int hours, int minutes) {
        StringBuilder result = new StringBuilder();
        result.append(numberToEnglish(hours))
            .append(" ")
            .append(numberToEnglish(minutes))
            ;

        return Optional.of(result.toString());
    }
}

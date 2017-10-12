package com.wowcher;

import java.util.List;
import java.util.stream.Stream;

import static java.lang.String.format;

public class SpeakingClock {
    private List<ClockStrategy> strategies;

    public SpeakingClock(List<ClockStrategy> strategies) {
        this.strategies = strategies;
    }

    public String timeToEnglish(String numericTime) {
        String[] vtime = numericTime.split(":");
        int hours = Integer.parseInt(vtime[0]);
        int minutes = Integer.parseInt(vtime[1]);

        StringBuilder result = new StringBuilder("It's ");
        String timeInEnglish = strategies.stream()
            .flatMap(s ->
                s.toEnglish(hours, minutes)
                    .map(Stream::of)
                    .orElse(Stream.empty())
            )
            .findFirst()
            .orElseThrow(() -> new IllegalStateException(
                    format("Missing strategy for (hours=%s, minutes=%s)", hours, minutes)
            ));
        return result.append(timeInEnglish).toString();
    }
}

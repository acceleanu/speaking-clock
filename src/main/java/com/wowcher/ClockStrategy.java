package com.wowcher;

import java.util.Optional;

public interface ClockStrategy {
    Optional<String> toEnglish(int hours, int minutes);
}

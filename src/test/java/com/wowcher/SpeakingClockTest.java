package com.wowcher;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.wowcher.SpeakingClock.timeToEnglish;
import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class SpeakingClockTest {
    @Test
    @Parameters({
            "08:34, It's eight thirty four",
            "12:00, It's midday",
            "00:00, It's midnight",
            "21:10, It's twenty one ten",
            "21:01, It's twenty one one",
    })
    public void convertNumericTimeToEnglish(String numericTime, String timeInEnglish) {
        assertThat(timeToEnglish(numericTime)).isEqualTo(timeInEnglish);
    }
}
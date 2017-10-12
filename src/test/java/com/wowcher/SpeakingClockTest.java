package com.wowcher;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class SpeakingClockTest {
    private SpeakingClock speakingClock;

    @Before
    public void setUp() throws Exception {
        List<ClockStrategy> clockStrategies = new ArrayList<>();
        clockStrategies.add(new MiddayStrategy());
        clockStrategies.add(new MidnightStrategy());
        clockStrategies.add(new DefaultStrategy());
        speakingClock = new SpeakingClock(clockStrategies);
    }

    @Test
    @Parameters({
            "08:34, It's eight thirty four",
            "12:00, It's midday",
            "00:00, It's midnight",
            "21:10, It's twenty one ten",
            "21:01, It's twenty one one",
    })
    public void convertNumericTimeToEnglish(String numericTime, String timeInEnglish) {
        assertThat(speakingClock.timeToEnglish(numericTime)).isEqualTo(timeInEnglish);
    }
}
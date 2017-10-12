package com.wowcher;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static com.wowcher.NumberToEnglish.numberToEnglish;
import static org.assertj.core.api.Assertions.assertThat;

@RunWith(JUnitParamsRunner.class)
public class NumberToEnglishTest {
    @Test
    @Parameters({
        "1, one",
        "2, two",
        "3, three",
        "4, four",
        "5, five",
        "6, six",
        "7, seven",
        "8, eight",
        "9, nine",
        "10, ten",
        "11, eleven",
        "12, twelve",
        "13, thirteen",
        "14, fourteen",
        "15, fifteen",
        "16, sixteen",
        "17, seventeen",
        "18, eighteen",
        "19, nineteen",
        "20, twenty",
        "21, twenty one",
        "30, thirty",
        "40, forty",
        "50, fifty",
        "57, fifty seven",
        "59, fifty nine",
    })
    public void convertNumberToEnglishTest(int number, String englishNumber) throws Exception {
        assertThat(numberToEnglish(number)).isEqualTo(englishNumber);
    }
}

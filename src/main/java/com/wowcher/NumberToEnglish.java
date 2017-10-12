package com.wowcher;

import java.util.LinkedHashMap;
import java.util.Map;

public class NumberToEnglish {
    private static final Map<Integer, String> ONE_TO_NINETEEN_MAP = new LinkedHashMap<>();

    static {
        ONE_TO_NINETEEN_MAP.put(1, "one");
        ONE_TO_NINETEEN_MAP.put(2, "two");
        ONE_TO_NINETEEN_MAP.put(3, "three");
        ONE_TO_NINETEEN_MAP.put(4, "four");
        ONE_TO_NINETEEN_MAP.put(5, "five");
        ONE_TO_NINETEEN_MAP.put(6, "six");
        ONE_TO_NINETEEN_MAP.put(7, "seven");
        ONE_TO_NINETEEN_MAP.put(8, "eight");
        ONE_TO_NINETEEN_MAP.put(9, "nine");
        ONE_TO_NINETEEN_MAP.put(10, "ten");
        ONE_TO_NINETEEN_MAP.put(11, "eleven");
        ONE_TO_NINETEEN_MAP.put(12, "twelve");
        ONE_TO_NINETEEN_MAP.put(13, "thirteen");
        ONE_TO_NINETEEN_MAP.put(14, "fourteen");
        ONE_TO_NINETEEN_MAP.put(15, "fifteen");
        ONE_TO_NINETEEN_MAP.put(16, "sixteen");
        ONE_TO_NINETEEN_MAP.put(17, "seventeen");
        ONE_TO_NINETEEN_MAP.put(18, "eighteen");
        ONE_TO_NINETEEN_MAP.put(19, "nineteen");
    }

    private static final Map<Integer, String> MULTIPLES_OF_TEN_MAP = new LinkedHashMap<>();

    static {
        MULTIPLES_OF_TEN_MAP.put(20, "twenty");
        MULTIPLES_OF_TEN_MAP.put(30, "thirty");
        MULTIPLES_OF_TEN_MAP.put(40, "forty");
        MULTIPLES_OF_TEN_MAP.put(50, "fifty");
    }

    public static String numberToEnglish(int number) {
        if (number == 0) {
            throw notImplemented(number);
        }
        if (number < 20) {
            return ONE_TO_NINETEEN_MAP.get(number);
        }
        if (number < 60) {
            if (number % 10 == 0) {
                return MULTIPLES_OF_TEN_MAP.get(number);
            }
            return
                new StringBuilder()
                    .append(numberToEnglish(number - number % 10))
                    .append(" ")
                    .append(numberToEnglish(number % 10))
                    .toString();
        }
        throw notImplemented(number);
    }

    private static IllegalArgumentException notImplemented(int number) {
        return new IllegalArgumentException("Not implemented for " + number);
    }
}

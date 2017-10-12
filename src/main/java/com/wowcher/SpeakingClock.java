package com.wowcher;

import static com.wowcher.NumberToEnglish.numberToEnglish;

public class SpeakingClock {
    public static String timeToEnglish(String numericTime) {
        StringBuilder result = new StringBuilder("It's ");

        switch (numericTime) {
            case "00:00":
                return result.append("midnight").toString();
            case "12:00":
                return result.append("midday").toString();
            default:
                String[] vtime = numericTime.split(":");
                int hours = Integer.parseInt(vtime[0]);
                int minutes = Integer.parseInt(vtime[1]);

                return result.append(numberToEnglish(hours))
                    .append(" ")
                    .append(numberToEnglish(minutes))
                    .toString();
        }
    }
}

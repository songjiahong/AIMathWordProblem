package com.balance.aimath;

import java.util.Map;
import java.util.Random;

public class Solver {
    public static String evaluate(String inputSentence) {
        if (inputSentence == null || inputSentence.trim().isEmpty()) {
            return getRandomError();
        }
        for (Map.Entry<String, String> entry : ResponseConstant.mapRes.entrySet()) {
            if (inputSentence.contains(entry.getKey())) {
                return entry.getValue();
            }
        }

        return getRandomError();
    }

    private static String getRandomError() {
        int errorLen = ResponseConstant.error.length;
        Random r = new Random();
        return ResponseConstant.error[r.nextInt(errorLen)];
    }
}

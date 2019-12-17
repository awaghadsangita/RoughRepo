package com.bridgelabz;

public class moodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }

    }

}
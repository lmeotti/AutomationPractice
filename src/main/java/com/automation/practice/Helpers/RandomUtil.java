package com.automation.practice.Helpers;

import java.util.UUID;

public class RandomUtil {

    public static String email() {
        UUID uuid = UUID.randomUUID();
        String myRandom = uuid.toString();
        return myRandom.substring(0,16).concat("@mailinator.com");
    }
}

package com.kodilla.beanlifecycle.utils;

import java.util.Random;

public final class RandomString {
    private static final String CHARACTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final Random random = new Random();
    private RandomString() {
        throw new AssertionError("This class cannot be instantiated.");
    }

    public static  String create(int nchars) {
        String result = "";
        for(int i = 0; i < nchars; i++) {
            result += CHARACTERS.charAt(random.nextInt(CHARACTERS.length()));
        }
        return result;
    }
}

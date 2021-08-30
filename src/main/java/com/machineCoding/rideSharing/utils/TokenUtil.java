package com.machineCoding.rideSharing.utils;

import org.apache.commons.lang3.RandomStringUtils;

public class TokenUtil {
    private static int DEFAULT_RANDOM_TOKEN_LENGTH  = 6;

    private static String generateRandomToken(int length) {
        return RandomStringUtils.randomAlphanumeric(length);
    }

    public static String generateRandomTokenDefaultLength() {
        return generateRandomToken(DEFAULT_RANDOM_TOKEN_LENGTH);
    }
}

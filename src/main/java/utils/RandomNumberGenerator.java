package utils;

import java.util.Random;

public class RandomNumberGenerator {

    private RandomNumberGenerator() {
    }

    private static final Random random = new Random();

    public static String generateRandomNumber(int length) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int i1 = random.nextInt(10);
            sb.append(i1);
        }
        return sb.toString();
    }
}

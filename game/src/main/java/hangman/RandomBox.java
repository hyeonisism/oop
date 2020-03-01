package hangman;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public final class RandomBox {

    private static List<String> randomWord;

    private static final int MAXIMUM_COUNT = 10;
    private static final int MINIMUM_COUNT = 5;

    static {
        randomWord = Arrays.asList(
                "HELLO", "WORLD", "ANIMAL", "MONKEY"
        );
    }

    public static String getRandomWord() {
        Collections.shuffle(randomWord);
        return randomWord.get(0);
    }

    public static int getRandomCount() {
        return (int) (Math.random() * MAXIMUM_COUNT) + MINIMUM_COUNT;
    }
}

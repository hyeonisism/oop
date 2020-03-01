package hangman;

import java.util.ArrayList;
import java.util.List;

public class Word {

    private String value;

    public static Word of(String answer) {
        return new Word(answer);
    }

    private Word(String value) {
        this.value = value;
    }

    public boolean has(Character character) {
        for (int i = 0; i < value.toCharArray().length; i++) {
            if (Character.toLowerCase(value.charAt(i)) == Character.toLowerCase(character))
                return true;
        }
        return false;
    }

    public List<Integer> getIndexesBy(Character character) {
        List<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < value.toCharArray().length; i++) {
            if (Character.toLowerCase(value.charAt(i)) == Character.toLowerCase(character))
                indexes.add(i);
        }
        return indexes;
    }

    public boolean matches(String answer) {
        return value.equalsIgnoreCase(answer);
    }
}

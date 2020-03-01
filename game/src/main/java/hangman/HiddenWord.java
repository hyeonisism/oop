package hangman;

import java.util.Arrays;
import java.util.List;

public class HiddenWord {

    private static final Character HIDDEN_SIGNATURE = '*';

    private Character[] value;

    public static HiddenWord of(int length) {
        Character[] value = new Character[length];
        for (int i = 0; i < length; i++) {
            value[i] = HIDDEN_SIGNATURE;
        }
        return new HiddenWord(value);
    }

    private HiddenWord(Character[] value) {
        this.value = value;
    }

    public void open(List<Integer> indexes, Character character) {
        for (Integer index : indexes) {
            value[index] = character;
        }
    }

    @Override
    public String toString() {
        return "HiddenWord{" +
                "value=" + Arrays.toString(value) +
                '}';
    }
}

package hangman;

import java.util.List;

public class Answer {

    private Word correctWord;
    private HiddenWord hiddenWord;

    public Answer(String answer) {
        correctWord = Word.of(answer);
        hiddenWord = HiddenWord.of(answer.length());
    }

    public boolean match(Character character) {
        return correctWord.has(character);
    }

    public boolean match(String answer) {
        return correctWord.matches(answer);
    }

    public void openHiddenWord(Character character) {
        List<Integer> indexes = correctWord.getIndexesBy(character);
        hiddenWord.open(indexes, character);
    }

    public String getHiddenWord() {
        return hiddenWord.toString();
    }
}

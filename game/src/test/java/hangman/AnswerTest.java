package hangman;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.assertj.core.api.Assertions.assertThat;

public class AnswerTest {

    private Answer defaultAnswer;

    @BeforeEach
    void setUp() {
        defaultAnswer = new Answer("Hangman");
    }

    @ParameterizedTest
    @ValueSource(chars = {'h', 'a', 'n', 'g', 'm'})
    void guessCharacterWithTrueValue(Character character) {
        assertThat(defaultAnswer.match(character)).isTrue();
    }

    @ParameterizedTest
    @ValueSource(chars = {'w', 'x', 'y', 'z'})
    void guessCharacterWithFalseValue(Character character) {
        assertThat(defaultAnswer.match(character)).isFalse();
    }

    @Test
    void guessStringWithTrueValue() {
        assertThat(defaultAnswer.match("Hangman")).isTrue();
    }

    @Test
    void guessStringWithFalseValue() {
        assertThat(defaultAnswer.match("Hangmane")).isFalse();
    }
}

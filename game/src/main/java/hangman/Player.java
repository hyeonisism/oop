package hangman;

import java.io.InputStream;
import java.util.Scanner;

public class Player {

    private Scanner scanner;

    public Player(InputStream inputStream) {
        this.scanner = new Scanner(inputStream);
    }

    public String sayAnswer() {
        return scanner.next();
    }

    public Character sayGuess() {
        return scanner.next().charAt(0);
    }

}

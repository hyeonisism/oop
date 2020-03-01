package hangman;

import java.io.InputStream;

public class Game {

    private GameMaster gameMaster;
    private Player player;

    public Game(InputStream inputStream) {
        this.player = new Player(inputStream);
        this.gameMaster = new GameMaster(RandomBox.getRandomWord(), RandomBox.getRandomCount());
    }

    public void start() {

        gameMaster.sayHi();

        while (gameMaster.isGameOver()) {
            System.out.println("문자를 추측해주세요");
            if (gameMaster.requestGuess(player.sayGuess())) {
                gameMaster.sayHiddenWord();
            } else {
                gameMaster.sayJoke();
            }

            System.out.println("답을 맞춰주세요");

            if (gameMaster.requestAnswer(player.sayAnswer())) {
                break;
            } else {
                gameMaster.decreaseCount();
                gameMaster.countCheck();
                gameMaster.sayJoke();

                System.out.println("남은 카운트 : " + gameMaster.getCount());
            }
        }

        gameMaster.sayBye();

    }
}

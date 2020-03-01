package hangman;

import static hangman.GameMaster.Status.ON;
import static hangman.GameMaster.Status.OVER;

public class GameMaster {

    private Status status = ON;
    private Answer answer;
    private int count;

    public GameMaster(final String answer, final int count) {
        this.answer = new Answer(answer);
        this.count = count;
    }

    public boolean requestGuess(Character request) {
        if (answer.match(request)) {
            answer.openHiddenWord(request);
            return true;
        }
        return false;
    }

    public boolean requestAnswer(String request) {
        if (answer.match(request)) {
            status = OVER;
            return true;
        }
        return false;
    }

    public void decreaseCount() {
        count--;
    }

    public int getCount() {
        return this.count;
    }

    public void countCheck() {
        if (count == 0) {
            status = OVER;
        }
    }

    public boolean isGameOver() {
        return status == ON;
    }

    public boolean isWin() {
        return status == OVER && count == 0;
    }

    public void sayHi() {
        System.out.format("+------------------------+%n");
        System.out.format("| HANGMAN GAME | START   |%n");
        System.out.format("+------------------------+%n");
    }

    public void sayBye() {
        if(isWin())
            System.out.println("좀 더 연습하고 오세요");
        System.out.println("잘 하시는 군요");
    }

    public void sayHiddenWord() {
        System.out.println("후,,, " + answer.getHiddenWord() + "입니다.");
    }

    public void sayJoke(){
        System.out.println("ㅋㅋㅋㅋ 틀렸습니다");
    }

    enum Status {
        ON, OVER
    }
}

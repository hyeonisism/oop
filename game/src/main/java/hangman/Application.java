package hangman;

public class Application {

    public static void main(String[] args) {
        new Application().run();
    }

    private void run() {
        new Game(System.in).start();
    }
}

package multithreading.guesspasswordgame;

public class Vault {
    private int password;

    public Vault(int password) {
        this.password = password;
    }

    public boolean isCorrectPassword(int guess) {
        try {
            Thread.sleep(5);
        } catch (Exception e) {

        }
        return this.password == guess;
    }
}

//package multithreading.thread.guesspasswordgame.hacker;
//
//import multithreading.thread.guesspasswordgame.Main;
//import multithreading.thread.guesspasswordgame.Vault;
//
//public class AscendingHacker extends HackerThread {
//
//    public AscendingHacker(Vault vault) {
//        super(vault);
//    }
//
//    @Override
//    public void run() {
//        for (int guess = 0; guess < Main.MAX_PASSWORD; ++guess) {
//            if (vault.isCorrectPassword(guess)) {
//                System.out.println(this.getName() + " guessed the password " + guess);
//                System.exit(0);
//            }
//        }
//    }
//}

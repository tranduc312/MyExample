//package multithreading.thread.guesspasswordgame.hacker;
//
//import multithreading.thread.guesspasswordgame.Main;
//import multithreading.thread.guesspasswordgame.Vault;
//
//public class DescendingHacker extends HackerThread {
//
//    public DescendingHacker(Vault vault) {
//        super(vault);
//    }
//
//    @Override
//    public void run() {
//        for (int guess = Main.MAX_PASSWORD; guess >= 0; --guess) {
//            if (vault.isCorrectPassword(guess)) {
//                System.out.println(this.getName() + " guessed the password " + guess);
//                System.exit(0);
//            }
//        }
//    }
//}

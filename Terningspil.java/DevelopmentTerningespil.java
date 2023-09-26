import java.util.Random;

public class DevelopmentTerningespil {
    private static final int WINNING_SCORE = 40;

    public static void playGame(DevelopmentPlayer player1, DevelopmentPlayer player2) {
        Random random = new Random();

        while (true) {
            playTurn(player1, random);
            if (player1.getScore() >= WINNING_SCORE) {
                announceWinner(player1);
                break;
            }

            playTurn(player2, random);
            if (player2.getScore() >= WINNING_SCORE) {
                announceWinner(player2);
                break;
            }
        }
    }

    private static void playTurn(DevelopmentPlayer player, Random random) {
        System.out.println(player.getName() + "'s turn.");
        int roll1 = random.nextInt(6) + 1;
        int roll2 = random.nextInt(6) + 1;
        int turnScore = roll1 + roll2;
        player.addScore(turnScore);

        System.out.println("You rolled " + roll1 + " and " + roll2 + " for a total of " + turnScore + " points.");
        System.out.println("Your score is " + player.getScore() + " points.");
    }

    private static void announceWinner(DevelopmentPlayer player) {
        System.out.println(player.getName() + " has won!");
    }
}

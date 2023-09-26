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
        System.out.println(player.getName() + "'s tur.");
        int roll1 = random.nextInt(6) + 1;
        int roll2 = random.nextInt(6) + 1;
        int turnScore = roll1 + roll2;
        player.addScore(turnScore);

        System.out.println("du slog " + roll1 + " og " + roll2 + " i alt " + turnScore + " points.");
        System.out.println("din score er " + player.getScore() + " points.");
    }

    private static void announceWinner(DevelopmentPlayer player) {
        System.out.println(player.getName() + " Har vundet!");
    }
}

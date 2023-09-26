
    import java.util.Random;
import java.util.Scanner;
public class Development {
      private static final int WINNING_SCORE = 40;
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

   
        System.out.println("Indtast spiller 1's navn:");
        String player1Name = scanner.nextLine();
        System.out.println("Indtast spiller 2's name:");
        String player2Name = scanner.nextLine();

 
        Random random = new Random();

        int player1Score = 0;
        int player2Score = 0;

        while (true) {


            System.out.println( player1Name + "'s tur.");
            int player1Roll1 = random.nextInt(6) + 1;
            int player1Roll2 = random.nextInt(6) + 1;
            int player1TurnScore = player1Roll1 + player1Roll2;
            player1Score += player1TurnScore;
            System.out.println("Du slog en " + player1Roll1  +  " og en " + player1Roll2  +  " i alt " + player1TurnScore + " point.");
            System.out.println("Din score er " + player1Score + " point.");

            if (player1Score >= WINNING_SCORE) {
                System.out.println(player1Name + " har vundet!");
                break;
            }

            System.out.println( player2Name + "'s tur.");
            int player2Roll1 = random.nextInt(6) + 1;
            int player2Roll2 = random.nextInt(6) + 1;
            int player2TurnScore = player2Roll1 + player2Roll2;
            player2Score += player2TurnScore;
            System.out.println("Du slog " + player2Roll1 +   " og en " + player2Roll2  +  " i alt " + player2TurnScore + " point.");
            System.out.println("Din score er " + player2Score + " point.");

            if (player2Score >= WINNING_SCORE) {
                System.out.println(player2Name + " har vundet!");
                break;
            }
        }

        scanner.close();
    }
}

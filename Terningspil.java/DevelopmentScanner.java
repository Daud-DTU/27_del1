import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter player 1's name:");
        String player1Name = scanner.nextLine();
        Player player1 = new Player(player1Name);

        System.out.println("Enter player 2's name:");
        String player2Name = scanner.nextLine();
        Player player2 = new Player(player2Name);

        scanner.close();

        DiceGame.playGame(player1, player2);
    }
}

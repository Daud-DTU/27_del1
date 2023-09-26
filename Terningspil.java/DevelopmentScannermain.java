import java.util.Scanner;

public class DevelopmentScannermain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter player 1's name:");
        String player1Name = scanner.nextLine();
        DevelopmentPlayer player1 = new DevelopmentPlayer(player1Name);

        System.out.println("Enter player 2's name:");
        String player2Name = scanner.nextLine();
        DevelopmentPlayer player2 = new DevelopmentPlayer(player2Name);

        scanner.close();

        DevelopmentTerningespil.playGame(player1, player2);
    }
}

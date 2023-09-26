import java.util.Scanner;

public class DevelopmentScannermain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Indtast spiller 1's navn:");
        String player1Name = scanner.nextLine();
        DevelopmentPlayer player1 = new DevelopmentPlayer(player1Name);

        System.out.println("Indtast spiller 2's navn:");
        String player2Name = scanner.nextLine();
        DevelopmentPlayer player2 = new DevelopmentPlayer(player2Name);

        scanner.close();

        DevelopmentTerningespil.playGame(player1, player2);
    }
}

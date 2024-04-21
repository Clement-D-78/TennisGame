import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nom du joueur 1 :");
        String player1Name = scanner.nextLine();

        System.out.println("Nom du joueur 2 :");
        String player2Name = scanner.nextLine();

        TennisGame tennisGame = new TennisGame(player1Name, player2Name);

        while (true) {
            System.out.println("Entrer le joueur qui vient de marqué (1 pour " + player1Name + ", 2 pour " + player2Name + ", q pour quitté):");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("q")) {
                break;
            }

            if (input.equals("1")) {
                tennisGame.player1Scores();
            } else if (input.equals("2")) {
                tennisGame.player2Scores();
            } else {
                System.out.println("Mauvaise entrée dans la console.");
                continue;
            }


            tennisGame.winSetMatch();
            System.out.println(tennisGame.getTotalScore());
            System.out.println("\n");

        }

        scanner.close();
    }
}

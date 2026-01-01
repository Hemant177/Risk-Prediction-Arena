import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of players:");
        int n = sc.nextInt();
        sc.nextLine();

        Player[] players = new Player[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter player " + (i + 1) + " name:");
            String name = sc.nextLine();
            players[i] = new Player(name, 100); // initial score
        }

        GameEngine engine = new GameEngine(players, 5);
        engine.startGame();

        sc.close();
    }
}

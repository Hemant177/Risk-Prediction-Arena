import java.util.Scanner;

public class GameEngine {

    private Player[] players;
    private int rounds;

    public GameEngine(Player[] players, int rounds) {
        this.players = players;
        this.rounds = rounds;
    }

    public void startGame() {
        Scanner sc = new Scanner(System.in);

        for (int round = 1; round <= rounds; round++) {
            System.out.println("\n=== ROUND " + round + " ===");

            // 1️⃣ Generate scenario
            RiskScenario scenario = Utils.getRandomScenario();
            System.out.println("Scenario: " + scenario.getDescription());

            // Arrays to store inputs secretly
            RiskLevel[] predictions = new RiskLevel[players.length];
            int[] stakes = new int[players.length];

            // 2️⃣ Take ALL predictions first (no result shown)
            for (int i = 0; i < players.length; i++) {
                System.out.println(players[i].getName() +
                        " enter prediction (LOW / MEDIUM / HIGH) [Others look away]: ");
                predictions[i] = RiskLevel.valueOf(sc.next().toUpperCase());
            }

            // 3️⃣ Take ALL stakes
            for (int i = 0; i < players.length; i++) {
                System.out.println(players[i].getName() +
                        " enter stake points [Others look away]: ");
                stakes[i] = sc.nextInt();
            }

            // 4️⃣ System decides actual risk
            RiskLevel actualRisk = scenario.generateActualRisk();
            System.out.println("\nActual Risk was: " + actualRisk);

            // 5️⃣ Evaluate results
            for (int i = 0; i < players.length; i++) {
                if (predictions[i] == actualRisk) {
                    players[i].updateScore(stakes[i]);
                    System.out.println(players[i].getName() +
                            " ✔ Correct! +" + stakes[i]);
                } else {
                    players[i].updateScore(-stakes[i]);
                    System.out.println(players[i].getName() +
                            " ✘ Wrong! -" + stakes[i]);
                }
            }

            // 6️⃣ Show scoreboard after each round
            ScoreBoard.display(players);
        }

        announceWinner();
        sc.close();
    }

    private void announceWinner() {
        Player winner = players[0];

        for (Player p : players) {
            if (p.getScore() > winner.getScore()) {
                winner = p;
            }
        }

        System.out.println("🏆 WINNER: " + winner.getName() +
                " with score " + winner.getScore());
    }
}

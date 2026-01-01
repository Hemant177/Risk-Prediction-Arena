import java.util.Scanner;

public class Player {
    private String name;
    private int score;

    public Player(String name, int initialScore) {
        this.name = name;
        this.score = initialScore;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void updateScore(int value) {
        this.score += value;
    }

    public RiskLevel predictRisk(Scanner sc) {
        System.out.println(name + " predict risk (LOW / MEDIUM / HIGH): ");
        return RiskLevel.valueOf(sc.next().toUpperCase());
    }

    public int placeStake(Scanner sc) {
        System.out.println(name + " enter stake points: ");
        return sc.nextInt();
    }
}

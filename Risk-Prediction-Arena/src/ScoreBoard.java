public class ScoreBoard {

    public static void display(Player[] players) {
        System.out.println("\n--- SCOREBOARD ---");
        for (Player p : players) {
            System.out.println(p.getName() + " : " + p.getScore());
        }
        System.out.println("------------------\n");
    }
}

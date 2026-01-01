import java.util.Random;

public class Utils {

    public static RiskScenario getRandomScenario() {
        int choice = new Random().nextInt(3);
        switch (choice) {
            case 0: return new MarketCrashScenario();
            case 1: return new WeatherRiskScenario();
            default: return new SystemFailureScenario();
        }
    }
}

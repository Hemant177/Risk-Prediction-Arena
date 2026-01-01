import java.util.Random;

public abstract class RiskScenario {
    protected String description;

    public String getDescription() {
        return description;
    }

    public abstract RiskLevel generateActualRisk();

    protected RiskLevel randomRisk() {
        RiskLevel[] levels = RiskLevel.values();
        return levels[new Random().nextInt(levels.length)];
    }
}

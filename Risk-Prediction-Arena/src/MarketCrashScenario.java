public class MarketCrashScenario extends RiskScenario {

    public MarketCrashScenario() {
        description = "Stock market instability detected";
    }

    @Override
    public RiskLevel generateActualRisk() {
        return randomRisk();
    }
}

public class WeatherRiskScenario extends RiskScenario {

    public WeatherRiskScenario() {
        description = "Severe weather forecast warning";
    }

    @Override
    public RiskLevel generateActualRisk() {
        return randomRisk();
    }
}

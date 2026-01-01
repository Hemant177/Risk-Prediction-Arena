public class SystemFailureScenario extends RiskScenario {

    public SystemFailureScenario() {
        description = "Critical server overload detected";
    }

    @Override
    public RiskLevel generateActualRisk() {
        return randomRisk();
    }
}

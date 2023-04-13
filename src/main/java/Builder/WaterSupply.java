package Builder;

public class WaterSupply {
    private String waterSupply;
    private String centralizedWaterSupply = "centralizedWaterSupply";
    private String autonomousWaterSupply = "autonomousWaterSupply";

    public void waterSupply(int waterSupply) {
        if (waterSupply == 1) {
            this.waterSupply = autonomousWaterSupply;
        } else {
            this.waterSupply = autonomousWaterSupply + ", " + centralizedWaterSupply;
        }
    }

    public String getWaterSupply() {
        return waterSupply;
    }

    public String getCentralizedWaterSupply() {
        return centralizedWaterSupply;
    }

    public String getAutonomousWaterSupply() {
        return autonomousWaterSupply;
    }
}

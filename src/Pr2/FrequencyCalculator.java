public class FrequencyCalculator {
    public static double calculateHeartRate(double bodyTemperature, double physiologicalNormTemperature) {
        return (bodyTemperature - physiologicalNormTemperature) * 10;
    }
}
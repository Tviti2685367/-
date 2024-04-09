public class HeartRateCalculator {
    private static HeartRateCalculator instance;

    // Private constructor to prevent instantiation from outside
    private HeartRateCalculator() {
    }

    // Singleton getInstance() method
    public static HeartRateCalculator getInstance() {
        if (instance == null) {
            instance = new HeartRateCalculator();
        }
        return instance;
    }

    // Method to calculate heart rate based on body temperature and physiological norm temperature
    public double calculateHeartRate(double bodyTemperature, double physiologicalNormTemperature) {
        return (bodyTemperature - physiologicalNormTemperature) * 10;
    }
}

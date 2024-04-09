public class EnergyCalculator {
    public static double calculateTotalEnergy(double mass, double velocity, double height) {
        return mass * velocity * velocity / 2 + mass * 9.81 * height;
    }
}
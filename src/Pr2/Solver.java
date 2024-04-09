
import java.util.Scanner;

public class Solver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter body temperature:");
        double bodyTemperature = scanner.nextDouble();

        System.out.println("Enter physiological norm temperature:");
        double physiologicalNormTemperature = scanner.nextDouble();

        HeartRateCalculator calculator = HeartRateCalculator.getInstance();
        double heartRate = calculator.calculateHeartRate(bodyTemperature, physiologicalNormTemperature);
        System.out.println("Heart rate: " + heartRate + " beats per minute");

        System.out.println("Enter display option (1 - Text table, 2 - HTML table):");
        int displayOption = scanner.nextInt();
        CalculationResultRenderer renderer;
        if (displayOption == 1) {
            renderer = new TextResultRenderer();
        } else {
            renderer = new HTMLTableResultRenderer();
        }

        CalculationResult result = new CalculationResult(bodyTemperature, physiologicalNormTemperature);
        String renderedResult = renderer.render(result);
        System.out.println(renderedResult);

        scanner.close();
    }
}

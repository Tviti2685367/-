import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) { // Використовуємо try-with-resources
            System.out.println("Enter body temperature:");
            double bodyTemperature = scanner.nextDouble();
            
            System.out.println("Enter physiological norm temperature:");
            double physiologicalNormTemperature = scanner.nextDouble();

            double heartRate = FrequencyCalculator.calculateHeartRate(bodyTemperature, physiologicalNormTemperature);
            System.out.println("Heart rate: " + heartRate + " beats per minute");
            
            System.out.println("Enter display option (1 - Text table, 2 - HTML table):");
            int displayOption = scanner.nextInt();
            CalculationResultRenderer renderer;
            if (displayOption == 1) {
                renderer = new TextTableResultRenderer();
            } else if (displayOption == 2) {
                renderer = new TextResultRenderer();
            } else {
                System.out.println("Invalid display option. Please choose 1 or 2.");
                return;
            }

            CalculationResult result = new CalculationResult(bodyTemperature, physiologicalNormTemperature);
            String renderedResult = renderer.render(result);
            System.out.println(renderedResult);
        }
    }
}
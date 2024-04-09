public class HeartRateCalculationCommand implements Command {
    private final CalculationResult result;

    public HeartRateCalculationCommand(CalculationResult result) {
        this.result = result;
    }

    @Override
    public void undo() {
        System.out.println("Undoing heart rate calculation.");
        // Perform any necessary actions to undo the heart rate calculation
    }
}
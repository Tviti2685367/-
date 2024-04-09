public class EnergyCalculationCommand implements Command {
    private final CalculationResult result;

    public EnergyCalculationCommand(CalculationResult result) {
        this.result = result;
    }

    @Override
    public void undo() {
        System.out.println("Undoing energy calculation.");
        // Perform any necessary actions to undo the energy calculation
    }
}
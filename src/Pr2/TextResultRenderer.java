public class TextResultRenderer implements CalculationResultRenderer {
    @Override
    public String render(CalculationResult result) {
        return "Parameter1: " + result.getParameter1() + ", Parameter2: " + result.getParameter2() + ", Result: " + result.getResult();
    }
}
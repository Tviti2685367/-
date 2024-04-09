public class HTMLTableResultRenderer implements CalculationResultRenderer {
    @Override
    public String render(CalculationResult result) {
        return "<html><body>HTML table representation of the calculation result</body></html>";
    }
}
public class TextTableResultRenderer implements CalculationResultRenderer {
    @Override
    public String render(CalculationResult result) {
        StringBuilder sb = new StringBuilder();
        sb.append("Calculation Result Table:\n");
        sb.append("+---------------+---------------+---------------+\n");
        sb.append("|   Parameter1  |   Parameter2  |     Result    |\n");
        sb.append("+---------------+---------------+---------------+\n");
        sb.append(String.format("|%15.2f  |%15.2f  |%15.2f  |\n", result.getParameter1(), result.getParameter2(), result.getResult()));
        sb.append("+---------------+---------------+---------------+\n");
        return sb.toString();
    }
}
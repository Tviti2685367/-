public class HTMLTableResultRenderer implements CalculationResultRenderer {
    @Override
    public String render(CalculationResult result) {
        StringBuilder html = new StringBuilder();
        html.append("<html><body><table border=\"1\">");
        html.append("<tr><th>Parameter1</th><th>Parameter2</th><th>Result</th></tr>");
        html.append("<tr><td>").append(result.getParameter1()).append("</td>");
        html.append("<td>").append(result.getParameter2()).append("</td>");
        html.append("<td>").append(result.getResult()).append("</td></tr>");
        html.append("</table></body></html>");
        return html.toString();
    }
}

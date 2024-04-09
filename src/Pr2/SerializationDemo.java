import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class SerializationDemo {
    public static void main(String[] args) {
        CalculationResult deserializedResult = null;
        try (FileInputStream fis = new FileInputStream("calculation_result.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
            deserializedResult = (CalculationResult) ois.readObject();
            CalculationResultRenderer renderer = new TextResultRenderer();
            System.out.println(renderer.render(deserializedResult));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
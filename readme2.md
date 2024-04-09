# Завдання 2 - Класи та об'єкти 
## Варіант 15
Знайти двійкове уявлення цілісного значення повної енергії фізичного тіла
при заданих значеннях маси, швидкості та висоти.

 ### CalculationResult.java
```java
import java.io.Serializable;

public class CalculationResult implements Serializable {
    private double parameter1;
    private double parameter2;
    private double result;

    // Конструктор, приймаючий два параметри
    public CalculationResult(double parameter1, double parameter2) {
        this.parameter1 = parameter1;
        this.parameter2 = parameter2;
        this.result = parameter1 + parameter2; // Додамо параметри для прикладу
    }

    // Геттери і сеттери
    public double getParameter1() {
        return parameter1;
    }

    public void setParameter1(double parameter1) {
        this.parameter1 = parameter1;
    }

    public double getParameter2() {
        return parameter2;
    }

    public void setParameter2(double parameter2) {
        this.parameter2 = parameter2;
    }

    public double getResult() {
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }
}
```
 
### EnergyCalculator.java
```java
public class EnergyCalculator {
    public static double calculateTotalEnergy(double mass, double velocity, double height) {
        // Add calculation logic here
        return mass * velocity * velocity / 2 + mass * 9.81 * height;
    }
}

```
###SerializationDemo.java
```java
import java.io.*;

public class SerializationDemo implements Serializable {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("calculation_result.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {

            // Створення об'єкта CalculationResult
            CalculationResult result = new CalculationResult(1.5, 2.5);
            oos.writeObject(result);

        } catch (Exception e) {
            e.printStackTrace();
        }

        CalculationResult deserializedResult = null;

        try (FileInputStream fis = new FileInputStream("calculation_result.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            deserializedResult = (CalculationResult) ois.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (deserializedResult != null) {
            System.out.println(deserializedResult.getParameter1());
            System.out.println(deserializedResult.getParameter2());
            System.out.println(deserializedResult.getResult());
        } else {
            System.out.println("Failed to deserialize CalculationResult.");
        }
    }
}
```
###Solver.java
```java
public class Solver {
    public CalculationResult performCalculation() {
        CalculationResult result = new CalculationResult(0, 0); // передаем значения по умолчанию или ваши желаемые значения
        result.setParameter1(10);
        result.setParameter2(20);
        return result;
    }
}
```
### Main.java
```java
public class Main {
    public static void main(String[] args) {
        // Check if command line arguments are present
        if (args.length == 0) {
            System.out.println("No command-line arguments provided.");
        } else {
            System.out.println("Provided command-line arguments:");
            // Print out the provided command-line arguments
            for (int i = 0; i < args.length; i++) {
                System.out.println("Argument " + (i + 1) + ": " + args[i]);
            }
        }
    }
}
```
### Test.java
```java
import java.io.*;

class MyClass implements Serializable {
    int id;
    String name;

    MyClass(int i, String n) {
        id = i;
        name = n;
    }
}

public class Test {
    public static void main(String[] args) {
        // Testing calculation
        System.out.println("Testing calculation:");
        int a = 5, b = 10, result;
        result = Calculator.add(a, b);
        System.out.println("Expected result: " + (a + b));
        System.out.println("Actual result: " + result);

        // Testing serialization
        System.out.println("\nTesting serialization:");
        MyClass obj = new MyClass(1, "Object 1");
        try {
            FileOutputStream fos = new FileOutputStream("test.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(obj);
            oos.close();
            System.out.println("Serialized successfully!");

            FileInputStream fis = new FileInputStream("test.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            MyClass objRead = (MyClass) ois.readObject();
            ois.close();
            System.out.println("Deserialized successfully!");
            System.out.println("Name: " + objRead.name + ", ID: " + objRead.id);
        } catch (IOException e) {
            System.out.println("Error: " + e);
        } catch (ClassNotFoundException c) {
            System.out.println("Error: " + c);
        }
    }
}

class Calculator {
    public static int add(int a, int b) {
        return a + b;
    }
}
```

### Ось результат ↓ 
 
![Результат](/screenshot/image.png) 
 

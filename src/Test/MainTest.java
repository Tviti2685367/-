import Pr.ConsoleProgram;

public class MainTest {

    public static void main(String[] args) {
        MainTest tester = new MainTest(); // Создаем объект класса MainTest
        // Вызываем методы для тестирования
        tester.testNoArguments();
        tester.testWithArguments();
    }

    public void testNoArguments() {
        String[] args = {};
        ConsoleProgram.main(args); // Вызываем метод main из класса ConsoleProgram
    }

    public void testWithArguments() {
        String[] args = {"Hello", "World!", "Zhenya"};
        ConsoleProgram.main(args); // Вызываем метод main из класса ConsoleProgram
    }
}
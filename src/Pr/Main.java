package Pr;

public class Main {
    public static void main(String[] args) {
        Main tester = new Main(); // Создаем объект класса Main
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
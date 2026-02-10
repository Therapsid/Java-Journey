package OOP.classes;


public class Main {
    //entry-point
    static void main() {
        double a = 10.4;
        int b = 20;

        int result = Calculator.sum((int) a, b);

        PrintClass printClass = new PrintClass(); // object creation
        printClass.print(result); // method call
    }

    // 1. method name
    // 2. arguments
    // 3. method body




}

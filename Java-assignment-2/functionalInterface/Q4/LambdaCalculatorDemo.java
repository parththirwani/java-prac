package functionalInterface.Q4;

@FunctionalInterface
interface Calculator {
    int calculate(int a, int b);
}

public class LambdaCalculatorDemo{
    public static void main(String[] args) {

        Calculator add = (a, b) -> a + b;
        Calculator sub = (a, b) -> a - b;
        Calculator mul = (a, b) -> a * b;
        Calculator divide = (a, b) -> a / b;

        System.out.println("Addition: " + add.calculate(3, 4));
        System.out.println("Subtraction: " + sub.calculate(3, 4));
        System.out.println("Multiplication " + mul.calculate(3, 4));
        System.out.println("Divide: " + divide.calculate(3, 4));

    }

}

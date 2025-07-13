package functionalInterface.Q6;

@FunctionalInterface
interface SquareCalculator {
    int compute(int x);
}

class MathOperations {
    public static int findSquare(int x) {
        return x * x;
    }
}

public class SquareMethodReferenceDemo {
    public static void main(String[] args) {
        // Method reference to static method
        SquareCalculator calculator = MathOperations::findSquare;

        int num = 7;
        int result = calculator.compute(num);

        System.out.println("Square of " + num + " is: " + result);
    }
}

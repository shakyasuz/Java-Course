// Abstract class Calculation
abstract class Calculation {
    // Normal method to calculate the sum of x and y
    public int add(int x, int y) {
        return x + y;
    }

    // Abstract method to perform multiplication
    public abstract int mul(int x, int y);
}

// Demo class inheriting from Calculation and implementing abstract methods
class Demo extends Calculation {
    // Implementation of abstract method to perform multiplication
    public int mul(int x, int y) {
        return x * y;
    }

    // Method to calculate division
    public int calcDiv(int x, int y) {
        if (y != 0) {
            return x / y;
        } else {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }
}

public class abstractclassdemo1 {
    public static void main(String[] args) {
        // Creating object of Demo class
        Demo demo = new Demo();

        // Demonstrating multiplication
        int resultMul = demo.mul(5, 3);
        System.out.println("Multiplication result: " + resultMul);

        // Demonstrating division
        int resultDiv = demo.calcDiv(10, 2);
        System.out.println("Division result: " + resultDiv);

        // Accessing the method of abstract class using reference of abstract class
        Calculation calculation = new Demo(); // Reference of abstract class
        int resultAdd = calculation.add(4, 6); // Accessing the normal method
        int resultMulFromAbstract = calculation.mul(3, 2); // Accessing the abstract method
        System.out.println("Addition result: " + resultAdd);
        System.out.println("Multiplication result (accessed through abstract class reference): " + resultMulFromAbstract);
    }
}

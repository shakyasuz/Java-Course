
package Unit1;
import java.util.*;
public class ClassConceptDemo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");

        // NOTE: Take input from user: Scanner Class
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter second  number: ");
        int num2 = sc.nextInt();
        int sum = num1 + num2;
        int diff = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;
        System.out.println("Sum: " + sum);
        System.out.println("Diff: " + diff);
        System.out.println("Mul: " + mul);
        System.out.println("Div: " + div);
        sc.close();
    }
}


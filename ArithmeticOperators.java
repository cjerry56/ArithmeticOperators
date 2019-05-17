// java program to perform all arithmetic operations
import java.util.Scanner;

public class ArithmeticOperators{

    public static void main(String[] args){

        //create sscanner class object
        Scanner input = new Scanner(System.in);

        //input two numbers from users
        System.out.println("Enter first number: ");
        int firstNumber = input.nextInt();

        System.out.println("Enter second number: ");
        int secondNumber = input.nextInt();

        //perform arithmetic operations
        int sum         = firstNumber + secondNumber;
        int difference  = firstNumber - secondNumber;
        int product     = firstNumber * secondNumber;
        int quotient    = firstNumber / secondNumber;
        int modulo      = firstNumber % secondNumber;

        //print result
        System.out.println("Sum: "          + sum);
        System.out.println("Difference: "   + difference);
        System.out.println("Product: "      + product);
        System.out.println("Quotient: "     + quotient);
        System.out.println("Modulo: "       + modulo);
    }
}
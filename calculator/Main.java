package calculator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int result = 0;

        @SuppressWarnings("resource")
        Scanner number = new Scanner(System.in);

        Calculation calculator = new Calculation();

        System.out.println("Enter First Number: ");
        int num1 = number.nextInt();

        System.out.println("Enter Second Number: ");
        int num2 = number.nextInt();
        
        System.out.println("1-Addition\n2-Subtraction\n3-Multiplication\n4-Division");
        System.out.println("Enter Operation: ");
        int choice = number.nextInt();

        if(choice < 1 || choice > 4) {
            System.out.println("Invalid Operations");
            return ;
        }

        switch (choice) {
            case 1:
                result = calculator.add(num1, num2);
                break;
            
            case 2:
                result = calculator.substract(num1, num2);
                break;
            
            case 3:
                result = calculator.multiply(num1, num2);
                break;
            
            case 4:
                result = calculator.divide(num1, num2);
                break;
            default:
                System.out.println("Try Again.");
                break;
        }

        System.out.println("Result: " +result);
    }
}

class Calculation {
    int add(int a, int b) {
        return a + b;
    }

    int substract(int a, int b) {
        return a - b;
    }

    int multiply(int a, int b) {
        return a * b;
    }

    int divide(int a, int b) {
        return a / b;
    }
}

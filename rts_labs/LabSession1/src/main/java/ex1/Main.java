package ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Please select an operation from the following: +, -, *: ");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        char character = input.charAt(0);

        ImaginaryNumber n1 = new ImaginaryNumber(0, 0);
        ImaginaryNumber n2 = new ImaginaryNumber(0, 0);
        double n;

        switch (character){
            case '+':
                System.out.println("Please enter the real value of the first number: ");
                n = scanner.nextDouble();
                n1.setReal(n);
                System.out.println("Please enter the imaginary value of the first number: ");
                n = scanner.nextDouble();
                n1.setImaginary(n);

                System.out.println("Please enter the real value of the second number: ");
                n = scanner.nextDouble();
                n2.setReal(n);
                System.out.println("Please enter the imaginary value of the second number: ");
                n = scanner.nextDouble();
                n2.setImaginary(n);

                System.out.println("The output of the operation is: " + n1.add(n2));

                break;
            case '-':
                System.out.println("Please enter the real value of the first number: ");
                n = scanner.nextDouble();
                n1.setReal(n);
                System.out.println("Please enter the imaginary value of the first number: ");
                n = scanner.nextDouble();
                n1.setImaginary(n);

                System.out.println("Please enter the real value of the second number: ");
                n = scanner.nextDouble();
                n2.setReal(n);
                System.out.println("Please enter the imaginary value of the second number: ");
                n = scanner.nextDouble();
                n2.setImaginary(n);

                System.out.println("The output of the operation is: " + n1.substract(n2));

                break;

            case '*':
                System.out.println("Please enter the real value of the first number: ");
                n = scanner.nextDouble();
                n1.setReal(n);
                System.out.println("Please enter the imaginary value of the first number: ");
                n = scanner.nextDouble();
                n1.setImaginary(n);

                System.out.println("Please enter the real value of the second number: ");
                n = scanner.nextDouble();
                n2.setReal(n);
                System.out.println("Please enter the imaginary value of the second number: ");
                n = scanner.nextDouble();
                n2.setImaginary(n);

                System.out.println("The output of the operation is: " + n1.multiply(n2));

                break;
            default:
                System.out.println("Invalid Operation!");

                break;
        }
    }
}

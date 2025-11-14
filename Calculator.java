import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("----- SIMPLE CALCULATOR -----");
        System.out.print("Enter first number: ");
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = sc.nextDouble();

     
        System.out.println("1. Addition "+(num1+num2));
        System.out.println("2. subtraction "+(num1-num2));
        System.out.println("3. Multiplication "+(num1*num2));
        System.out.println("4. Division "+(num1/num2));

            }
}

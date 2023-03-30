import java.io.PrintStream;
import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = scanner.nextInt();
        System.out.println("Enter second number");
        int b = scanner.nextInt();
        System.out.println("Enter symbol of operation");
        char c = scanner.next().charAt(0);
        switch (c) {
            case '+':
                System.out.println(add(a, b));
                break;
            case '-':
                System.out.println(subtract(a, b));
                break;
            case '*':
                System.out.println(multiply(a, b));
                break;
            case '/':
                System.out.println(divide(a, b));
                break;
            case '%':
                System.out.println(modulo(a, b));
                break;
        }
    }
        public static int add(int a, int b) {
            return a + b;
        }

        public static int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static int divide(int a, int b) {
            if (b==0){
                System.out.println("You can't divide by zero!");}
            return a / b;
        }
        public static int modulo(int a, int b) {
            return a*b/100;
        }








       }




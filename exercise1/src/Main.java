import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        System.out.println("\nMultiplication Table");
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " x " + i + " = " + num * i);
        }

        System.out.println("\nFactorial");
        System.out.println("The factorial of " + num + " is " + factorial(num));

        System.out.println("\nFibonacci Sequence");
        fibonacci(num);
    }

    public static int factorial(int num) {
        if (num == 0) {
            return 1;
        }
        return num * factorial(num - 1);
    }

    public static void fibonacci(int num) {
        int a = 0;
        int b = 1;
        int c;
        System.out.print(a + " " + b + " ");

        for (int i = 2; i < num; i++) {
            c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
        }
    }
}
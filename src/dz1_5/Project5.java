package dz1_5;
import java.util.Scanner;

public class Project5 {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
        System.out.print("Введите факториал числа: ");
    int factorialNumber = scanner.nextInt();

    int result = 1;
        for(int number = 1; number <= factorialNumber; number++)
    {
        result *= number;
    }

        System.out.print("Факториал числа "+ factorialNumber+": " + result);
}
}

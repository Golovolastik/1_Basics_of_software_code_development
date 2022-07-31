package LinearPrograms;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("(b + sqrt(b^2 + 4ac)) / 2a - a^3*c + b^-2");
        System.out.println("Enter a:");
        double a = scanner.nextDouble();
        System.out.println("Enter b:");
        double b = scanner.nextDouble();
        System.out.println("Enter c:");
        double c = scanner.nextDouble();
        double res = (b + Math.sqrt(Math.pow(b, 2) + 4*a*c)) / 2*a - Math.pow(a, 3)*c + Math.pow(b, -2);
        System.out.println("Result: " + res);
    }
}

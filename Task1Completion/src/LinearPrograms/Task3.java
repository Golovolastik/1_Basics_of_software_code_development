package LinearPrograms;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("(sin x + cos y) / (cos x - sin y) * tg xy");
        System.out.println("Enter x:");
        double x = scanner.nextDouble();
        System.out.println("Enter y:");
        double y = scanner.nextDouble();
        double res = (Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y)) * Math.tan(x*y);
        System.out.println("Result: " + res);
    }
}

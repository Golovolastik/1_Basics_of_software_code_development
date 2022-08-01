package Branching;

import java.util.Scanner;

// Даны 3 точки. Определить лежат ли они на одной прямой
public class Task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Initialize A");
        System.out.println("x1 = ");
        double x1 = scanner.nextDouble();
        System.out.println("y1 = ");
        double y1 = scanner.nextDouble();
        System.out.println("Initialize B");
        System.out.println("x2 = ");
        double x2 = scanner.nextDouble();
        System.out.println("y2 = ");
        double y2 = scanner.nextDouble();
        System.out.println("Initialize C");
        System.out.println("x3 = ");
        double x3 = scanner.nextDouble();
        System.out.println("y3 = ");
        double y3 = scanner.nextDouble();
        // Найдем площадь треугольника образованными этими точками.
        // Если площадь равна нулю, то точки лежат на одной прямой.
        double S = ((x1-x3)*(y2-y3) - (x2-x3)*(y1-y3)) / 2; // на 2 делить не обязательно
        boolean res = S == 0;
        System.out.println("Dots are on one line: " + res);
    }
}

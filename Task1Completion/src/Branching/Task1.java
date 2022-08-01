package Branching;

import java.util.Scanner;

// Даны 2 угла треугольника (в градусах).
// Определить, существует ли такой треугольник, и если да, то будет ли он прямоугольным.
public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first angle:");
        int ang1 = scanner.nextInt();
        System.out.println("Enter the second angle:");
        int ang2 = scanner.nextInt();
        // Проверяем существует ли такой треугольник
        if (ang1 + ang2 < 180) {
            System.out.println("Triangle exists");
            // Определим, является ли он прямоугольным
            if (ang1 == 90 || ang2 ==90 || 180-ang1-ang2==90){
                System.out.println("It is a right triangle");
            } else {
                System.out.println("Triangle is not right");
            }
        } else {
            System.out.println("Triangle does not exist");
        }
    }
}

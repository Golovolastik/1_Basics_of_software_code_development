package Branching;

import java.util.Scanner;

// Даны размеры отверстия и размер кирпича.
// Определить войдет ли туда кирпич
public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Init hole");
        System.out.println("Init size A");
        double A = scanner.nextDouble();
        System.out.println("Init size B");
        double B = scanner.nextDouble();
        System.out.println("Init brick");
        System.out.println("Init size x");
        double x = scanner.nextDouble();
        System.out.println("Init size y");
        double y = scanner.nextDouble();
        System.out.println("Init size z");
        double z = scanner.nextDouble();
        // Проверим войдет ли кирпич
        if ((A>=x && B>=y) || (A>=y && B>=x) ||
            (A>=x && B>=z) || (A>=z && B>=x) ||
            (A>=y && B>=z) || (A>=z && B>=y)){

            System.out.println("The brick will fit the hole");
        } else {
            System.out.println("The brick is too large");
        }
    }
}

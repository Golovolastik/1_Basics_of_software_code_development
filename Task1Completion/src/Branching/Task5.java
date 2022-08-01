package Branching;


import java.util.Scanner;

// Вычислить значение функции F
public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x");
        double x = scanner.nextDouble();
        double res = x<=3 ? (Math.pow(x,2) - 3*x + 9) : (1 / (Math.pow(x, 3) + 6));
        System.out.printf("F(x) = %.3f", res);
    }
}

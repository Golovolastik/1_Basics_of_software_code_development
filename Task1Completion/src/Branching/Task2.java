package Branching;

import java.util.Scanner;

// Найти max{min(a,b), min(c,d)}
public class Task2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a:");
        int a = scanner.nextInt();
        System.out.println("Enter b:");
        int b = scanner.nextInt();
        System.out.println("Enter c:");
        int c = scanner.nextInt();
        System.out.println("Enter d:");
        int d = scanner.nextInt();
        int min1 = a<b ? a : b;
        int min2 = c<d ? c : d;
        int res = min1>min2 ? min1 : min2;
        // Проще использовать класс Math и его методы max и min
        //int res2 = Math.max(Math.min(a,b), Math.min(c,d));
        System.out.println(res);
        //System.out.println(res2);
    }
}

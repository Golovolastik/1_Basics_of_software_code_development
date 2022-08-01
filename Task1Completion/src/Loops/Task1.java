package Loops;

import java.util.Scanner;

// Сумма всех чисел от 1 до x
public class Task1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive integer: ");
        int x = scanner.nextInt();
        int sum = 0;
        for (int i=1; i<=x; i++){
            sum += i;
        }
        System.out.printf("The sum of all numbers from 1 to %d is %d",x,sum);
    }
}

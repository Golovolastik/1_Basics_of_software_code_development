package Loops;

import java.util.Scanner;

// Для каждого натурального числа от m до n вывести все делители,
// кроме еденицы и самого числа
public class Task7 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter m:");
        int m = scanner.nextInt();
        System.out.println("Enter n:");
        int n = scanner.nextInt();
        if (m>n){
            int temp = m;
            m = n;
            n = temp;
        }
        for (int i=m; i<=n; i++){
            System.out.print("The dividers of " + i + " - ");
            for (int k=2; k<=i/2; k++){
                if (i % k == 0){
                    System.out.print(k + " ");
                }
            }
            System.out.print("\n");
        }
    }
}

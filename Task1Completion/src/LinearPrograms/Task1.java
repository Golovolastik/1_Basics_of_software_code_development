package LinearPrograms;

import java.util.Scanner;

public class Task1 {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.println("z = ((a-3) * b / 2) + c");
        System.out.println("Enter a:");
        double a = scanner.nextInt();
        System.out.println("Enter b:");
        double b = scanner.nextInt();
        System.out.println("Enter c:");
        double c = scanner.nextInt();
        double z = ((a-3) * b / 2) + c;
        System.out.println("z = " + z);
    }
}

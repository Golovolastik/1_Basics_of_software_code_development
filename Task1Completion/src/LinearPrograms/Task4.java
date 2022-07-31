package LinearPrograms;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number in xxx.yyy format");
        String s = scanner.nextLine();
        String[] expected = s.split("\\.");
        double result = Double.parseDouble(expected[1] + "." + expected[0]);
        System.out.println(result);
    }
}

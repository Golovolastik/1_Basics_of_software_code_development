package LinearPrograms;

import java.util.Scanner;

// Для данной области составить линейную программу, которая печатает true,
// если точка с координатами (x,y) принадлежит закрашенной области,
// и false - в противном случае
public class Task6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter x:");
        int x = scanner.nextInt();
        System.out.println("Enter y:");
        int y = scanner.nextInt();
        boolean condition1 = (y>=-3 && y<=4) && (x>=-2 && x<=2);
        boolean condition2 = (y>=-3 && y<=0) && (x>=-4 && x<=4);
        boolean condition3 = y!=-1 && x!=0;
        boolean res = condition1 || condition2 && condition3;
        System.out.println(res);
    }
}

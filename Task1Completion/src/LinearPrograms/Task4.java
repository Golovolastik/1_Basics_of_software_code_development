package LinearPrograms;

import java.text.DecimalFormat;
import java.util.Scanner;

//     Дано действительное число R вида nnn.ddd
// (три цифровых разряда в дробной и целой частях).
// Поменять местами дробную и целую части числа и вывести полученное значение.
public class Task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the number in xxx.yyy format");
//        String s = scanner.nextLine();
//        String[] expected = s.split("\\.");
//        double result = Double.parseDouble(expected[1] + "." + expected[0]);
//        System.out.println(result);

        System.out.println("Enter the number:");
        double x = scanner.nextDouble();
        DecimalFormat df = new DecimalFormat("#.###");
        String s = df.format(x);
        String[] expected = s.split(",");
        double result = Double.parseDouble(expected[1] + "." + expected[0]);
        System.out.println(result);
    }
}

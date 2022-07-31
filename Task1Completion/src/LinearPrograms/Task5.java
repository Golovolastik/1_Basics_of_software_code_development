package LinearPrograms;

import java.util.Scanner;

// Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
// Вывести данное значение длительности в следующей форме: HHч MMмин SSс.
public class Task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of seconds:");
        int s = scanner.nextInt();
        int sec = s % 60;
        int min = (s / 60) % 60;
        int hours = (s/60)/60;
        System.out.printf("%02dh %02dmin %02ds", hours, min, sec); //
    }
}

package Loops;

// Вычислить значения функции на отрезке [a,b] с шагом h
public class Task2 {
    public static void main(String[] args) {
        int a = -8;
        int b = 5;
        int h = 2;
        int res;
        for (int i = a; i <= b; i += h) {
            if (i <= 2) {
                res = -i;
            } else {
                res = i;
            }
            System.out.println(res);
        }
    }
}

package Loops;

// Найти сумму квадратов первых ста чисел
public class Task3 {
    public static void main(String[] args){
        int res = 0;
        for (int i=1; i<=100; i++) {
            res += i*i;
        }
        System.out.println(res);
    }
}

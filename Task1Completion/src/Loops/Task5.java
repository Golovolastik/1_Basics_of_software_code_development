package Loops;

// Даны числовой ряд и некоторое число е.
// Найти сумму тех членов ряда, модуль которых больше или равен заданному е
public class Task5 {
    public static void main(String[] args){
        final double e = 0.4;
        double res = 0;
        for (int i=1; i<=10; i++){
            double a;
            a = Math.abs(1/Math.pow(2,i) + 1/Math.pow(3,i));
            if (a >= e){
                res += a;
            }
        }
        System.out.println(res);
    }
}

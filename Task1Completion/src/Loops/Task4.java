package Loops;

import java.math.BigInteger;

// Составить программу для нахождения произведения квадратов первых двухсот чисел
public class Task4 {
    public static void main(String[] args){
        BigInteger res = new BigInteger("1");
        for (int i=1; i<=200; i++){
            res = res.multiply(BigInteger.valueOf(i*i));
        }
        System.out.println(res);
    }
}

package Loops;

// Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера
public class Task6 {
    public static void main(String[] args){
        System.out.println("Number|Symbol");
        System.out.println("_____________");
        for (int i=33; i<127; i++){  // Первые 32 и 127 символы - непечатаемые
            System.out.printf(" %3d  |  %c\n", i, (char)i);
        }
    }
}

package Loops;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа
public class Task8 {
    public static void main(String[] args){
        int k = 123452235;
        int l = 2467833;
        String k_string = Integer.toString(k);
        String l_string = Integer.toString(l);
        // Проверим каждую цифру на вхождение в числа
        for (int i=0; i<=9; i++){
            // Проверяем первое число
            int j=0;
            int b=0;
            while (j<k_string.length()){
                if (String.valueOf(k_string.charAt(j)).equals(Integer.toString(i))){
                    // Проверяем второе число
                    while (b<l_string.length()){
                        if (String.valueOf(l_string.charAt(b)).equals(Integer.toString(i))) {
                            System.out.print(i + " ");
                            break;
                        }
                        b++;
                    }
                    break;
                }
                j++;
            }
        }
    }
}

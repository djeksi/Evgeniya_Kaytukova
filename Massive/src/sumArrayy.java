import java.util.Scanner;

public class sumArrayy {
    public static void main(String[] args) {
        int[] sumArray = {1, 2, 3, 4, 10, 20, 55, 65};

        int sum = 0;

        for (int i = 0; i < sumArray.length; i++) sum += sumArray[i];
        System.out.println("Сумма чисел = " + sum);
    }
}

import java.util.Scanner;

public class MaxFiveNums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] fiveNums = new int[5];
        System.out.println("Введите 5 элементов массива через Enter");
        for (int i = 0; i < 5; i++) {
            fiveNums[i] = sc.nextInt();
        }
        System.out.println("Указанные элементы массива: ");
        for (int i = 0; i < fiveNums.length; i++) {
            System.out.println(" " + fiveNums[i]);
        }
        int maxNum = fiveNums[0];

        for (int j : fiveNums) {
            if (j > maxNum)
                maxNum = j;
        }
        System.out.println("Максимальное число = " + maxNum);
    }
}
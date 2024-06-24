import java.util.Scanner;

public class MinMaxx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int length = sc.nextInt();
        int[] minMax = new int[length];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < length; i++) {
            minMax[i] = sc.nextInt();
        }
        System.out.println("Указанные элементы массива: ");
        for (int i = 0; i < minMax.length; i++) {
            System.out.println(" " + minMax[i]);
        }
        int maxNum = minMax[0];
        int minNum = minMax[0];

        for (int j : minMax) {
            if (j > maxNum)
                maxNum = j;
        }
        for (int q : minMax) {
            if (q < minNum)
                minNum = q;
        }
        System.out.printf("Максимальное и Минимальное числа массива: [" + maxNum + " ; " + minNum + "]");
    }
}

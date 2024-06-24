
import java.util.Scanner;

public class TenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] Box = new int[10];

        for (int i = 0; i < Box.length; i++) {
            System.out.println("Введите число: ");
            Box[i] = scanner.nextInt();
        }
        System.out.printf("Указанные элементы массива: ");
        for (int i = 0; i < Box.length; i++) {
            System.out.printf(" " + Box[i]);
        }

    }
}


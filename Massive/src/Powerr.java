import java.util.Scanner;

public class Powerr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int base = 0;
        int exponent = 0;


        System.out.print("Введите число: ");
        base = sc.nextInt();

        System.out.print("Введите степень: ");
        exponent = sc.nextInt();

        System.out.print("Ответ: " + power(base, exponent));
    }

    public static int power(int a, int b) {
        int power = 1;

        for (int c = 0; c < b; c++)
            power *= a;

        return power;
    }
}

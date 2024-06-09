import java.util.Scanner;

public class Cicle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите начальное число диапазона");
        int alfa = scanner.nextInt();
        System.out.println("Введите конечное число диапазона");
        int omega = scanner.nextInt();
        while (alfa < omega) {
            alfa = alfa + 1;
            System.out.println(alfa);
        }
        System.out.println("Готово!");


    }
}

import java.util.Random;
import java.util.Scanner;

public class Massiv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        int a;
        System.out.println("Введите число");
        a = scanner.nextInt();

        while (int i = 0; i < 100; i++) {

            if (randomNumber == a) {
                System.out.println("Вы угадали! число - " + randomNumber);
                break;
            } else if (a > randomNumber) {
                System.out.println("Заданное число меньше");
                continue;
            } else {
                System.out.println("Заданное число больше");
                continue;
            }
        }
    }
    }



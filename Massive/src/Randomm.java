import java.util.Random;
import java.util.Scanner;

public class Randomm {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        int usersNumber;
        for (int i = 0; i < 100; i++) {
            System.out.println("Угадайте число");
            usersNumber = scanner.nextInt();
            if (randomNumber == usersNumber) {
                System.out.println("В точку!" + usersNumber);
                break;
            } else
                System.out.println(usersNumber > randomNumber ? "Загаданное чилсо меньше" : "Загаданное число больше");
        }
        System.out.println("Загаданное число:" + randomNumber);

    }
}

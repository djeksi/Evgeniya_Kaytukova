import java.util.Scanner;

public class IsPrimee {
    public static void main(String[] args) {
        System.out.print("Введите целое число для проверки: ");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        boolean isPrime = isPrimeNumber(number);
        System.out.println("Число " + number + " является простым: " + isPrime);
    }

    // Метод для проверки, является ли число простым
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

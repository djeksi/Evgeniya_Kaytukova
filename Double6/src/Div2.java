import java.util.Scanner;

public class Div2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число");
        double a = scanner.nextDouble();
        System.out.println("Пожалуйста, ввведите второе число");
        double b = scanner.nextDouble();
        if (a > b) {
            System.out.println("Ответ: частное = ");
            System.out.println(a / b);
        } else if (b > a) {
            System.out.println("Ответ: частное = ");
            System.out.println(b / a);
        } else {
            System.out.println("Ответ: частное = 1");
        }

    }
}

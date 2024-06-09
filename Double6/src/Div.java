import java.util.Scanner;

public class Div {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Пожалуйста, введите делимое");
        double a = scanner.nextDouble();
        System.out.println("Пожалуйста, ввведите делитель");
        double b = scanner.nextDouble();
        double c = a / b;
        System.out.println("Ответ: частное = ");
    System.out.println(c);
    }
}

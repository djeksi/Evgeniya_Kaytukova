import java.util.Scanner;

public class MaxOfThree {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите три числа");
            int num1 = scanner.nextInt();
            int num2 = scanner.nextInt();
            int num3 = scanner.nextInt();
            if (num1 >= num2 && num1 >= num3) {
                System.out.println("Максимальное число -" + num1);
                } else if (num2 >= num1 && num2 >= num3) {
                    System.out.println("Максимальное число -" + num2);
                } else
                    System.out.println("Максимальное число -" + num1);
            }
        }
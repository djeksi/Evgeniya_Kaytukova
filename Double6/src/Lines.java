import java.util.Scanner;

public class Lines {
    public static void main(String[] args) {
        Scanner scanner =   new Scanner(System.in);
        System.out.println("Для сравнения введите число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        int result;
        if (a > b) {
            System.out.println("Большее число: ");
            System.out.println(a);
            result = a;
        } else if (b > a){
            System.out.println("Большее число: ");
            System.out.println(b);
            result = b;
        } else  {
            System.out.println("Оба числа равны");


        }
    }
}


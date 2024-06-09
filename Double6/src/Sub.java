import java.beans.PropertyEditorSupport;
import java.util.Scanner;

public class Sub {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число, пж");
        byte a = scanner.nextByte();
        System.out.println("Введите второе число, пж");
        byte b = scanner.nextByte();
        int result;
        if (a > b) {
            System.out.println("Разность чисел равна ");
            result = (a - b);
            System.out.println(a - b);
        } else if (b > a) {
            System.out.println("Разность чисел равна ");
            result = (byte) (b - a);
            System.out.println(b - a);
        } else  {
            System.out.println("Zerooo!!!");
            result = 0;
        }

    }
}

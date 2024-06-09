import javax.swing.*;
import java.util.Scanner;

public class Multi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первый множитель");
        float a = scanner.nextInt();
        System.out.println("Введите второй множитель");
        float b = scanner.nextInt();
        System.out.println("Ответ: Произведение = ");
        float c = (float) (a * b);
        System.out.println(c);

        


    }
}

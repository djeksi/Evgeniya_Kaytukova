import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое слагаемое");
        byte a = scanner.nextByte();
        if  (a < 0) {
            System.out.println("Я не хочу работать с отрицательными числами");
            System.exit(0);
        }
        System.out.println("Введите второе слагаемое");
        byte b = scanner.nextByte();
         if  (b < 0) {
            System.out.println("Я не хочу работать с отрицательными числами");
            System.exit(0);
        }
        System.out.println("Сумма чисел = ");
        byte c = (byte) (a + b);


        System.out.println(c);
        
    }
}

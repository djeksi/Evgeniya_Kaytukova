import java.util.Scanner;

public class Containss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int length = sc.nextInt();
        System.out.println("Введите искомое число: ");
        int target = sc.nextInt();
        boolean rezult = contains(length, target);
        System.out.println("Искомое число =" + rezult);
    }

    public static boolean contains(int length, int target) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[length];
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Введите число: " + i);
            arr[i] = sc.nextInt();
            if (arr[i] == target)
                return true;
            }
            return false;
        }
    }

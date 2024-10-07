import java.util.Scanner;
import java.util.Locale;

public class task4 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.print("Введите длину массива: ");
        int length = scan.nextInt();
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            System.out.print("Элемент " + (i + 1) + ": ");
            array[i] = scan.nextInt();
        }

        int max = array[0]; int min = array[0]; int sum = 0;


        for (int i = 0; i < length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] < min) {
                min = array[i];
            }
            sum += array[i];
        }

        double average = (double) sum / length;

        System.out.println("Максимальное значение: " + max);
        System.out.println("Минимальное значение: " + min);
        System.out.println("Среднее арифметическое: " + average);

        scan.close();
    }
}

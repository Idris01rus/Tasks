import java.util.Scanner;
import java.util.Locale;

public class task2 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Введите целое число: ");
        int number = scan.nextInt();

        if (number % 2 == 0) {
            System.out.println("Число четное.");
        } else {
            System.out.println("Число нечетное.");
        }

        scan.close();
    }
}

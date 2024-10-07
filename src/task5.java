import java.util.Scanner;
import java.util.Locale;

public class task5 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Введите число: ");
        int number = scan.nextInt();

        long f = 1;

        for (int i = 1; i <= number; i++) {
            f *= i;
        }
        System.out.println(number + "! = " + f);

        scan.close();
    }
}

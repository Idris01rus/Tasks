import java.util.Scanner;
import java.util.Locale;

public class task6 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Введите число: ");
        int n = scan.nextInt();

        if (n == 0) {
            System.out.println("0-е число в последовательности Фибоначчи: 0");
        } else if (n == 1) {
            System.out.println("1-е число в последовательности Фибоначчи: 1");
        } else {
            int a = 0;
            int b = 1;
            int fib = 0;

            for (int i = 2; i <= n; i++) {
                fib = a + b;
                a = b;
                b = fib;
            }

            System.out.println(n + "-е число в последовательности Фибоначчи: " + fib);
        }

        scan.close();
    }
}

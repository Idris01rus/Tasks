import java.util.Scanner;
import java.util.Locale;

public class task1 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);
        System.out.print("Введите первое число: ");
        double num1 = scan.nextDouble();
        System.out.print("Введите второе число: ");
        double num2 = scan.nextDouble();

        System.out.println(
                ((num1 % 1 == 0) ? String.valueOf((int) num1) : num1) + " + " +
                        ((num2 % 1 == 0) ? String.valueOf((int) num2) : num2) + " = " +
                        (((num1 + num2) % 1 == 0) ? String.valueOf((int) (num1 + num2)) : num1 + num2)
        );

        System.out.println(
                ((num1 % 1 == 0) ? String.valueOf((int) num1) : num1) + " - " +
                        ((num2 % 1 == 0) ? String.valueOf((int) num2) : num2) + " = " +
                        (((num1 - num2) % 1 == 0) ? String.valueOf((int) (num1 - num2)) : num1 - num2)
        );

        System.out.println(
                ((num1 % 1 == 0) ? String.valueOf((int) num1) : num1) + " * " +
                        ((num2 % 1 == 0) ? String.valueOf((int) num2) : num2) + " = " +
                        (((num1 * num2) % 1 == 0) ? String.valueOf((int) (num1 * num2)) : num1 * num2)
        );

        if (num2 != 0) {
            System.out.println(
                    ((num1 % 1 == 0) ? String.valueOf((int) num1) : num1) + " / " +
                            ((num2 % 1 == 0) ? String.valueOf((int) num2) : num2) + " = " +
                            (((num1 / num2) % 1 == 0) ? String.valueOf((int) (num1 / num2)) : num1 / num2)
            );
        }
        else {
            System.out.println("Деление на ноль невозможно");
        }

        scan.close();
    }
}

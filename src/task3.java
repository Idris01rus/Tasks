import java.util.Scanner;
import java.util.Locale;

public class task3 {
    public static void main(String args[]) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        scan.useLocale(Locale.US);

        System.out.print("Введите строку: ");
        String text = scan.nextLine();

        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed += text.charAt(i);
        }

        System.out.print(text + " -> " + reversed);

        scan.close();
    }
}

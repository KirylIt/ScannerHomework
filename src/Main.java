import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Прочитайте числа с консоли, предусмотрите,
        // чтобы в случае ввода нечисловых данных, в консоли об этом уведомлялось.
        // Прочитанные числа просуммировать и вывести результат.
        int a,b;
        Scanner scanner = new Scanner(System.in);
        try {
            a = scanner.nextInt();
            b = scanner.nextInt();
            System.out.println(a+b);
        } catch (InputMismatchException inputMismatchException){
            System.out.println("Вводить можно только числа! \n"
                    + "Перезагрузите программу!" );
        }
    }
}
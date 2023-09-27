import java.util.InputMismatchException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        notEmptyInput();
    }

    public static void notEmptyInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите что-нибудь: ");
        String input = scanner.nextLine();
        if (input.length() == 0) {
            throw new RuntimeException("Нельзя вводить пустые строки!");
        }
    }
}


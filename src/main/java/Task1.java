import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        floatInputOutput();
    }

    public static void floatInputOutput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите дробное число: ");
        try {
            float number = scanner.nextFloat();
            System.out.println("Введенное значение: " + number);
        } catch (InputMismatchException e) {
            System.err.println("Неверный ввод!");
            floatInputOutput();
        }
    }
}

import java.util.Scanner;

public class Main {
    //Часть: 2. Практическое задачние 8.
    public static void main(String[] args) {
        System.out.println("Введите первое число:");
        int firstNumber = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число:");
        int secondNumber = new Scanner(System.in).nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("Сумма чисел="+sum);

        int raznost = firstNumber - secondNumber;
        System.out.println("Разность чисел="+raznost);

        int proizvedenie = firstNumber * secondNumber;
        System.out.println("Произведение чисел="+proizvedenie);

        int chastnoe = firstNumber / secondNumber;
        System.out.println("Частное чисел="+chastnoe);
    }
}

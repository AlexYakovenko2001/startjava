import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean isRepeat = true;
        System.out.println("Калькулятор запущен");
        while (isRepeat) {
            Scanner scanner = new Scanner(System.in);

            Calculator operation1 = new Calculator();

            System.out.print("Введите первое число: ");
            operation1.setNumber1(scanner.nextInt());

            System.out.print("Введите знак математической операции: ");
            operation1.setSign(scanner.next().charAt(0));

            System.out.print("Введите второе число: ");
            operation1.setNumber2(scanner.nextInt());

            operation1.calculate();

            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                String answer = scanner.next();
                if (answer.equals("yes")) {
                    break;
                } 
                if (answer.equals("no")) {
                    isRepeat = false;
                    break;
                }
            }
        }
    }
}

import java.util.Scanner;

public class CalculatorTest {
    public static void main(String[] args) {
        boolean isRepeat = true;
        while (isRepeat) {
            Scanner valueFirstNumb = new Scanner(System.in);
            Scanner valueSecondNumb = new Scanner(System.in);
            Scanner valueSign = new Scanner(System.in);
            Scanner userAnswer = new Scanner(System.in);

            Calculator operation1 = new Calculator();

            System.out.println("Введите первое число: ");
            operation1.setNumber1(valueFirstNumb.nextInt());

            System.out.println("Введите знак математической операции: ");
            operation1.setSign(valueSign.next());

            System.out.println("Введите второе число: ");
            operation1.setNumber2(valueSecondNumb.nextInt());

            operation1.calculate();

            while (true) {
                System.out.println("Хотите продолжить вычисления? [yes/no]: ");
                String answer = userAnswer.nextLine();
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

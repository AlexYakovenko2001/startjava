public class Calculator {
    private int number1;
    private int number2;
    private char sign;

    public void setNumber1(int number) {
        number1 = number;
    }

    public void setNumber2(int number) {
        number2 = number;
    }

    public void setSign(char sign) {
        this.sign = sign;
    }

    public void calculate() {
        switch (sign) {
        case '+' : 
            System.out.println(number1 + number2);
            break;
        case '-' : 
            System.out.println(number1 - number2);
            break;
        case '*' :
            System.out.println(number1 * number2);
            break;
        case '/' :
            division();
            break;
        case '%' :
             modulusOperator();
            break;
        case '^' :
            pow();
            break;
        default :
            System.out.println("Вы ввели некорректный символ");
        }
    }

    private void division() {
        if (number2 != 0) {
                System.out.println(number1 / number2);
            } else {
                System.out.println("На ноль делить нельзя!");
            }
    }

    private void modulusOperator() {
        if (number2 != 0) {
                System.out.println(number1 % number2);
            } else {
                System.out.println("На ноль делить нельзя!");
            }
    }

    private void pow() {
        int result = 1;
            for (int i = 0; i < number2; i++) {
                result *= number1;
            }
            System.out.println(result);
    }
}
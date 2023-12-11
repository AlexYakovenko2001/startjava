public class Calculator {
    private int number1;
    private int number2;
    private String sign;

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number) {
        number1 = number;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number) {
        number2 = number;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public void calculate() {
        switch (sign) {
        case "+" : 
            System.out.println(number1 + number2);
            break;
        case "-" : 
            System.out.println(number1 - number2);
            break;
        case "*" :
            System.out.println(number1 * number2);
            break;
        case "/" :
            if (number2 != 0) {
                System.out.println(number1 / number2);
            } else {
                System.out.println("На ноль делить нельзя!");
            }
            break;
        case "%" :
             if (number2 != 0) {
                System.out.println(number1 % number2);
            } else {
                System.out.println("На ноль делить нельзя!");
            }
            break;
        case "^" :
            int result = 1;
            for (int i = 0; i < number2; i++) {
                result *= number1;
            }
            System.out.println(result);
            break;
        default :
            System.out.println("Вы ввели некорректный символ");
        }
    }
}
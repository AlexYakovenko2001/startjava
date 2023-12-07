public class Calculator {
    public static void main(String[] args) {
        int a = 4;
        int b = 0;
        int result = 1;
        char sign = '^';
        if (a > 0 && b > 0) {   
            if (sign == '+') {
                result = a + b;
                System.out.println(a + " " + sign + " " + b + " = " + result);
            } else if (sign == '-') {
                result = a - b;
                 System.out.println(a + " " + sign + " " + b + " = " + result);
            } else if (sign == '*') {
                result = a * b;
                 System.out.println(a + " " + sign + " " + b + " = " + result);
            } else if (sign == '/') {
                result = a / b;
                 System.out.println(a + " " + sign + " " + b + " = " + result);
            } else if (sign == '%') {
                result = a % b;
                 System.out.println(a + " " + sign + " " + b + " = " + result);
            } else if (sign == '^') {
                if (b == 0) {
                    result = 1;
                    System.out.println(a + " " + sign + " " + b + " = " + result);
                }
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
                 System.out.println(a + " " + sign + " " + b + " = " + result);
            }
        }
    }
}
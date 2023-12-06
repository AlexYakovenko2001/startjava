public class Calculator {
    public static void main(String[] args) {
        int a = 4;
        int b = 2;
        int result = 1;
        String sign = "^";
        if (a > 0 && b > 0) {
            if (sign == "+") {
                result = a + b;
                System.out.println(a + " " + sign + " " + b + " = " + result);
            } else if (sign == "-") {
                result = a - b;
                 System.out.println(a + " " + sign + " " + b + " = " + result);
            } else if (sign == "*") {
                result = a * b;
                 System.out.println(a + " " + sign + " " + b + " = " + result);
            } else if (sign == "/") {
                result = a / b;
                 System.out.println(a + " " + sign + " " + b + " = " + result);
            } else if (sign == "%") {
                result = a % b;
                 System.out.println(a + " " + sign + " " + b + " = " + result);
            } else if (sign == "^") {
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
                 System.out.println(a + " " + sign + " " + b + " = " + result);
            }
        }
    }
}
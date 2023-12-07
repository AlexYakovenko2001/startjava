public class VariablesTheme {
    public static void main(String[] args) {
        System.out.println("1. Вывод характеристик компьютера");
        byte graficCard = 8;
        short coreCount = 12;
        int ram = 32;
        long ssd = 1000L;
        float speedOfRam = 3.2f;
        double procSpeed = 4.4;
        boolean isCompNew = true;
        char compCosts = '$';

        System.out.println("CPU has " + coreCount + " cores");
        System.out.println("Grafic card - " + graficCard + "gb");
        System.out.println("RAM - " + ram + "gb");
        System.out.println("SSD - " + ssd + "gb");
        System.out.println("RAM speed - " + speedOfRam + "МНz");
        System.out.println("CPU speed is " + procSpeed + "МНz");
        System.out.println("This computer is new - " + isCompNew);
        System.out.println("It costs 1200" + compCosts);

        System.out.println();
        System.out.println("2. Расчет стоимости товара со скидкой");
        int penCost = 100;
        int bookCost = 200;
        int totalCost = penCost + bookCost;
        int sumOfDiscount = 11 * totalCost / 100;
        int costWithDiscont = totalCost - sumOfDiscount;
        System.out.println("Total cost of pen and book - " + totalCost + "р");
        System.out.println("Total discount - " + sumOfDiscount + "р");
        System.out.println("Discounted price - " + costWithDiscont + "р");

        System.out.println();
        System.out.println("3. Вывод слова JAVA");
        System.out.println("   J    a  v     v  a   \n" + 
            "   J   a a  v   v  a a  \n" + 
            "J  J  aaaaa  V V  aaaaa  \n" + 
            " JJ  a     a  V  a     a");

        System.out.println();
        System.out.println("4. Вывод min и max значений целых числовых типов");
        byte num1 = Byte.MAX_VALUE;
        System.out.println("Значение для переменной типа byte: " + num1 + ", " + num1++ + ", " + num1-- + ";");

        short num2 = Short.MAX_VALUE;
        System.out.println("Значение для переменной типа short: " + num2 + ", " + num2++ + ", " + num2-- + ";");

        int num3 = Integer.MAX_VALUE;
        System.out.println("Значение для переменной типа int: " + num3 + ", " + num3++ + ", " + num3-- + ";");

        long num4 = Long.MAX_VALUE;
         System.out.println("Значение для переменной типа long: " + num4 + ", " + num4++ + ", " + num4-- + ";");

        System.out.println();
        System.out.println("5. Перестановка значений переменных");
        int firstNum = 2;
        int secondNum = 5;
        
        System.out.println("Перемена значений с помощью третьей переменной \n" + 
            "firstNum: " + firstNum + "; secondNum: " + secondNum + ";");
        int thirdNum = firstNum + secondNum;
        firstNum = thirdNum - firstNum;
        secondNum = thirdNum - secondNum;
        System.out.println("firstNum: " + firstNum + "; secondNum: " + secondNum + ";\n");

        System.out.println("Перемена значений с помощью арифметических операций\n" + 
            "firstNum: " + firstNum + "; secondNum: " + secondNum + ";");
        firstNum = firstNum + secondNum;
        secondNum = firstNum - secondNum;
        firstNum = firstNum - secondNum;
        System.out.println("firstNum: " + firstNum + "; secondNum: " + secondNum + ";\n");

        System.out.println("Перемена значений с помощью побитовой операции ^\n" + 
            "firstNum: " + firstNum + "; secondNum: " + secondNum + ";");
        firstNum = secondNum^firstNum; // 5^2 = 7
        secondNum = firstNum^secondNum; // 7^5 = 2
        firstNum = firstNum^secondNum; // 7^2 = 5
        System.out.println("firstNum: " + firstNum + "; secondNum: " + secondNum + ";");

        System.out.println();
        System.out.println("6. Вывод символов и их кодов");
        char dollar = '$';
        char asterisk = '*';
        char atSign = '@';
        char verticalBar = '|';
        char tilde = '~';
        System.out.println((int)dollar + " - " + dollar + "\n" + 
            (int)asterisk + " - " + asterisk + "\n" + 
            (int) atSign + " - " + atSign + "\n" + 
            (int)verticalBar + " - " + verticalBar + "\n" + 
            (int)tilde + " - " + tilde);

        System.out.println();
        System.out.println("7. Вывод в консоль ASCII-арт Дюка");
        char slash = '/';
        char backSlash = '\\';
        char underScore = '_';
        char leftParenthesis = '(';
        char rightParenthesis = ')';
        System.out.println("    " + slash + backSlash + "\n" + 
            "   " + slash + "  " + backSlash + "\n" + 
            "  " + slash + underScore + leftParenthesis + " " + rightParenthesis + backSlash +
            "\n " + slash + "      " + backSlash + "\n" + 
            slash + underScore + underScore + underScore + slash + backSlash +
            underScore + underScore + underScore + backSlash);

        System.out.println();
        System.out.println("8. Вывод количества сотен, десятков и единиц числа");
        int startNumber = 123;
        int digitOfHundreds = 123 / 100;
        int digitbOfTens = 123 % 100 /10 ;
        int digitOfUnits = 123 % 10;
        int sumOfDigits = digitOfHundreds + digitbOfTens + digitOfUnits;
        int productOfDigits = digitOfHundreds * digitbOfTens * digitOfUnits;
        System.out.println("Число " + startNumber + " содержит: \n" + 
            "  сотен - " + digitOfHundreds + "\n" + 
            "  десятков - " + digitbOfTens + "\n" + 
            "  единиц - " + digitOfUnits + "\n" + 
            "Сумма его цифр - " + sumOfDigits + "\n" + 
            "Произведение - " + productOfDigits);

        System.out.println();
        System.out.println("9. Вывод времени");
        int totalTime = 86399;
        int numberOfHours = 86339 / 3600;
        int numberOfMinutes = 86339 % 3600 / 60;
        int numberOfSeconds = 86339 % 3600 % 60;
        System.out.println(numberOfHours + ":" + numberOfMinutes + ":" + numberOfSeconds);
    }
}
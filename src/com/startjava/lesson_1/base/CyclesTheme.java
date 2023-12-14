package com.startjava.lesson_1.base;

public class CyclesTheme {
    public static void main(String[] args) {
        System.out.println("1. Подсчет суммы четных и нечетных чисел");
        int segmentValue = -10;
        int sumOfOdd = 0;
        int sumOfEven = 0;
        while (segmentValue <= 21) {
            if (segmentValue % 2 == 0) {
                sumOfEven += segmentValue;
            } else {
                sumOfOdd += segmentValue;
            }
            segmentValue++;
        }
        System.out.println("В отрезке [-10, 21] сумма четных чисел = " + sumOfEven + ", а нечетных = " + sumOfOdd);

        System.out.println("\n2. Вывод чисел в порядке убывания");
        int num1 = 10;
        int num2 = 5;
        int num3 = -1;

        int min = num1;

        if (min > num3) {
            min = num3;
        } else {
            min = num2;
        }

        int max = num2;

        if (max < num1) {
            max = num1;
        } else {
            max = num3;
        }
        String resultOutput = "";
        for (int i = max - 1; i > min; i--) {
            resultOutput = resultOutput + " " + i;
        }
        System.out.println(resultOutput);

        System.out.println("\n3. Вывод реверсивного числа и суммы его цифр");
        int startNumber = 1234;
        int initValue = 1;
        int sumOfDigits = 0;
        String reverseNumber = "";
        while (initValue < startNumber) {
            sumOfDigits += startNumber / initValue % 10;
            reverseNumber += startNumber / initValue % 10;
            initValue *= 10;
        }
        System.out.println(reverseNumber + "\n" + sumOfDigits);

        System.out.println("\n4. Вывод чисел в несколько строк");
        int count = 0;
        for (int i = 1; i < 24; i +=2) {
            System.out.printf("%2d ", i);
            count++;
            if (count % 5 == 0) {
                System.out.println();
            }
        }

        int numZeros = 5 - (count % 5);
        if (numZeros < 5) {
            for (int i = 0; i < numZeros; i++) {
                System.out.printf("%2d ", 0);
            }
        }

        System.out.println("\n\n5. Проверка количества двоек числа на четность/нечетность");
        int testNumber =  3_242_592;
        int countOfTwos = 0;
        int index = 1;
        while (index < testNumber) {
            if ((testNumber / index) % 10 == 2) {
                countOfTwos += 1;
            }
            index *= 10;
        }
        if (countOfTwos % 2 == 0) {
             System.out.println("В " + testNumber + " четное количество двоек - " + countOfTwos);
        } else {
             System.out.println("В " + testNumber + " нечетное количество двоек - " + countOfTwos);
        }

        System.out.println("\n6. Отображение геометрических фигур");
        for (int i = 0;i < 5;i++) {
            System.out.println("**********");
        }
        System.out.println();
        int rows = 5;
        int row = 0;
        while(row < rows) {
            int column = rows;
            while (column > row) {
                System.out.printf("#");
                column--;
            }
            System.out.println();
            row++;
        }
        
        System.out.println("\n7. Отображение ASCII-символов");
        System.out.printf("%-8s %-10s %-25s%n", "DEXIMAL", "CHARACTER", "DESCRIPTION");
        int deximal = 0;
        for (int i = 15; i <= 47; i++) {
            if (i % 2 != 0) {
                deximal = i;
                char character = (char) deximal;
                String description = Character.getName(deximal);
                System.out.printf("%-8d %-10c %-25s%n", deximal, character, description);
            }
        }
        for (int i = 97; i <= 122; i++) {
            if (i % 2 == 0) {
                deximal = i;
                char character = (char) deximal;
                String description = Character.getName(deximal);
                System.out.printf("%-8d %-8c %-25s%n", deximal, character, description);
            }
        }

        System.out.println("\n8. Проверка, является ли число палиндромом");
        int someNumber = 10_234_321;
        String reverseNumb = "";
        for (int i = 1; i < someNumber; i *= 10) {
            int numberExtraction = someNumber / i % 10;
            reverseNumb += numberExtraction;
        }
        String someNumberStr = Integer.toString(someNumber);
        if (someNumberStr.equals(reverseNumb)) {
            System.out.println("Число " + someNumber + " является палиндромом");
        } else {
            System.out.println("Число " + someNumber + " не является палиндромом");
        }

        System.out.println("\n9. Проверка, является ли число счастливым");
        int happyNumb = 123321;
        int firstHalf = happyNumb / 1000;
        int secondHalf = happyNumb % 1000;
        int sumOfFirstHalf = firstHalf / 100 + (firstHalf % 100) / 10 + (firstHalf % 100) % 10;
        int sumOfSecondHalf = secondHalf / 100 + (secondHalf % 100) / 10 + (secondHalf % 100) % 10;
        if (sumOfFirstHalf == sumOfSecondHalf) {
            System.out.println("Число " + happyNumb + " является счастливым");
            System.out.println("Сумма цифр ABC = " + sumOfFirstHalf + ", а сумма DEF = " + sumOfSecondHalf);
        } else {
            System.out.println("Число " + happyNumb + " не является счастливым");
            System.out.println("Сумма цифр ABC = " + sumOfFirstHalf + ", а сумма DEF = " + sumOfSecondHalf);
        }

        System.out.println("\n10. Отображение таблицы умножения Пифагора");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int multyplication = i * j;
                System.out.printf("%2d ", multyplication);
            }
            System.out.println();
        }
    }
}
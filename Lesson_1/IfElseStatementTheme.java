public class IfElseStatementTheme {
    public static void main(String[] args) {
        System.out.println("1. Перевод псевдокода на язык Java");
        boolean isMen = true;
        if (!isMen) {
            System.out.println("Вы женщина.");
        } else {
            System.out.println("Вы мужчина.");
        }

        int age = 31;
        if (age > 18) {
            System.out.println("Вам больше 18 лет.");
        } else {
            System.out.println("Вам не больше 18 лет.");
        }

        float growth = 1.7f;
        if (growth < 1.8) {
            System.out.println("Вам не слишком повезло с ростом.");
        } else {
            System.out.println("Вам повезло с ростом чуточку больше, чем тем, кто ниже вас.");
        }

        String name = "Alex";
        char firstLetterOfName = name.charAt(0);
        if (firstLetterOfName == 'M') {
            System.out.println("Ваше имя начинается на букву 'M'");
        } else if (firstLetterOfName == 'I') {
            System.out.println("Ваше имя начинается на букву 'I'");
        } else {
            System.out.println("Ваше имя точно не начинается на буквы 'M' или 'I'");
        }

        System.out.println("\n2. Поиск большего числа");
        int randomNumb1 = 12;
        int randomNumb2 = 10;
        if (randomNumb1 > randomNumb2) {
            System.out.println(randomNumb1 + " больше, чем " + randomNumb2);
        } else if (randomNumb1 < randomNumb2) {
            System.out.println(randomNumb1 + " меньше, чем " + randomNumb2);
        } else {
            System.out.println("Числа равны");
        }

        System.out.println("\n3. Проверка числа");
        int testNumber = 355;
        if (testNumber == 0) {
            System.out.println("Проверяемое число равно нулю.");
        } else {
            if (testNumber < 0 && testNumber % 2 == 0) {
                    System.out.println(testNumber + " отрицательное и четное");
            } else if (testNumber < 0 && testNumber % 2 != 0) {
                    System.out.println(testNumber + " отрицательное и нечетное");
            } else if (testNumber % 2 == 1) {
                System.out.println(testNumber + " положительное и нечетное");
            } else {
                System.out.println(testNumber + " положительное и четное");
            }
        }

        System.out.println("\n4. Поиск одинаковых цифр в числах");
          
        System.out.println("\n5. Определение символа по его коду");
        char symbol = '\u0031';
        if (symbol >= 'A' && symbol <= 'Z') {
            System.out.println("Символ " + symbol + " является большой буквой");
        } else if (symbol >= 'a' && symbol <= 'z') {
            System.out.println("Символ " + symbol + " является маленькой буквой");
        } else if (symbol >= '0' && symbol <= '9') {
            System.out.println("Символ " + symbol + " является цифрой");
        } else {
            System.out.println("Символ " + symbol + " не является ни буквой, ни цифрой");
        }

        System.out.println("\n6. Подсчет суммы вклада и начисленных банком %");
        int deposit = 301_000;
        int yearPercent;
        if (deposit > 0) {
            System.out.println("Сумма вклада - " + deposit);
            if (deposit < 100_000) {
                yearPercent = 5;
                int sumOfPercent = yearPercent * deposit / 100;
                int totalSum = deposit + sumOfPercent;
                System.out.println("Сумма начисленного процента - " + sumOfPercent + 
                    "\nИтоговая сумма - " + totalSum);
            } else if (deposit >= 100_000 && deposit <=300_000) {
                 yearPercent = 7;
                int sumOfPercent = yearPercent * deposit / 100;
                int totalSum = deposit + sumOfPercent;
                System.out.println("Сумма начисленного процента - " + sumOfPercent + 
                    "\nИтоговая сумма - " + totalSum);
            } else {
                 yearPercent = 10;
                int sumOfPercent = yearPercent * deposit / 100;
                int totalSum = deposit + sumOfPercent;
                System.out.println("Сумма начисленного процента - " + sumOfPercent + 
                    "\nИтоговая сумма - " + totalSum);
            }
        }

        System.out.println("\n7. Определение оценки по предметам");
        int historyPercentage = 59;
        int programmingPercentage = 92;
        int historyGrade, programmingGrade;
        
        if (historyPercentage <= 60) {
            historyGrade = 2;
        } else if (historyPercentage <= 73) {
            historyGrade = 3;
        } else if (historyPercentage <= 91) {
            historyGrade = 4;
        } else {
            historyGrade = 5;
        }
        if (programmingPercentage <= 60) {
            programmingGrade = 2;
        } else if (programmingPercentage <= 73) {
            programmingGrade = 3;
        } else if (programmingPercentage <= 91) {
            programmingGrade = 4;
        } else {
            programmingGrade = 5;
        }
        int averageGrade = (2 + 5) / 2;
        int averagePercentage = (historyPercentage + programmingPercentage) / 2;
        System.out.println("История - " + historyGrade + "\nПрограммирование " + 
            programmingGrade + "\nCредний балл оценок по предметам - " + averageGrade + 
            "\nсредний % по предметам - " + averagePercentage);

        System.out.println("\n8. Расчет годовой прибыли");
        int salesForMonth = 13_000;
        int monthRent = 5_000;
        int costsOfProduction = 9_000;
        int expenesForYear = (monthRent * 12) + (costsOfProduction * 12);
        int salesForYear = salesForMonth * 12;
        int yearProfit = salesForYear - expenesForYear;
        if (yearProfit == 0) {
            System.out.println("Прибыль за год составляет 0 руб.");
        } else if (yearProfit > 0) {
            System.out.println("Прибыль за год: +" + yearProfit + " руб.");
        } else {
            System.out.println("Прибыль за год: " + yearProfit + " руб.");
        }
    }
}
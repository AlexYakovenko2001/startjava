import java.util.Random;

import java.util.Scanner;

public  class GuessNumberTest {
    public static void main(String[] args) {
        boolean isRepeat = true;
        boolean needToContinue = false;
        while (isRepeat) {
            Scanner scanner = new Scanner(System.in);

            //имя 1 игрока в класс Player закидываю
            System.out.print("Введите имя игрока №1: ");
            String firstPlayer = scanner.next();
            Player player1 = new Player(firstPlayer);
            
            //имя 2 игрока в класс Player закидываю
            System.out.print("Введите имя игрока №2: ");
            String secondPlayer = scanner.next();
            Player player2 = new Player(secondPlayer);

            //передача имён игроков в класс GuessNumber
            GuessNumber gameGuessNumber = new GuessNumber(player1.getName(), player2.getName());

            //устанавка значения загаданного компьютером числа
            Random random = new Random();
            int randomNumber = random.nextInt(100) + 1;
            gameGuessNumber.setGuessedNumber(randomNumber);
            System.out.println("Компьютер загадал число. Теперь вводите числа по очереди.");

            //цикл для повтора ввода чисел
            while (!needToContinue) {
                 //считывание введённого числа
                System.out.print("Введите число: ");
                gameGuessNumber.setEnteredNumber(scanner.nextInt());
                 //запускаю игру
                needToContinue =  gameGuessNumber.getResult();
            }

            //проверка на необходимость продолжения
            while (needToContinue) {
                System.out.print("Хотите продолжить игру? [yes/no]: ");
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
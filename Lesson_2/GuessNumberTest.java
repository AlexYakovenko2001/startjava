import java.util.Random;

import java.util.Scanner;

public  class GuessNumberTest {
    public static void main(String[] args) {
        boolean isRepeat = true;
        boolean needToContinue = false;
        while (isRepeat) {
            //сканеры для имён игроков
            Scanner namePlayer1 = new Scanner(System.in);
            Scanner namePlayer2 = new Scanner(System.in);
            
            //имя 1 игрока в класс Player закидываю
            System.out.println("Введите имя игрока №1: ");
            String firstPlayer = namePlayer1.nextLine();
            Player player1 = new Player(firstPlayer);
            
            //имя 2 игрока в класс Player закидываю
            System.out.println("Введите имя игрока №2: ");
            String secondPlayer = namePlayer2.nextLine();
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
                Scanner enteredNumber = new Scanner(System.in);
                System.out.println("Введите число: ");
                gameGuessNumber.setEnteredNumber(enteredNumber.nextInt());
                 //запускаю игру
                needToContinue =  gameGuessNumber.getResult();
            }

            //проверка на необходимость продолжения
            Scanner userAnswer = new Scanner(System.in);
            while (needToContinue) {
                System.out.println("Хотите продолжить игру? [yes/no]: ");
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
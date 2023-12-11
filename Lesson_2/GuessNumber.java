public class GuessNumber {
    private int guessedNumber;
    private int enteredNumber;
    private String player1;
    private String player2;

    public GuessNumber(String player1, String player2) {
            this.player2 = player2;
            this.player1 = player1;
    }

    public int getGuessedNumber() {
        return guessedNumber;
    }

    public void setGuessedNumber(int number) {
        guessedNumber = number;
    }

    public int getEnteredNumber() {
        return enteredNumber;
    }

    public void setEnteredNumber(int number) {
        enteredNumber = number;
    }

    public boolean getResult() {
        boolean isEnd = false;
        int attemptCounter  = 0;
        while (true) {
            if (enteredNumber > guessedNumber) {
                System.out.println("Число " + enteredNumber + " больше того, что загадал компьютер");
                attemptCounter++;
            } else if (enteredNumber < guessedNumber) {
                System.out.println("Число " + enteredNumber + " меньше того, что загадал компьютер");
                attemptCounter++;
            } else {
                System.out.println("Вы угадали! Число " + enteredNumber + " равно тому, " + 
                    "которое загадал компьютер.");
                if (attemptCounter % 2 == 0) {
                    System.out.println("Победил игрок под именем: " + player2);
                } else {
                    System.out.println("Победил игрок под именем: " + player1);
                }
                isEnd = true;
            }
            break;
        }
        return isEnd;
    }
}
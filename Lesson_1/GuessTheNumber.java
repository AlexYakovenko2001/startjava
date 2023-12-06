public class GuessTheNumber {
    public static void main(String[] args) {
        int guessedNumber = 65;
        int gamerNumber = 70;
        for (int i = 1; i < 100; i++) {
            if (gamerNumber < guessedNumber) {
                System.out.println("Число " + gamerNumber + " меньше того, что загадал компьютер");
                gamerNumber++;
            } else if (gamerNumber > guessedNumber) {
                System.out.println("Число " + gamerNumber + " больше того, что загадал компьютер");
                gamerNumber--;
            } else {
                System.out.println("Вы победили!");
                break;
            }
        }
    }
}
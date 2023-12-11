public class Player {
    private String name;

    public Player(String playerName) {
        name = playerName;
        // if (playerName.length != 0) {
        //     name = playerName;
        // } else {
        //     System.out.println("Incorrect name");
        // }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
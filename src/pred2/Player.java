package pred2;

public class Player {
    private static int playerID = 1;
    private final int ID;
    private final char symbol;

    public Player(char symbol) {
        playerID++;
        this.ID = playerID;
        this.symbol = symbol;
    }

    public static int getPlayerID() {
        return playerID;
    }

    public char getSymbol() {
        return symbol;
    }
}

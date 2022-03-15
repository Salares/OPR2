package ukol2;

public class Main {
    public static void main(String[] args) {
        FilteringManager fm = new FilteringManager();
        Player[] players = new Player[2];

        players[0] = new Player("John", "Doe", "Nick", 'A', "john.doe@email.com",
                Gender.MALE, 180, 90, PlayerPosition.ATTACKER, 100, 100);
        players[1] = new Player("Jane", "Smith", "JayS", 'B', "johny.smith@email.com",
                Gender.FEMALE, 170, 75, PlayerPosition.MIDDLE, 90, 90);


        Player[] filtered = fm.applyFilter(players, Filters.GENDER, "female");

        for (Player player : filtered) {
            System.out.println(player.toString());
        }
    }
}

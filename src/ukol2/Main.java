package ukol2;

public class Main {
    public static void main(String[] args) {
        FilteringManager fm = new FilteringManager();
        Player[] players = new Player[4];

        players[0] = new Player("John", "Alpa", "Nick", 'A', "john.doe@email.com",
                Gender.MALE, 180, 90, PlayerPosition.ATTACKER, 100, 100);
        players[1] = new Player("Jane", "Bane", "JayS", 'B', "jane.bane@email.com",
                Gender.FEMALE, 170, 75, PlayerPosition.MIDDLE, 90, 90);
        players[2] = new Player("Lucas", "Clang", "Lucy", 'C', "lucas.clang@email.com",
                Gender.MALE, 185, 95, PlayerPosition.SWEEPER, 85, 80);
        players[3] = new Player("Kate", "Date", "KayD", 'D', "kate.date@email.com",
                Gender.FEMALE, 175, 78, PlayerPosition.SUPPORT, 70, 60);


        Player[] filtered = fm.applyFilter(players, Filters.SKILL_LEVEL_LOWER_THAN, "87");

        for (Player player : filtered) {
            System.out.println(player.toString());
        }
    }
}

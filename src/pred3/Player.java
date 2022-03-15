package pred3;

import java.time.LocalDate;

public class Player extends Person{
    private String Position;

    public Player(String id, String name, String surname, LocalDate dateOfBirth, String position) {
        super(id, name, surname, dateOfBirth);
        Position = position;
    }

    public String getPosition() {
        return Position;
    }

    public void setPosition(String position) {
        Position = position;
    }
}

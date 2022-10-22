package Animals;

import java.util.Objects;

public class  Flightless extends Birds {
    private final String moveType;

    public Flightless(String name,
                      int yearsOld,
                      String livingEnvironment,
                      String moveType) {
        super(name, yearsOld, livingEnvironment);
        this.moveType = moveType;
    }

    public String walk() {
        return "Гуляю в своей среде обитания";
    }
    @Override
    public String hunts() {
        return super.hunts();
    }

    @Override
    public String eat() {
        return super.eat();
    }

    @Override
    public String sleep() {
        return super.sleep();
    }

    @Override
    public String move() {
        return super.move();
    }

    public String getMoveType() {
        return moveType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Flightless notFlying = (Flightless) o;
        return Objects.equals(moveType, notFlying.moveType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), moveType);
    }

    @Override
    public String toString() {
        return super.toString() +
                "moveType='" + moveType + '\'' +
                '}';
    }
}

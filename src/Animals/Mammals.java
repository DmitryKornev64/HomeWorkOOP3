package Animals;

import java.util.Objects;

abstract class Mammals extends Animals {
    private  final String livingEnvironment;
    private final String speed;
    public abstract String walk(); // гулять


    public Mammals(String name,
                   int yearsOld,
                   String livingEnvironment,
                   String speed) {
        super(name, yearsOld);
        this.livingEnvironment = livingEnvironment;
        this.speed = speed;
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public String getSpeed() {
        return speed;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Mammals mammals = (Mammals) o;
        return Objects.equals(livingEnvironment, mammals.livingEnvironment) && Objects.equals(speed, mammals.speed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment, speed);
    }

    @Override
    public String toString() {
        return super.toString()+
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", speed='" + speed + '\'' +
                '}';
    }
}

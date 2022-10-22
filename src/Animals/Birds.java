package Animals;

import java.util.Objects;

abstract class Birds extends Animals {
    private final String livingEnvironment;

    public Birds(String name,
                 int yearsOld,
                 String livingEnvironment) {
        super(name, yearsOld);
        this.livingEnvironment = livingEnvironment;
    }


    public String hunts() {
        return "Пикирую к воде под прикрытием ночи, чтобы поймать рыбу на водно-болотных угодьях и лесных реках";
    }

    @Override
    public String eat() {
        return "Клевать";
    }

    @Override
    public String sleep() {
        return "Сплю в своих гнездах, которые обустраиваю не только на деревьях, но и на земле, на воде, на крутых утесах или в норах.";
    }

    @Override
    public String move() {
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Birds birds = (Birds) o;
        return Objects.equals(livingEnvironment, birds.livingEnvironment);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), livingEnvironment);
    }

    @Override
    public String toString() {
        return super.toString() +
                "Среда обитания " + livingEnvironment +
                '\'' +
                '}';
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }
}

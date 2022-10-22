package Animals;

import java.util.Objects;

public class Predators extends Mammals {
    private  final String typeOfFood = "Мясо";

    public Predators(String name,
                     int yearsOld,
                     String livingEnvironment,
                     String speed) {
        super(name, yearsOld, livingEnvironment, speed);
    }

    public String hunts() {
        return "Подкрадываюсь и нападаю или загоняю добычу пока не устанет";
    }

    @Override
    public String eat() {
        return "Откусываю куски мяса и ем";
    }

    @Override
    public String sleep() {
        return "Сплю много, чаще днем";
    }

    @Override
    public String move() {
        return "Передвигаюсь быстро и тихо";
    }

    @Override
    public String walk() {
        return   "Гуляю в своей среде обитания";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Predators predators = (Predators) o;
        return Objects.equals(typeOfFood, predators.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return super.toString() +
                "typeOfFood='" + typeOfFood + '\'' +
                '}';
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }
}

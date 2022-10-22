package Animals;

import java.util.Objects;

public class Herbivores  extends Mammals{
    private  final String typeOfFood = "Раститиельная пища";

    public Herbivores(String name,
                      int yearsOld,
                      String livingEnvironment,
                      String speed) {
        super(name, yearsOld, livingEnvironment, speed);
    }

    public String graze() {
        return "Пастись";
    }

    @Override
    public String eat() {
        return "Потребляю не только растения, но и зерна, семена и фрукты, чтобы иметь возможность получать достаточно энергии для поддержания тканей и воспроизводства";
    }

    @Override
    public String sleep() {
        return "Сон короткий, продолжительностью 35 минут или меньше, а спать могу лежа или стоя";
    }

    @Override
    public String move() {
        return "Передвигаеюсь вместе со стадом";
    }

    @Override
    public String walk() {
        return "Гуляю на лугах и полях ";
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Herbivores that = (Herbivores) o;
        return Objects.equals(typeOfFood, that.typeOfFood);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), typeOfFood);
    }

    @Override
    public String toString() {
        return super.toString() +
                " Тип пищи: " + typeOfFood + '\'' +
                '}';
    }

    public String getTypeOfFood() {
        return typeOfFood;
    }
}

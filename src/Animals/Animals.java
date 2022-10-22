package Animals;

import java.util.Objects;

abstract class Animals {
    private String name;
    private int yearsOld;

    // кушать
    abstract String eat();
    // спать
    abstract String sleep();
    // перемещаться
    abstract String move();


    public Animals(String name, int yearsOld) {
        if (name != null || !name.isBlank()) {
            this.name = name;
        }
        if (yearsOld > 0) {
            this.yearsOld = yearsOld;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null || !name.isBlank()) {
            this.name = name;
        }
    }

    public int getYearsOld() {
        return yearsOld;
    }

    public void setYearsOld(int yearsOld) {
        if (yearsOld > 0) {
            this.yearsOld = yearsOld;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animals animals = (Animals) o;
        return yearsOld == animals.yearsOld && Objects.equals(name, animals.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, yearsOld);
    }

    @Override
    public String toString() {
        return "Animals{" +
                "name='" + name + '\'' +
                ", yearsOld=" + yearsOld +
                '}';
    }
}

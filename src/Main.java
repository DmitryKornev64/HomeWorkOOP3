import Transport.Car;
import Transport.Train;
import Transport.Bus;
import Animals.*;


public class Main {
    public static void main(String[] args) {
        // Задание 1
        System.out.println(" Задание 1");
        Car lada = new Car(
                null,
                "Granta",
                0,
                "",
                "желтый",
                3.0f,
                null,
                null,
                null,
                0,
                null,
                null,
                new Car.Insurance(),
                122);

        Car audi = new Car(
                "audi",
                "A8 50 L TDI quattro",
                2022,
                "Germane",
                "желтый", 3.0f,
                null, null,
                null,
                0,
                null,
                null,
                new Car.Insurance(),
                221);

        Car bmw = new Car(
                "BMW",
                "Z9",
                2021,
                "Germane",
                "черный",
                3.0f,
                null,
                null,
                null,
                0,
                null,
                new Car.Key(),
                null,
                0);

        Car kia = new Car(
                "Kia",
                "Sportage 4",
                2018,
                "South Korea",
                "красный",
                2.4f,
                null,
                null,
                null,
                0, null,
                new Car.Key(),
                new Car.Insurance(),
                231);

        Car hyundai = new Car(
                "Hyundai",
                "Avente",
                2016,
                "South Korea",
                "оранжевый",
                1.6f,
                null,
                null,
                null,
                0,
                null,
                null,
                null,
                144);

        Car lada2 = new Car(
                null,
                "Granta",
                0,
                "",
                "",
                0,
                null,
                "",
                null,
                0,
                null,
                null,
                new Car.Insurance(),
                322);

        System.out.println("lada.toString() = " + lada.toString());
        System.out.println("kia.toString() = " + kia.toString());
        System.out.println("lada2.toString() = " + lada2.toString());

        System.out.println(lada.isCorrectRegNumber());
        System.out.println(lada2.isCorrectRegNumber());

        // Задание 2
        System.out.println(" Задание 2");
        Train lastochka = new Train(
                "Ласточка",
                "B-901",
                2011,
                "Россия",
                null, 301,
                3500,
                0,
                "Белорусский вокзал",
                "Минск-Пассажирский",
                11);

        Train leningrad = new Train(
                "Ленинград",
                "D-125",
                2019,
                "Россия",
                null,
                270,
                1700,
                0,
                "Ленинградский вокзал",
                "Ленинград - Пассажирский",
                8);

        System.out.println("lastochka.toString() = " + lastochka.toString());
        System.out.println("leningrad.toString() = " + lastochka.toString());

        // Задание 3
        System.out.println(" Задание 3");
        Bus man = new Bus(
                "MAN ",
                "Lion’s City G/GL",
                2018,
                "Германия",
                null,
                180,
                423);

        Bus nefAz = new Bus(
                "НефАЗ",
                "-5299",
                2000,
                "Россия",
                null,
                150,
                9763);

        System.out.println("bus1.toString() = " + man.toString());
        System.out.println("bus2.toString() = " + nefAz.toString());

        // дз 2
        // Задание 1
        System.out.println("  дз 2");
        System.out.println(" Задание 1");
        leningrad.refill();
        lada.refill();
        man.refill();

        // дз 3
        // Задание 1
        System.out.println("  дз 3");
        System.out.println(" Задание 1");

        Herbivores horse = new Herbivores(
                "Звездочка",
                13,
                "Степи и луга",
                "88 км/ч");

        Herbivores giraffe = new Herbivores(
                "Рафик",
                19,
                "Саванна",
                "Жираф бегает со коростью жирафа");

        Herbivores gazelle = new Herbivores("Галина",
                7,
                "Саванны Африки",
                "97 км/ч");

        Predators hyena = new Predators(
                "Локки",
                5,
                "Cаванна",
                "64 км/ч");

        Predators tiger = new Predators(
                "Шерхан",
                8,
                "Джунгли",
                "50 км/ч");

        Predators bear = new Predators(
                "Баллу",
                15,
                "Лес",
                "55 км/ч");

        Amphibians frog = new Amphibians(
                "Квакушка",
                2,
                "Болота и озера");

        Amphibians already = new Amphibians(
                "Ужик",
                1,
                "Болота и озера");

        Flightless peacock = new Flightless(
                "Паша",
                4,
                "Лесистая местность",
                "Пешком на своих двоих");

        Flightless penguin = new Flightless(
                "Гоша",
                3,
                "Антарктика",
                "Вразвалочку, ну и плавают хорошо");

        Flightless dodoBird = new Flightless(
                "Маргарита",
                8,
                "Городские джунгли",
                "Курьером");

        Flying gull = new Flying(
                "Джонатон Ливингстон",
                5,
                "Побережье морей и океанов",
                "Летает");

        Flying albatross = new Flying(
                "Лабрадор",
                3,
                "Побережье морей и океанов",
                "Летает");

        Flying falcon = new Flying(
                "Томас",
                9,
                "Повсеместно",
                "Летает");

        System.out.println("horse.toString() = " + horse.toString());
        System.out.println("frog.toString() = " + frog.toString());
        System.out.println("gull.toString() = " + gull.toString());
        System.out.println("dodoBird.toString() = " + dodoBird.toString());
        System.out.println("bear.toString() = " + bear.toString());

    }
}
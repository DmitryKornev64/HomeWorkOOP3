package Transport;

import java.time.LocalDate;
import java.util.Objects;

public class  Car extends Transport {
    private float engineVolume; // объем двигателя
    private String bodyType; // тип кузова
    private String registrationNumber; // регистрационный номер
    private int seats; // количество мест
    private String tires; // тип шин
    private String transmission;// коробка передач
    private Key key; // ключ
    private Insurance insurance; // страховка

    public Car(String brand,
               String model,
               int productionYears,
               String productionCountry,
               String color,
               float engineVolume,
               String transmission,
               String bodyType,
               String registrationNumber,
               int seats,
               String tires,
               Key key,
               Insurance insurance,
               int maxSpeed) {

        super(brand,
                model,
                productionYears,
                productionCountry,
                color,
                maxSpeed);

        this.setEngineVolume(engineVolume);
        this.setTransmission(transmission);
        this.setRegistrationNumber(registrationNumber);
        if (bodyType == null || bodyType.isEmpty() || bodyType.isBlank()) {
            this.bodyType = "default";
        } else {
            this.seats = seats;
        }
        this.setTires(tires);
        if (key == null) {
            this.key = new Key();
        } else {
            this.key = key;
        }
        if (insurance == null) {
            this.insurance = new Insurance();
        } else {
            this.insurance = insurance;
        }
    }
    public float getEngineVolume() {
        return engineVolume;
    }
    public String getTransmission() {
        return transmission;
    }
    public String getBodyType() {
        return bodyType;
    }
    public String getRegistrationNumber() {
        return registrationNumber;
    }
    public int getSeats() {
        return seats;
    }
    public String getTires() {
        return tires;
    }
    public Key getKey() {
        return key;
    }
    public Insurance getInsurance() {
        return insurance;
    }
    public void setEngineVolume(float engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.5f;
        } else {
            this.engineVolume = engineVolume;
        }
    }
    public void setTransmission(String transmission) {
        if (transmission == null || transmission.isEmpty() || transmission.isBlank()) {
            this.transmission = "default";
        } else {
            this.transmission = transmission;
        }
    }
    public void setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.isBlank() || registrationNumber.isEmpty()) {
            this.registrationNumber = "х000хх000";
        } else {
            this.registrationNumber = registrationNumber;
        }
    }
    public void setTires(String tires) {
        if (tires == null || tires.isBlank() || tires.isEmpty()) {
            this.tires = "default";
        } else {
            this.tires = tires;
        }
    }


    public void refill() {
        System.out.println("Можно заправлять бензином, дизелем на заправке или заряжать на специальных электропарковках, если это электрокар.");
    }


    public String toString() {
        return "Car{" + "engineVolume=" + engineVolume +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", seats=" + seats +
                ", tires='" + tires + '\'' +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Float.compare(car.engineVolume, engineVolume) == 0 && seats == car.seats && Objects.equals(transmission, car.transmission) && Objects.equals(bodyType, car.bodyType) && Objects.equals(registrationNumber, car.registrationNumber) && Objects.equals(tires, car.tires) && Objects.equals(key, car.key) && Objects.equals(insurance, car.insurance);
    }


    public int hashCode() {
        return Objects.hash(engineVolume, transmission, bodyType, registrationNumber, seats, tires, key, insurance);
    }

    public void changeTires() {
        if (tires.equals("winter")) {
            this.tires = "summer";
        } else if (tires.equals("summer")) {
            this.tires = "winter";
        } else {
            this.tires = "winter";
        }
    }
    public boolean isCorrectRegNumber() { // ПРОВЕРКА ПРАВИЛЬНОСТИ НАПИСАНИЯ НОМЕРА АВТО
         //        х000хх000
        if (registrationNumber.length() != 9) {
            return false;
        }
        char[] chars = registrationNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) ||
                !Character.isAlphabetic(chars[4]) ||
                !Character.isAlphabetic(chars[5])) {
            return false;
        }
        if (!Character.isDigit(chars[1]) ||
                !Character.isDigit(chars[2]) ||
                !Character.isDigit(chars[3])
                || !Character.isDigit(chars[6]) ||
                !Character.isDigit(chars[7]) ||
                !Character.isDigit(chars[8])) {
            return false;
        }
        return true;
    }

    public static class Key { // вложенный класс «Ключ»
        private final boolean remoteStart;
        private final boolean keylessAccess;
        public Key(boolean remoteStart, boolean keylessAccess) {
            this.remoteStart = remoteStart;
            this.keylessAccess = keylessAccess;
        }
        public Key() {
            this(false, false);
        }
        public boolean isRemoteStart() {
            return remoteStart;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }
        @Override
        public String toString() {
            return "Key{" +
                    "remoteStart=" + remoteStart +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }
    public static class Insurance { // вложенный класс «Страховка»
        private final LocalDate expireDay;
        private final int cost;
        private final String number;
        public Insurance() {
            this(null, 10000, null);
        }

        public Insurance(LocalDate expireDay, int cost, String number) {
            if (expireDay == null) {
                this.expireDay = LocalDate.now().plusDays(365);
            } else {
                this.expireDay = expireDay;
            }
            this.cost = cost;
            if (number == null || number.isEmpty() || number.isBlank()) {
                this.number = "123456789";
            } else {
                this.number = number;
            }
        }

        public String toString() {
            return "Insurance{" +
                    "expireDay=" + expireDay +
                    ", cost=" + cost +
                    ", number='" + number + '\'' +
                    '}';
        }
        public LocalDate getExpireDay() {
            return expireDay;
        }
        public int getCost() {
            return cost;
        }
        public String getNumber() {
            return number;
        }
        public void checkExpireDay() {
            if (expireDay.isBefore(LocalDate.now()) || expireDay.isEqual(LocalDate.now())) {
                System.out.println("Нужно ехать оформлять новую страховку!");
            }
        }
        public void checkNumber() {
            if (number.length() != 9) {
                System.out.println("Номер страховки некоректный");
            }
        }
    }
}
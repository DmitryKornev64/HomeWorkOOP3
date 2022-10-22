package Transport;

public abstract class Transport {

    private String brand; //«Марка»
    private String model; // «Модель»
    private final int productionYears; // «Год выпуска»
    private final String productionCountry; // «Страна производства»
    private String color; // «Цвет кузова»
    private int maxSpeed; // «Максимальная скорость передвижения»

    // КОНСТРУКТОР
    public Transport(String brand,
                     String model,
                     int productionYears,
                     String productionCountry,
                     String color,
                     int maxSpeed) {

        if (brand == null || brand.isBlank() || brand.isEmpty()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isBlank() || model.isEmpty()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (productionYears <= 0) {
            this.productionYears = 2000;
        } else {
            this.productionYears = productionYears;
        }
        if (productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()) {
            this.productionCountry = "default";
        } else {
            this.productionCountry = productionCountry;
        }
        this.setColor(color);
        this.setMaxSpeed(maxSpeed);
    }

    public abstract void refill(); // абстрактный метод заправки

    // ГЕТТЕРЫ СЕТТЕРЫ
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYears() {
        return productionYears;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setColor(String color) {
        if (color == null || color.isBlank() || color.isEmpty()) {
            this.color = "Белый";
        } else {
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed == 0) {
            this.maxSpeed = 120;
        } else {
            this.maxSpeed = maxSpeed;
        }

    }


    public String toString() {
        return "Transport.Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", productionYears=" + productionYears +
                ", productionCountry='" + productionCountry + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}

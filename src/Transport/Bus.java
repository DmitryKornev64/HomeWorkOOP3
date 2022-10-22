package Transport;

public class Bus extends Transport {
    private int numberRoute;

    public Bus(String brand,
               String model,
               int productionYears,
               String productionCountry,
               String color,
               int maxSpeed,
               int numberRoute) {

        super(brand, model, productionYears, productionCountry, color, maxSpeed);
        this.numberRoute = numberRoute;
    }

    public int getNumberRoute() {
        return numberRoute;
    }

    public void setNumberRoute(int numberRoute) {
        this.numberRoute = numberRoute;
    }

    public void refill() {
        System.out.println("Можно заправлять бензином или дизелем на заправке");
    }
}
package  Seminar1;

public class HotDrink extends Product {
    private double temperature;
    private double Volume;

    public HotDrink(String name, double cost, double temperature, double volume) {
        super(name, cost);
        this.temperature = temperature;
        this.Volume = volume;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getVolume() { return Volume;}

    public void setVolume(double volume) { Volume = volume;}
}
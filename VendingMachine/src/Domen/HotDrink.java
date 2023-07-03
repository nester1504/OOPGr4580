package Domen;

public class HotDrink extends Product {

    private int temperature;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }


    public HotDrink(int price, int place, String name, long id, int temperature) {
        super(price, place, name, id);
        if (temperature > 90 && temperature < 96) {
            this.temperature = temperature;
        } else {
            this.temperature = 90;
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\ntemperature = " + temperature;
    }
}

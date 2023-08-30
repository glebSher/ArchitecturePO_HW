import java.awt.Color;

public class Sedan extends Car implements iRefueling {

    @Override
    public void fuel() {

    }

    private int loadCapacity;

    public Sedan(String manufacturer, String model, Color color,
            TypeCar bodyType, TypeGearbox gearboxType, TypeFuel fuelType,
            int quantityWeel, double engineCapacity, int loadCapacity) {
        super(manufacturer, model, color, bodyType, gearboxType, fuelType, quantityWeel, engineCapacity);
        this.loadCapacity = loadCapacity;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {

        this.loadCapacity = loadCapacity;
    }

    @Override
    public int gearShifting(int gear) {
        return 0;
    }
}

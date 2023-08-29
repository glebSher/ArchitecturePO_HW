import java.awt.*;

/**
 * Car
 */
abstract class Car {

    private String manufacturer;
    private String model;
    private Color color;
    private TypeCar bodyType;
    private TypeGearbox gearboxType;
    private TypeFuel fuelType;
    private int quantityWeel;
    private double engineCapacity;

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public TypeCar getBodyType() {
        return bodyType;
    }

    public void setBodyType(TypeCar bodyType) {
        this.bodyType = bodyType;
    }

    public TypeGearbox getGearboxType() {
        return gearboxType;
    }

    public void setGearboxType(TypeGearbox gearboxType) {
        this.gearboxType = gearboxType;
    }

    public TypeFuel getFuelType() {
        return fuelType;
    }

    public void setFuelType(TypeFuel fuelType) {
        this.fuelType = fuelType;
    }

    public int getQuantityWeel() {
        return quantityWeel;
    }

    public void setQuantityWeel(int quantityWeel) {
        this.quantityWeel = quantityWeel;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }
}
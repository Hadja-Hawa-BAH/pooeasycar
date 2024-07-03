package fr.afpa.pooeasycar.easycar;

import java.time.LocalDate;

public abstract class MotorizedVehicle extends Vehicle {
    // Attributs
    public enum FuelType{
        ESSENCE,
        DIESEL, 
        ELECTRIC
    }

    private FuelType fuelType;
    private int fuelConsomption;
    private boolean integratredGPS;

    // Constructeurs
    protected MotorizedVehicle(String brand, String model, String color, LocalDate buyingDate, double pricePerDay,
            FuelType fuelType, int fuelConsomption, boolean integratredGPS) {
        super(brand, model, color, buyingDate, pricePerDay);

        this.fuelType = fuelType;
        this.fuelConsomption = fuelConsomption;
        this.integratredGPS = integratredGPS;
    }

    // Getters
    public FuelType getFuelType() {
        return fuelType;
    }

    public int getFuelConsomption() {
        return fuelConsomption;
    }

    // Setters
    public boolean isIntegratredGPS() {
        return integratredGPS;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public void setFuelConsomption(int fuelConsomption) {
        this.fuelConsomption = fuelConsomption;
    }

    public void setIntegratredGPS(boolean integratredGPS) {
        this.integratredGPS = integratredGPS;
    }

    // Fonction tostring
    @Override
    public String toString() {
        return "\nMotorizedVehicle [\nCarburant= " + fuelType + ", \nConsommation de carburant= " + fuelConsomption + ", \nGPS intégré= "
                + integratredGPS + ", \nMarque= " + getBrand() + ", \nModèle= " + getModel() + ", \nCouleur= " + getColor() + ", \nDate d'achat= " + getBuyingDate() + ", \nPrix par jour=" + getPricePerDay()
                + "]";
    }
}

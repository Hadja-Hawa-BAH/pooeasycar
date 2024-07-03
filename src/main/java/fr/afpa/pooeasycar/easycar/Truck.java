package fr.afpa.pooeasycar.easycar;

import java.time.LocalDate;

public class Truck extends MotorizedVehicle{
    //Attributs
    private double cargoCapacity;

    //Constructeurs
    public Truck(String brand, String model, String color, LocalDate buyingDate, double pricePerDay, FuelType fuelType,
            int fuelConsomption, boolean integratredGPS, double cargoCapacity) {
        super(brand, model, color, buyingDate, pricePerDay, fuelType, fuelConsomption, integratredGPS);
        this.cargoCapacity = cargoCapacity;
    }

    //Getters
    public double getCargoCapacity() {
        return cargoCapacity;
    }

    //Setters
    public void setCargoCapacity(double cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    //Fonction tostring
    @Override
    public String toString() {
        return "\nTruck [\nCapacite de chargement= " + cargoCapacity + ", \nMarque= "
                + getBrand() + ", \nModèle= " + getModel() + ", \nCouleur= " + getColor() + ", \nCarburant= "
                + getFuelType() + ", \nDate d'achat= " + getBuyingDate() + ", \nConsommation de carburant= "
                + getFuelConsomption() + ", \nPrix par jour=" + getPricePerDay() + ", \nGPS intégré= "
                + isIntegratredGPS() + "]";
    }

    



    

    

    

    
}

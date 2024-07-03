package fr.afpa.pooeasycar.easycar;

import java.time.LocalDate;

public class Car extends MotorizedVehicle {

    //Attributs
    private int seats;
    
    //Constructeurs
    public Car(String brand,
     String model, 
     String color,
      LocalDate buyingDate, 
      double pricePerDay,
       FuelType fuelType,
    int fuelConsomption, 
    boolean integratredGPS, 
    int seats) {
        super(brand, model, color, buyingDate, pricePerDay, fuelType, fuelConsomption, integratredGPS);
        this.seats = seats;
    }
    
    //Getters
    public int getSeats(){
        return seats;
    }

    //Setters
    public void setSeats(int seats){
        this.seats = seats;
    }

    //Fonction tostring
    @Override
    public String toString(){
        return super.toString()
        + "\nPlaces: " + getSeats();
        
    }
    
}

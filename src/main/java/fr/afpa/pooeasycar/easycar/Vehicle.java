package fr.afpa.pooeasycar.easycar;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Vehicle {
    //Attributs
    private String brand;
    private String model;
    private String color;
    private LocalDate buyingDate;
    private double pricePerDay;
    private ArrayList<Reservation> reservations = new ArrayList<>();

    //Constructeurs
    protected Vehicle(String brand, String model, String color, LocalDate buyingDate, double pricePerDay) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.buyingDate = buyingDate;
        this.pricePerDay = pricePerDay;
    }

    //Getters
    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public LocalDate getBuyingDate() {
        return buyingDate;
    }
    
    public double getPricePerDay() {
        return pricePerDay;
    }
    
    public ArrayList<Reservation> getReservations(){
        return reservations;
    }
    
    //Setters
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setBuyingDate(LocalDate buyingDate) {
        this.buyingDate = buyingDate;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public void setReservations(ArrayList<Reservation> reservations){
        this.reservations = reservations;
    }

    //Fonction tostring
    public String toString(){
        return "\nVéhicule  {"
        + "\nMarque: " + getBrand()
        + "\nModèle: " + getModel()
        + "\nCouleur: " + getModel()
        + "\nDate de vente: " + getBuyingDate()
        + "\nPrix par jour: " + getPricePerDay()
        + "}";
    }

    
    
    

    


    
}

package fr.afpa.pooeasycar.easycar;

import java.time.LocalDate;

public class Bike extends Vehicle{
    //Attributs
    private char size;

    //Constructeurs
    public Bike(String brand, String model, String color, LocalDate buyingDate, double pricePerDay, char size) {
        super(brand, model, color, buyingDate, pricePerDay);
        this.size = size;
    }

    //Getters
    public char getSize() {
        return size;
    }

    //Setters
    public void setSize(char size) {
        this.size = size;
    }

    //Fonction tostring
    @Override
    public String toString() {
        return "\nBike [\nsize= " + size + ", \nMarque= " + getBrand() + ", \nModèle= "
                + getModel() + ", \nCouleur= " + getColor() + ", \nDate d'achat= " + getBuyingDate()
                + ", \nPrix par jour= " + getPricePerDay() + "]";
    }

    

    

    

    

    
}

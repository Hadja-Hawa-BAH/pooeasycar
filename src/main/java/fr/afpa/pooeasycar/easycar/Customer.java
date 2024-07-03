package fr.afpa.pooeasycar.easycar;

import java.util.ArrayList;

public class Customer {

    //Attributs
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private String postalCode;
    private ArrayList<Reservation> reservations =  new ArrayList<Reservation>();

    //Constructeur
    public Customer(String firstName, String lastName, String address, String city, String postalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.postalCode = postalCode;
            
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    //Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    
    //Fonction tostring
    @Override
    public String toString() {
        return "\nCustomer [\nNom=" + getFirstName() + ", \nPrenom=" + getLastName() + ", \nAdresse=" + getAddress() + ", \nVille=" + getCity()
                + ", \nCode Postal=" + getPostalCode() + "]";
    }

    //Fonction pour calculer le total d'argent dépensé
    public double totalMoneySpent(){
        double istotal = 0;
        for(Reservation reservation: reservations){
            istotal += reservation.totalPrice();
        }
        return istotal;
    }

    //Fonction pour ajouter une reservation au client
    public void addReservation(Reservation reservation){

        //Vérifier si la réservation existe
        if (reservations.contains(reservation)){
       
            //Ajouter une réservation 
            reservations.add(reservation);
        }
    }

    //Fonction pour supprimer une reservation
    public boolean removeReservation(Reservation reservation){
       if (reservations.contains(reservation)){
        reservations.remove(reservation);
        return true;

       } else {
        return false;
       } 
    }

    

    

    

    



    
}

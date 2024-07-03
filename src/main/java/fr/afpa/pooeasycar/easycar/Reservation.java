package fr.afpa.pooeasycar.easycar;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation {

    //Attributs
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean paid;
    private Vehicle vehicle;
    
    //Constructeurs
    public Reservation(LocalDate startDate, LocalDate endDate, boolean paid, Vehicle vehicle) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.paid = paid;
        this.vehicle = vehicle;
    }

    //Getters
    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public boolean isPaid() {
        return paid;
    }

    //Setters
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    //Fonction tostring
    @Override
    public String toString() {
        return "Reservation [Date de début=" + startDate + ", Date de fin=" + endDate + ", Payé=" + paid + ", Vehicule="
                + vehicle + "]";
    }    

    //Fonction pour calculer le prix total
    public double totalPrice(){
        LocalDate start = LocalDate.parse("2023-06-01");
        LocalDate end = LocalDate.parse("2023-06-15");
        
        //Calculer le nombre de jours à partir de la dtae de début et de fin de réservation 
        long diffInDays = ChronoUnit.DAYS.between(start, end);
        
        //Calculer le prix total
        return diffInDays * vehicle.getPricePerDay();

    }

   

    

    

    
    
}

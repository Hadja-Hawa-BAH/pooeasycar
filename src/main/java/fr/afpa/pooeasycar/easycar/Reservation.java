package fr.afpa.pooeasycar.easycar;

import java.io.Serializable;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Reservation implements Serializable {

    // Attributs
    private LocalDate startDate;
    private LocalDate endDate;
    private boolean paid;
    private Vehicle vehicle;

    // Constructeurs
    public Reservation(LocalDate startDate, LocalDate endDate, boolean paid, Vehicle vehicle) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.paid = paid;
        this.vehicle = vehicle;
    }

    // Getters
    public LocalDate getStartDate() {
        return startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public boolean isPaid() {
        return paid;
    }

    // Setters
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public void setPaid(boolean paid) {
        this.paid = paid;
    }

    // Fonction tostring
    @Override
    public String toString() {
        return "\nReservation [\nDate de début= " + startDate + ", \nDate de fin= " + endDate + ", \nPayé= " + paid
                + ", \nVehicule= "
                + vehicle + "]";
    }

    // Fonction pour calculer le prix total
    public double totalPrice() {
        boolean isDateEquals = startDate.equals(endDate);
        long diffInDays = 0;

        if (isDateEquals) {
            diffInDays = 1;
            
        } else {

            // Calculer le nombre de jours à partir de la date de début et de fin de réservation
            diffInDays = ChronoUnit.DAYS.between(this.startDate, this.endDate);
        }
        // Calculer le prix total
        return diffInDays * this.vehicle.getPricePerDay();

    }

}

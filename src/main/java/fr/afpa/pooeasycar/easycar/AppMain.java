package fr.afpa.pooeasycar.easycar;

import java.time.LocalDate;

public class AppMain {
	public static void main(String[] args) {

		//Intanciation des objets
		// Truck truck1 = new Truck("Nissan", "Daf", "Noir", LocalDate.of(2023, 5, 10), 40, MotorizedVehicle.FuelType.ELECTRIC, 9, false, 20);
		// System.out.println(truck1);

		//  Car car1 = new Car("Nissan", "Juke", "Rouge", LocalDate.of(2020, 5, 13), 34.0, MotorizedVehicle.FuelType.Diesel, 4, false, 4);
		//System.out.println(car1);

		Bike bike1 = new Bike("decatlon", "course", "vert", LocalDate.of(2020, 07, 03), 10, 'M');
		System.out.println(bike1);
	
		// Customer customer1 = new Customer("toto", "tata", "29 rue toto tata", "Bordeaux", "33000");
		// System.out.println(customer1);
		// customer1.addReservation(null);
		// customer1.removeReservation(null);
		// System.out.println(customer1.removeReservation(null));

		// Reservation reservation1 = new Reservation("2023-06-01",  "2023-06-01", false, Vehicle.MotorizedVehicle.Car);
		// System.out.println(reservation1);

	}

}

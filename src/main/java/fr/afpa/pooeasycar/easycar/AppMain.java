package fr.afpa.pooeasycar.easycar;

import java.time.LocalDate;
import java.util.ArrayList;

public class AppMain {
	public static void main(String[] args) {

		//Intanciation des objets
		Truck truck1 = new Truck("Nissann", "Daf", "Noir", LocalDate.of(2023, 5, 10), 40, MotorizedVehicle.FuelType.ELECTRIC, 9, false, 20);
		// System.out.println(truck1);

		Car car1 = new Car("Nissan", "Juke", "Rouge", LocalDate.of(2020, 5, 13), 34.0, MotorizedVehicle.FuelType.DIESEL, 4, false, 4);
		//System.out.println(car1);

		Bike bike1 = new Bike("decatlon", "course", "vert", LocalDate.of(2020, 07, 03), 10, 'M');
		// System.out.println(bike1);
	
		Vehicle vehicle1 = new Car("Nissan", "Juke", "Rouge", LocalDate.of(2020, 5, 13), 10, MotorizedVehicle.FuelType.DIESEL, 20, false, 4);
		System.out.println(vehicle1); 
		
		Reservation reservation1 = new Reservation(LocalDate.parse("2023-06-01"),  LocalDate.parse("2023-06-01"), false, vehicle1);
		System.out.println(reservation1);
		System.out.println(reservation1.totalPrice());
		
		Reservation reservation2 = new Reservation(LocalDate.of(2023, 06, 12),  LocalDate.parse("2023-06-13"), false, vehicle1);
		System.out.println(reservation2);
		System.out.println(reservation2.totalPrice());
		
		Customer customer1 = new Customer("toto", "tata", "29 rue toto tata", "Bordeaux", "33000");
		System.out.println(customer1);
		customer1.addReservation(reservation1);
		//System.out.println(customer1.addReservation(reservation2));
		customer1.removeReservation(reservation1);
		System.out.println(customer1.removeReservation(reservation2));
		System.out.println(customer1.totalMoneySpent());

		//Liste des véhicules
		ArrayList<Vehicle> vehicles = new ArrayList<>();
		vehicles.add(truck1);
		vehicles.add(car1);
		vehicles.add(bike1);

		for (Vehicle vehicle: vehicles){
			System.out.println(vehicle);
		}



		
			
	

	}

}

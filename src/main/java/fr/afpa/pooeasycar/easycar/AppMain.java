package fr.afpa.pooeasycar.easycar;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class AppMain {
	public static void main(String[] args) {

		try{

			// Intanciation des objets
			// Truck truck1 = new Truck("Nissann", "Daf", "Noir", LocalDate.of(2023, 5, 10), 40,
			// 	MotorizedVehicle.FuelType.ELECTRIC, 9, false, 20);
			// System.out.println(truck1);

			// Car car1 = new Car("Nissan", "Juke", "Rouge", LocalDate.of(2020, 5, 13), 34.0, MotorizedVehicle.FuelType.DIESEL,
			// 	4, false, 4);
			// System.out.println(car1);

			// Bike bike1 = new Bike("decatlon", "course", "vert", LocalDate.of(2020, 07, 03), 10, 'M');
			// System.out.println(bike1);

			Vehicle vehicle1 = new Car("Nissan", "Juke", "Rouge", LocalDate.of(2020, 5, 13), 10,
				MotorizedVehicle.FuelType.DIESEL, 20, false, 4);
			System.out.println(vehicle1);

			Reservation reservation1 = new Reservation(LocalDate.parse("2023-06-01"), LocalDate.parse("2023-06-01"), false,
				vehicle1);
			System.out.println(reservation1);
			System.out.println(reservation1.totalPrice());

			Reservation reservation2 = new Reservation(LocalDate.of(2023, 06, 12), LocalDate.parse("2023-06-13"), false,
				vehicle1);
			System.out.println(reservation2);
			System.out.println(reservation2.totalPrice());

			Reservation reservation3 = new Reservation(LocalDate.of(2023, 06, 21), LocalDate.parse("2023-06-23"), false,
				vehicle1);
		
			Customer customer1 = new Customer("toto", "tata", "29 rue toto tata", "Bordeaux", "33000");
			System.out.println(customer1);
			
			Customer customer2 = new Customer("titi", "tutu", "27 rue titi tutu", "Bègle", "33130");
			Customer customer3 = new Customer("totoo", "tataa", "29 rue toto tata", "Bordeauxx", "33040");

			customer1.addReservation(reservation1);
			customer2.addReservation(reservation2);
			customer3.addReservation(reservation3);

			ArrayList<Customer> customers = new ArrayList<>();
			customers.add(customer1);
			customers.add(customer2);
			customers.add(customer3);

			// Trier les clients en fonction de l'argent total dépensé
			Collections.sort(customers);

			// Affichage des clients triés
			for(Customer customer:customers){
			System.out.println(customer + "Total dépensé: " + customer.totalMoneySpent());
			}

			//Sérialisation d'un client
			FileOutputStream fos = new FileOutputStream("customer.serial");
			ObjectOutputStream oos = new ObjectOutputStream(fos);

			try {
				oos.writeObject(customer1);
				oos.flush();
				System.out.println(customer1 + "a été sérialisé");
			} finally {
				try {
					oos.close();
				} finally {
					oos.close();
				}
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
		}
	}

}

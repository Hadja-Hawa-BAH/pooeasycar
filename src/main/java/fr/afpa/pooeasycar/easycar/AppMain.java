package fr.afpa.pooeasycar.easycar;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

//import fr.afpa.logs.Employee;

public class AppMain {
	private static final Logger logger = LogManager.getLogger(AppMain.class);

	public static void main(String[] args) {

		// Intanciation des objets
		// Truck truck1 = new Truck("Nissann", "Daf", "Noir", LocalDate.of(2023, 5, 10),
		// 40,
		// MotorizedVehicle.FuelType.ELECTRIC, 9, false, 20);
		// System.out.println(truck1);

		// Car car1 = new Car("Nissan", "Juke", "Rouge", LocalDate.of(2020, 5, 13),
		// 34.0, MotorizedVehicle.FuelType.DIESEL,
		// 4, false, 4);
		// System.out.println(car1);

		// Bike bike1 = new Bike("decatlon", "course", "vert", LocalDate.of(2020, 07,
		// 03), 10, 'M');
		// System.out.println(bike1);

		Vehicle vehicle1 = new Car("Nissan", "Juke", "Rouge", LocalDate.of(2020, 5, 13), 10,
				MotorizedVehicle.FuelType.DIESEL, 20, false, 4);
		logger.info(vehicle1);

		Vehicle vehicle2 = new Car("Nissann", "Jukee", "Bleue", LocalDate.of(2020, 5, 13), 5,
				MotorizedVehicle.FuelType.DIESEL, 20, false, 4);
		logger.info(vehicle2);

		Vehicle vehicle3 = new Car("Nissannn", "Jukeee", "Verte", LocalDate.of(2020, 5, 13), 15,
				MotorizedVehicle.FuelType.DIESEL, 20, false, 4);
		logger.info(vehicle3);

		Reservation reservation1 = new Reservation(LocalDate.parse("2023-06-01"), LocalDate.parse("2023-06-01"),
				false,
				vehicle1);
		logger.info(reservation1);
		logger.info(reservation1.totalPrice());

		Reservation reservation2 = new Reservation(LocalDate.of(2023, 06, 12), LocalDate.parse("2023-06-13"), false,
				vehicle2);
		logger.info(reservation2);
		logger.info(reservation2.totalPrice());

		Reservation reservation3 = new Reservation(LocalDate.of(2023, 06, 21), LocalDate.parse("2023-06-22"), false,
				vehicle3);

		Customer customer1 = new Customer("toté", "tata", "29 rue toto tata", "Bordeaux", "33000");
		logger.info(customer1);

		Customer customer2 = new Customer("téti", "tutu", "27 rue titi tutu", "Bègle", "33130");
		Customer customer3 = new Customer("tuté", "tataa", "29 rue toto tata", "Bordeauxx", "33040");

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
		for (Customer customer : customers) {
			logger.info(customer + "Total dépensé: " + customer.totalMoneySpent());
		}

		serializeCustomer(customer3);
		deserializeCustomer();
		System.out.println(customer1);

	}

	/**
	 * Méthode de sérialisation d'un client
	 * 
	 * @param customer L'objet de la classe "Customer" à sérialiser
	 */
	public static void serializeCustomer(Customer customer) {

		// Sérialisation d'un client
		try {
			FileOutputStream fichier = new FileOutputStream("customer.serial");
			ObjectOutputStream oos = new ObjectOutputStream(fichier);

			// Sérialisation de l'objet customer
			oos.writeObject(customer);

			// Vider le tampon
			oos.flush();
			logger.info(customer + "a été sérialisé");

		} catch (IOException exception) {
			logger.error(exception.getMessage());
		}
	}

	/**
	 * Méthode de dé-sérialisation d'un client
	 * 
	 * @return Un nouvel objet de la classe "Customer" issu de la désérialisation
	 */
	public static Customer deserializeCustomer() {

		try {
			FileInputStream fichier = new FileInputStream("customer.serial");
			ObjectInputStream ois = new ObjectInputStream(fichier);

			// Désérialisation
			Customer customer = (Customer) ois.readObject();
			logger.info(customer + " a été désérialisé");
			return customer;

		} catch (IOException | ClassNotFoundException exception) {
			logger.info(exception.getMessage());
		}
		return null;
	}

}

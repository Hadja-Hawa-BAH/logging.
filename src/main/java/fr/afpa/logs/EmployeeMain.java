package fr.afpa.logs;

import java.util.ArrayList;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Classe principale du projet, contient la fonction "main"
 */
public class EmployeeMain {

	  private static final Logger logger =LogManager.getLogger(Employee.class);

	public static void main(String[] args) {
		System.out.println("\n----- Exercice de programmation objet - classe \"Employee\" -----");

		// instanciez 4 objets de la classe "Employee" (une fois celle-ci
		// implémentée)
		Employee employee1 = new Employee("11ABC22", "Paul", "Thomas", 1400.0, "1999-09-17");
		Employee employee2 = new Employee("11ABC23", "Toto", "Thomass", 1900.0, "2002-01-23");
		Employee employee3 = new Employee("11ABC24", "Tata", "Thomasss", 2100.0, "2002-06-23");
		Employee employee4 = new Employee("11ABC25", "Ben", "Thomassss", 1700.0, "2005-01-23");

		// Appel de la fonction à partir de:
		logger.info("\n------Employe1------");
		logger.info(employee1);
		logger.info(employee1.toString());
		logger.info(employee1.netSalary());

		// logger.(employee1.netSalary());
		logger.info(
				"Le nombre de jours restant avant la date d'anniversaire est: " + employee1.daysBeforeBirthDate());

		// Pour gérer une exception
		// Matricule
		try {
			employee1.setRegistrationNumber("f5YDF30");

		} catch (Exception e) {

			// Récuperation du message
			String exceptionMessage = e.getMessage();
			logger.error("Erreur: " + exceptionMessage);
		}

		// Nom
		try {
			employee1.setLastName("Jul-cava");

		} catch (Exception e) {

			// Récuperation du message
			String exceptionMessage = e.getMessage();
			logger.error(exceptionMessage);
		}

		// Prenom
		try {
			employee1.setFirstName("Jean-paul");
			// employee1.setBirthDate("24/09/2000");

		} catch (Exception e) {

			// Récuperation du message
			String exceptionMessage = e.getMessage();
			logger.error(exceptionMessage);
		}

		// birthdate
		try {
			employee1.setBirthDate("2000-04-14");

		} catch (Exception e) {

			// Récuperation du message
			String exceptionMessage = e.getMessage();
			logger.error(exceptionMessage);
		}

		// Liste de tous les employés
		ArrayList<Employee> list = new ArrayList<Employee>();

		list.add(employee1);
		list.add(employee2);
		list.add(employee3);
		list.add(employee4);

		// Affichage de la liste des employés
		logger.info("\nLa liste des employés est : ");
		for (Employee employee : list) {
			logger.info(employee);
		}

	}

}

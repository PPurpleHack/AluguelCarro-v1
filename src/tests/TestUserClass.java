package tests;

import java.time.LocalDate;

import dao.UserDAO;
import exception.DatabaseConnectionFaliedException;
import model.Driver;
import model.PaymentData;

public class TestUserClass {
	
	public static void main(String[] args) {
		try {
			UserDAO userDB = new UserDAO();
			TestUserClass.testRegister();
		} catch(DatabaseConnectionFaliedException ex) {
			System.out.println("The aplication can not execute rigth now");
		} catch(Exception ex) {
			System.out.println("The aplication encountered a runtime error");
		}
	}
	
	public static void testRegister() {
		Driver driver = new Driver();
		driver.setCnh("091");
		driver.setName("Senhor");
		driver.setLastname("Teste");
		
		driver.register();
	}
	
	public static void testRentCar() {
		Driver driver = new Driver();
		driver.setCnh("09090909");
		driver.setName("Senhor");
		driver.setLastname("Teste");
		
		PaymentData payment = new PaymentData(
			"123",
			"Senhor Teste",
			"123123123",
			LocalDate.of(2024, 1, 1)
		);
		
		driver.setPayment(payment);
		try {
			driver.rentCar();
		} catch(NullPointerException ex) {
			System.out.println("Need to register a payment mode before to rent a car.");
			
		}
	}
}

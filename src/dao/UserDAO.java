package dao;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import exception.DatabaseConnectionFaliedException;
import model.User;

public class UserDAO {
	
	private static String dbDirectory = "/home/purple/Projetos/";
	private static String file = "user.txt";
	private static FileWriter fWriter; 
	
	public UserDAO() throws DatabaseConnectionFaliedException {
		// Initialize the writer
		try {
			UserDAO.fWriter = new FileWriter(dbDirectory+file);
			System.out.println("Database connected");
		} catch(IOException ex) {
			System.out.println("Can not connecto to the database");
			ex.printStackTrace();
			System.out.println("---------------");
			System.out.println("Throw error");
			System.out.println("---------------");
			throw new DatabaseConnectionFaliedException();
		}
	}
	
	public static int registerUser(User user) {
		PrintWriter pWriter = new PrintWriter(fWriter);
		System.out.println(user.toString());
		return 0;
	}
}

package learn_SQL;

import java.sql.SQLException;

import com.mysql.jdbc.Driver;

import java.sql.Connection;
import java.sql.DriverManager;

public class test {

	public static void main(String[] args) {
		try {
			new Driver();
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo",
					"root", "root");
		} catch (Exception e) {
			System.out.println("233");
			e.printStackTrace();
		}
		
		
		
	}

}

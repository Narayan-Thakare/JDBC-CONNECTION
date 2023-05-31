package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {

		
	///In System library do right click then select --> build path --> Configure build path --> Add External jars
		//then select the file -->Apply -->Okay ;
		//Step 1
		Class.forName("com.mysql.cj.jdbc.Driver");
        //Step 2
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Student","root","abc123");	
        //Step 3
		Statement st =con.createStatement();
        //Step 4
		con.close();
		
		
		
	}

}

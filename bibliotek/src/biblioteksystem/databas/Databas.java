
package src.biblioteksystem.databas;

import java.sql.*;

public class Databas {
    public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bibliotek1","root","123123Abc");
		}catch(Exception e){System.out.println(e);}
		return con;
	}

}
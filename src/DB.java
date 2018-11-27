/**
* A library management software where admin can add/view/delete librarian,
* librarian can add/view books, issue, view issued books and return books.  
* @author  Ariful Islam
* @version 1.0
* @since   2018-11-25
*/

import java.sql.Connection;
import java.sql.DriverManager;

public class DB {
	public static Connection getConnection(){
		Connection con=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test_java","","");
		}catch(Exception e){System.out.println(e);}
		return con;
	}

}

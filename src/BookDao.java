/**
* A library management software where admin can add/view/delete librarian,
* librarian can add/view books, issue, view issued books and return books.  
* @author  Ariful Islam
* @version 1.0
* @since   2018-11-25
*/

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BookDao {
public static int save(String callno,String name,String author,String publisher,int quantity){
	int status=0;
	try{
		Connection con=DB.getConnection();
		PreparedStatement ps=con.prepareStatement("insert into books(callno,name,author,publisher,quantity) values(?,?,?,?,?)");
		ps.setString(1,callno);
		ps.setString(2,name);
		ps.setString(3,author);
		ps.setString(4,publisher);
		ps.setInt(5,quantity);
		status=ps.executeUpdate();
		con.close();
	}catch(Exception e){System.out.println(e);}
	return status;
}
}

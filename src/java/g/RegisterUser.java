
package g;
import java.sql.*;

import g.GetCon;
public class RegisterUser {

public static int register(String username,String password,String repassword,double amount,String adderess,double phone){
	//public static int register(String email,String password,String gender,String country,String name){

	Connection con=GetCon.getCon();
	PreparedStatement ps;
        int status =0;
	try {
		ps = con.prepareStatement("Insert into NEWACCOUNT(username,password,repassword,amount,adderess,phone) values(?,?,?,?,?,?)");
		
		ps.setString(1,username);
		ps.setString(2,password);
		ps.setString(3,repassword);
		ps.setDouble(4,amount);
		ps.setString(5,adderess);
		ps.setDouble(6,phone);
		status=ps.executeUpdate();
		
	} catch (SQLException e) {
		
		e.printStackTrace();
	}
	return status;
	
}
}

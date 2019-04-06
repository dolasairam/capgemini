import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * Create a method which accepts a hash map and return the values of the map in sorted order as a List.
 */
public class Question1 {
	
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			Connection com=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","hr","hr");
			Statement start = com.createStatement();
			System.out.println("Enter the value of the employee id");
			Integer str = sc.nextInt();
			PreparedStatement ps = com.prepareStatement("select id, name from question where id = ?");
			ps.setInt(1, str);
			ResultSet rs = ps.executeQuery();
			boolean flag;
			while((flag=rs.next()))
			{
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2));
			}
			com.close();
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
	}
}

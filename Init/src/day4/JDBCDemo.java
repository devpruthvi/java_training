package day4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import com.mysql.cj.api.jdbc.Statement;
import com.mysql.cj.jdbc.Driver;

public class JDBCDemo {
	public static String padRight(String s, int n) {
	     return String.format("%1$-" + n + "s", s);  
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root123");
		
		Statement st = (Statement) con.createStatement();
		
		String query = "DESC employee";
		
		ResultSet rs = st.executeQuery(query);
		
		ResultSetMetaData metadata = rs.getMetaData();
		int[] columnLengths = new int[metadata.getColumnCount()];
		
		for(int i=1;i<=metadata.getColumnCount();i++) {
			columnLengths[i-1] = metadata.getColumnLabel(i).length();
		}
		
		while(rs.next()) {
			for(int i=1;i<=metadata.getColumnCount();i++) {
				String s = rs.getString(i);
				columnLengths[i-1] = Math.max(columnLengths[i-1], s == null ? 0 : s.length());
			}
		}
		rs.first();
		
		for(int i=1;i<=metadata.getColumnCount();i++) {
			System.out.print(padRight(metadata.getColumnLabel(i),columnLengths[i-1] + 3));
		}
		System.out.println("\n------------------------------------------------------------------");
		
		while(rs.next()) {
			for(int i=1;i<=metadata.getColumnCount();i++) {
				System.out.print(padRight(rs.getString(i),columnLengths[i-1] + 3));
			}
			System.out.println();
		}
		
	}
}

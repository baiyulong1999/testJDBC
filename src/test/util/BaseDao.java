package test.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao {
	protected Connection con;
	protected PreparedStatement ps;
	protected ResultSet rs;
	protected int count;
	static {
		try {
			Class.forName("com.mysql.jdbc.Driver");//加载mysql的jdbc驱动
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void open() {
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void query(String sql,Object...Params) {
		open();
		try {
			ps=con.prepareStatement(sql);
			for(int i=0;i<Params.length;i++) {
				ps.setObject(i+1, Params[i]);
			}
			rs=ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void update(String sql,Object...Params) {
		open();
		try {
			ps=con.prepareStatement(sql);
			for(int i=0;i<Params.length;i++) {
				ps.setObject(i+1, Params[i]);
			}
			count=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	protected void close() {
			try {
				if(rs!=null) {
					rs.close();
				}
				if(ps!=null) {
					ps.close();
				}
				if(con!=null) {
					con.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
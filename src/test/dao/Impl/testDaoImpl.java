package test.dao.Impl;

import java.sql.SQLException;

import test.dao.testDao;
import test.pojo.User;
import test.util.BaseDao;

public class testDaoImpl extends BaseDao implements testDao {
	@Override
	public void testConnection() {
		open();
		String sql="select * from user where uid=?";
		query(sql,1);
		try {
			rs.next();
			System.out.println(new User(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getString(4)).toString());
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		close();
	}

}

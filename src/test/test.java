package test;

import test.dao.testDao;
import test.dao.Impl.testDaoImpl;

public class test {
	public static void main(String args[]) {
		testDao ud=new testDaoImpl();
		ud.testConnection();
	}
}

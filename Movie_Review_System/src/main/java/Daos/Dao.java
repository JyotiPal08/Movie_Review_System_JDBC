package Daos;

import java.sql.Connection;

import Util.DbUtil;

public class Dao implements AutoCloseable {
	protected Connection con;
	public Dao() throws Exception{
		con = DbUtil.getConnection();
	}
	@Override
	public void close() {
		try {
			if(con != null)
				con.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

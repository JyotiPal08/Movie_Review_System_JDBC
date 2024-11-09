package Daos;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import pojos.User;

public class UserDaoImpl extends Dao implements UserDao{
	public UserDaoImpl() throws Exception{
		
	}

	@Override
	public User findById(int id) throws Exception {
		String sql = "select * from users where id =?";
		try(PreparedStatement stmt =con.prepareStatement(sql)){
			stmt.setInt(1, id);
			try(ResultSet rs = stmt.executeQuery()){
				if(rs.next()) {
					id = rs.getInt(id);
					String firstName = rs.getString("first_name");
					String lastName = rs.getString("last_name");
					String email = rs.getString("email");
					String password = rs.getString("password");
					Date birthDate = rs.getDate("dob");
					String mobile = rs.getString("mobile");
					User u = new User(id,firstName,lastName,email,password,birthDate, mobile);
					return u;
				}
			}
		}
		return null;
	}

	@Override
	public User findByEmail(String email) throws Exception {

		return null;
	}
}

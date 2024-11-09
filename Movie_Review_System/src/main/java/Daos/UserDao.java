package Daos;

import pojos.User;

public interface UserDao extends AutoCloseable {
	User findById(int id) throws Exception;
	User findByEmail(String email) throws Exception;
}

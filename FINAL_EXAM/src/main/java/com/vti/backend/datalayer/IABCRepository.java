package com.vti.backend.datalayer;


public interface IABCRepository {
//	List<User> getListUsers();

//	User getUserById(int id);

	int deleteUser(int id);

	boolean isUserIdExits(int id);

//	User login(String email, String password);
}

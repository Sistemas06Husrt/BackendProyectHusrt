package com.husrtBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.husrtBackend.entities.User;

@Repository
public interface IUserDao extends JpaRepository<User, Long>{

	@Query("Select u from User u where u.userName = ?1 OR u.email = ?1")
	public User getUserByUserName(String Username);
}

package com.husrtBackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.husrtBackend.entities.User;

@Repository
public interface IUserDao extends JpaRepository<User, Long>{

}

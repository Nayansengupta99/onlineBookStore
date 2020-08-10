package com.cognizant.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.cognizant.model.LoginModel;

public interface LoginRepository extends JpaRepository<LoginModel, Integer> {
	@Modifying
	@Transactional
	@Query(value = "insert into login (userName,password) values (?1,MD5(?2))", nativeQuery = true)
	void insertUserCredential(@Param("userName") String userName, @Param("password") String password);

}

package com.cognizant.repository;

import javax.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import com.cognizant.model.UserDetailModel;


public interface UserDetailRepository extends JpaRepository<UserDetailModel, Integer> {
	@Modifying
	@Transactional
	@Query(value = "insert into user(userId,userName,userAddress,userPhoneNumber,mailId) values(?1,?2,?3,?4,?5)", nativeQuery = true)
	void insertUserDetail(@Param("userId") int userId, @Param("userName") String userName,
			@Param("userAddress") String userAddress, @Param("userPhoneNumber") String userPhoneNumber,
			@Param("mailId") String mailId);
}

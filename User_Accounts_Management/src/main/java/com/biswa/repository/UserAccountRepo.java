package com.biswa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.biswa.entity.UserAccount;

import jakarta.transaction.Transactional;

@Repository
public interface UserAccountRepo extends JpaRepository<UserAccount, Integer>{
    
	@Modifying
	@Transactional
	@Query("update UserAccount set activeSw=:status where userId=:userId")
	public void updateUserAccStatus(Integer userId, String status);
}

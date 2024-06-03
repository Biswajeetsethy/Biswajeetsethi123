package com.biswa.service;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biswa.entity.UserAccount;
import com.biswa.repository.UserAccountRepo;

@Service
public class UserAccountsServiceImpl implements UserAccountService {
	
	@Autowired
	private UserAccountRepo userAccRepo;

	@Override
	public String saveOrUpdateUserAcc(UserAccount userAcc) {
		// UPSERT (INSERT & UPDATED)
		Integer userId = userAcc.getuserId();
		
		if(userId == null) {
			userAcc.setActiveSw("Y");
		}
		
		userAccRepo.save(userAcc);
		
		if(userId == null) {
			return "User record saved";
		}
		else {
		return "User record updated";
		}
	}

	@Override
	public List<UserAccount> getAllUserAccounts() {
		// TODO Auto-generated method stub
		//List<UserAccount> accounts = userAccRepo.findAll();
		//return accounts;
		
		return userAccRepo.findAll();
	}

	@Override
	public UserAccount getUserAcc(Integer userId) {
		// TODO Auto-generated method stub
		Optional<UserAccount> findById = userAccRepo.findById(userId);
		if(findById.isPresent()) {
		return findById.get();
		}
		return null;
	}

	@Override
	public boolean deleteUserAcc(Integer userId) {
		// TODO Auto-generated method stub
		/* try{
				userAccRepo.deleteById(Id);
				return true;
		}
		   catch(Exception e) {
			   e.printStackTrace();
		   }
		   */
		boolean existsById = userAccRepo.existsById(userId);
		if(existsById) {
			userAccRepo.deleteById(userId);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateUserAccStatus(Integer userId, String status) {
		// TODO Auto-generated method stub
		try {
			userAccRepo.updateUserAccStatus(userId, status);
			return true;
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}

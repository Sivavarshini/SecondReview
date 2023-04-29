package com.Athletics.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Athletics.demo.model.sports;
import com.Athletics.demo.repository.AthleticsRepository;
@Service
public class AthleticsService {
@Autowired
AthleticsRepository Repository;
	public List<sports> getAllDatas() {
		List<sports>dataList=Repository.findAll();
		return dataList;
	}

	public sports saveAthletics(sports a) {
		sports obj=Repository.save(a);
		return obj;
	}
	
	public sports updateAthletics(sports a) {
		sports obj=Repository.save(a);
		return obj;
	}
	
	public void deleteAthletics(int playerID) {
		Repository.deleteById(playerID);
	}
	
//	public String loginCheckData(String username,String password)
//	{
//		sports user = Repository.findByusername(username);
//		if(user == null)
//		{
//			return "No User Found/nPlease Try Again!!!!";
//		}
//		else
//		{
//			if(user.getPassword().equals(password))
//			{
//				return "Login Successful";
//			}
//			else
//			{
//				return "Login Failed";
//			}
//		}
//	}
}

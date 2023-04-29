package com.Athletics.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Athletics.demo.model.sports;
import com.Athletics.demo.service.AthleticsService;

@RestController
public class AthleticsController {
	@Autowired
	AthleticsService athleticsService;
@GetMapping(value="/fetchdata")
public List<sports>getAllDatas(){
	List<sports>dataList=athleticsService.getAllDatas();
	return dataList;
}
@PostMapping(value="/saveAthletics")
public sports saveAthletics(@RequestBody sports a)
{
	return athleticsService.saveAthletics(a);
}
@PutMapping(value="/updateAthletics")
public sports updateAthletics(@RequestBody sports a)
{
	return athleticsService.saveAthletics(a);
}
@DeleteMapping(value="/deleteAthletics/{id}")
public void deleteAthletics(@PathVariable("id") int playerID)
{
	athleticsService.deleteAthletics(playerID);
}
//@PostMapping("/login")
//public String login(@RequestBody Map<String,String> loginDataMap)
//{
//	String username = loginDataMap.get("username");
//	String password = loginDataMap.get("password");
//	String result = athleticsService.loginCheckData(username, password);
//	return result;
//}
}

package com.learning.cloud.service.Impl;

import java.util.ArrayList;
import java.util.List;

import com.learning.cloud.model.UsersModel;
import com.learning.cloud.service.DummyService;
import org.springframework.stereotype.Service;

@Service
public class DummyServiceImpl implements DummyService{

	@Override
	public List<UsersModel> dummyResponse() {
		ArrayList<UsersModel> usersList = new ArrayList<UsersModel>();  
		//adding products to the List  
		usersList.add(new UsersModel(100, "Amit", "Jamshedpur", "16/07"));
		usersList.add(new UsersModel(100, "Mansi", "Chandrapura", "15/07"));
		usersList.add(new UsersModel(100, "Srini", "Vijyavada", "14/06"));
		
		return usersList;
	}

}

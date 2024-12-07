package com.learning.cloud.controller;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.cloud.model.UsersModel;
import com.learning.cloud.service.DummyService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
@RequestMapping(value="/cloud")
public class EntryController {
	
	@Autowired
	private DummyService service;
	
	@GetMapping(value = "/userList")
	public List<UsersModel> serviceCall() {

		return service.dummyResponse();
	}

}

package com.mms.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mms.model.LogBook;
import com.mms.model.Response;
import com.mms.model.Users;
import com.mms.service.LogBookService;
import com.mms.service.UsersService;

/**
 * Add an user
 * Update an user
 * Search any user
 * @author Saugata
 */
@RestController
@RequestMapping("/users")
public class UsersController {
	
	@Autowired
	private UsersService usersService;
	
	/*
	 * Add an log entry in the database
	 */
	@RequestMapping(value="/add",method=RequestMethod.POST)
	public Response addUser(@RequestBody Users user) {
		return usersService.addUser(user);
	}

	/*
	 * Add an log entry in the database
	 */
	@RequestMapping(value="/update",method=RequestMethod.POST)
	public Response updateUser(@RequestBody Users user) {
		return usersService.addUser(user);
	}
}

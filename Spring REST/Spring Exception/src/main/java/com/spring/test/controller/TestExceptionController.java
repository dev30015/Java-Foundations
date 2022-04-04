package com.spring.test.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.spring.test.exception.domain.CustomException;
import com.spring.test.exception.domain.ResourceAlreadyExists;
import com.spring.test.exception.domain.ResourceNotFoundException;
import com.spring.test.exception.domain.UnauthorizedException;

@RestController
public class TestExceptionController {
	@RequestMapping(value = "/test", method = RequestMethod.GET)
	public String testExceptionHandling(@RequestParam int code) {
	    switch (code) {
	        case 401:
	            throw new UnauthorizedException("You are not authorized");
	        case 404:
	            throw new ResourceNotFoundException("Requested resource is not found.");
	        case 400:
	            throw new CustomException("Please provide resource id.");
	        case 409:
	            throw new ResourceAlreadyExists("Resource already exists in DB.");

	        default:
	            return "Yeah...No Exception.";

	    }
	}
}

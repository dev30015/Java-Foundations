package com.spring.test.exception.domain;

public class AccessDeniedException extends RuntimeException {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -2039543285523240446L;

	public AccessDeniedException(String message) {
		super(message);
	}
}

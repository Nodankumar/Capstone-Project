package com.aadhar.Exception;

public class AdminNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public AdminNotFoundException(int id) {
		super("Admin with id " + id + " is not Found.Pls Give another id!!");
	}
}

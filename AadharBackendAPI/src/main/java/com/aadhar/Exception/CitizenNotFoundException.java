package com.aadhar.Exception;

public class CitizenNotFoundException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CitizenNotFoundException(int id) {
		super("Citizen with id " + id + " is not Found.Pls Give another id!!");
	}

}

package com.cg.wallet.exception;

public class CustomerNotFoundException extends CustomerException{

	public static final String ERROR1 = "Name should contain atleast 4 characters";
	public static final String ERROR2 = "Email should contain @ symbol";
	public static final String ERROR3 = "Number should contain 10 digits";
	public static final String ERROR4 = "Balance should be greater than zero";

}

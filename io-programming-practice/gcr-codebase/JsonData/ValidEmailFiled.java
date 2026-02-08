package com.bridgelabz.JsonData;

	import java.util.regex.*;

	public class ValidEmailFiled {
	    public static void main(String[] args) {
	        String email = "digambar14062004@gmail.com";

	        String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

	        if (Pattern.matches(regex, email)) {
	            System.out.println("Valid email");
	        } else {
	            System.out.println("Invalid email");
	        }
	    }
	}


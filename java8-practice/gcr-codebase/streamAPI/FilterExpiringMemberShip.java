package com.bridgelabz.streamAPI;

	import java.time.LocalDate;
	import java.util.*;

	class Member {
	    String name;
	    LocalDate expiry;

	    Member(String name, LocalDate expiry) {
	        this.name = name;
	        this.expiry = expiry;
	    }
	}

	public class FilterExpiringMemberShip {
	    public static void main(String[] args) {
	        List<Member> members = Arrays.asList(
	                new Member("Digambar Singh", LocalDate.now().plusDays(10)),
	                new Member("Ram Singh", LocalDate.now().plusDays(40)),
	                new Member("Charan Singh", LocalDate.now().plusDays(20))
	        );

	        members.stream()
	                .filter(m -> m.expiry.isBefore(LocalDate.now().plusDays(30)))
	                .forEach(m -> System.out.println(m.name));
	    }
	}


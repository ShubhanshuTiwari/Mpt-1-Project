package com.capgemini.beans;
public class Customer implements Comparable<Customer>{

	@Override
	public boolean equals(Object obj) {
		
		System.out.println(this + " is equivalent to "+ obj + "?");
		boolean flag = (this == obj);
		if(flag) return flag;
		
		flag = (obj instanceof Customer);
		if(flag) return flag;

		flag = (this.firstName.equals(((Customer)obj).firstName))
					&& (this.lastName.equals(((Customer)obj).lastName))
				;
		return flag;
	}
	
	
	@Override
	public int compareTo(Customer o) {
		int diff = 0;
		
		diff = this.lastName.compareTo(o.lastName);
		
		return diff;
	}
	
	private String firstName;
	private String lastName;

	// DEFAULT CONSTRUCTOR
	public Customer() {
		// TODO Auto-generated constructor stub
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public String toString() {
		return firstName + "/" + lastName;
	}
	
	
	
	
	
	
	
	
	
	
}

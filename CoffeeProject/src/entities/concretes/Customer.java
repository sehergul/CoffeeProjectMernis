package entities.concretes;

import java.time.LocalDate;

import entities.abstracts.Entity;

public class Customer implements Entity{
	private String firstName;
	private String lastName;
	private long nationalityId;
	private LocalDate dateOfBirth;
	
	
	public Customer() {}


	public Customer(String firstName, String lastName,long nationalityId, LocalDate dateOfBirth) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.nationalityId = nationalityId;
		this.dateOfBirth = dateOfBirth;
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


	public long getNationalityId() {
		return nationalityId;
	}


	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}


	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	

	
	
}

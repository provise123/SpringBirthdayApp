package com.provise.model;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author swapnil.patil
 *	The Class EmployeeModel.
 */
@Entity
public class EmployeeModel {
	
	@Id
	private int empId;
	
	/** The first name. */
	private String firstName;
	
	/** The last name. */
	private String lastName;
	
	/** The dob. */
	private String DOB;
	
	/** The email address. */
	private String emailAddress;

	public EmployeeModel() {
		super();
	}
	public EmployeeModel(int empId,String firstName, String lastName, String DOB, String emailAddress) {
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.DOB = DOB;
		this.emailAddress = emailAddress;
		
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
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

	public String getDOB() {
		return DOB;
	}

	public void setDOB(String dOB) {
		DOB = dOB;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	@Override
	public String toString() {
		return "EmployeeModel [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", DOB=" + DOB
				+ ", emailAddress=" + emailAddress + "]";
	}

	
	
}

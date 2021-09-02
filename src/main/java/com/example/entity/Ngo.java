package com.example.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ngo")
public class Ngo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ngoId;
	
	@Column(name = "ngo_name")
	private String ngoName;
	
	@Column(name = "ngo_registration_no")
	private String ngoRegistrationNo;
	
	@Column(length = 50,unique = true,nullable =false)
	private String bankAccountNumber;

	/*
	 * private String extra1; private String extra2;
	 */
	
	
	public Ngo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

	public Ngo(int ngoId, String ngoName, String ngoRegistrationNo, String bankAccountNumber) {
		super();
		this.ngoId = ngoId;
		this.ngoName = ngoName;
		this.ngoRegistrationNo = ngoRegistrationNo;
		this.bankAccountNumber = bankAccountNumber;
		
	}

	

	
	public Ngo(String ngoName, String ngoRegistrationNo, String bankAccountNumber) {
		super();
		this.ngoName = ngoName;
		this.ngoRegistrationNo = ngoRegistrationNo;
		this.bankAccountNumber = bankAccountNumber;
		
	}



	public int getNgoId() {
		return ngoId;
	}



	public void setNgoId(int ngoId) {
		this.ngoId = ngoId;
	}



	public String getNgoName() {
		return ngoName;
	}



	public void setNgoName(String ngoName) {
		this.ngoName = ngoName;
	}



	public String getNgoRegistrationNo() {
		return ngoRegistrationNo;
	}



	public void setNgoRegistrationNo(String ngoRegistrationNo) {
		this.ngoRegistrationNo = ngoRegistrationNo;
	}



	public String getBankAccountNumber() {
		return bankAccountNumber;
	}



	public void setBankAccountNumber(String bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}


	
	

	@Override
	public String toString() {
		return "Ngo [ngoId=" + ngoId + ", ngoName=" + ngoName + ", ngoRegistrationNo=" + ngoRegistrationNo
				+ ", bankAccountNumber=" + bankAccountNumber + "]";
	}





	@OneToOne(cascade=CascadeType.ALL )
	@JoinColumn(name="id")
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
}

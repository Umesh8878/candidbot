package com.candidbot.model;

import java.security.Timestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "customer")
public class Customer {	
	
	@Id
	private Integer customerNum;
	private String email;
	private String firstName; 
	private String lastName;
	private String occupation;
	private String citizenship;	
	private Timestamp createdDate;
	private Timestamp modifiedDate;
	private Boolean enabled;
	private String txnRemarks="";
	
	public Customer(String email, String firstName, String lastName, String occupation, String citizenship,
			Timestamp createdDate, Timestamp modifiedDate, Boolean enabled, String txnRemarks) {
		super();
		this.email = email;
		this.firstName = firstName;
		this.lastName = lastName;
		this.occupation = occupation;
		this.citizenship = citizenship;
		this.createdDate = createdDate;
		this.modifiedDate = modifiedDate;
		this.enabled = enabled;
		this.txnRemarks = txnRemarks;
	}
	
	
}

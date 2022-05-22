package com.project.Agriculturalinsurance.model;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Entity
@Table(name="claim_officer")
public class ClaimOfficer {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "first_name", nullable = false, length = 20)
	@Size(min=5, message="Enter at least 5 Characters...")
    private String firstName;
     
    @Column(name = "last_name", nullable = false, length = 20)
    @Size(min=5, message="Enter at least 5 Characters...")
    private String lastName;
    
    @Column(name = "dob", nullable = false, length = 20)
    private String dOB;
    
    @Column(name = "gender", nullable = false, length = 6)
    private String gender;
    
    @Column(name = "contact", nullable = false, unique = true, length = 10)
    private long contact;
    
    @Column(name = "bank_name", nullable = false, length = 20)
    private String bankName;
    
    @Column(name = "bank_branch", nullable = false, length = 20)
    private String bankBranch;
    
    @Column(name = "add_line1", nullable = false, length = 50)
    private String addLine1;
    
    @Column(name = "add_line2", nullable = false, length = 50)
    private String addLine2;
    
    @Column(name = "city", nullable = false, length = 20)
    private String city;
    
    @Column(name = "state", nullable = false, length = 20)
    private String state;
    
    @Column(name = "zip", nullable = false, length = 6)
    private long zipCode;
    
    @Column(name = "officer_id", nullable = false, length = 10)
    private String officerId;
    
    @Column(name="password", nullable = false, length = 15)
    private String password;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getdOB() {
		return dOB;
	}

	public void setdOB(String dOB) {
		this.dOB = dOB;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getBankBranch() {
		return bankBranch;
	}

	public void setBankBranch(String bankBranch) {
		this.bankBranch = bankBranch;
	}

	public String getAddLine1() {
		return addLine1;
	}

	public void setAddLine1(String addLine1) {
		this.addLine1 = addLine1;
	}

	public String getAddLine2() {
		return addLine2;
	}

	public void setAddLine2(String addLine2) {
		this.addLine2 = addLine2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public long getZipCode() {
		return zipCode;
	}

	public void setZipCode(long zipCode) {
		this.zipCode = zipCode;
	}

	public String getOfficerId() {
		return officerId;
	}

	public void setOfficerId(String officerId) {
		this.officerId = officerId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
    
}

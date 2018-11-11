package com.johnbarrett.driverslicense.models;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="persons")
public class Person {

	//Attributes
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
  
    @Size(min = 3, max = 60)
    private String firstName;
    
    @Size(min = 3, max = 60)
    private String lastName;
    
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    
    @OneToOne(mappedBy="person", cascade=CascadeType.ALL, fetch=FetchType.LAZY)
    private License license;
    
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
    
    //Constructors
    public Person() {  
    }
    
    public Person(Long id, String firstName, String lastName) {
    	this.id = id;
    	this.firstName = firstName;
    	this.lastName = lastName;
    }

    //Getters
	public Long getId() {
		return id;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public License getLicense() {
		return license;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	//Setters
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}

	public void setLicense(License license) {
		this.license = license;
	}   	
}
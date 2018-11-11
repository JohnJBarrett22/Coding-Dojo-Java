package com.johnbarrett.eventsbeltreviewer.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="messages")
public class Message {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String message;
	
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;

	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PreUpdate
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="user_id")
	private User user;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="event_id")
	private Event event;
	
	//Constructors
	public Message() {
	}	
	
	public Message(String message, User user, Event event) {
		this.message = message;
		this.user = user;
		this.event = event;
	}

	//Getters
	public Long getId() {
		return id;
	}
	public String getMessage() {
		return message;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public User getUser() {
		return user;
	}
	public Event getEvent() {
		return event;
	}
	
	//Setters
	public void setId(Long id) {
		this.id = id;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public void setEvent(Event event) {
		this.event = event;
	}
}
package com.johnbarrett.dojooverflow.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name="tags")
public class Tag {
	
	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty
	private String subject;
    
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
	
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        name = "tags_questions", 
        joinColumns = @JoinColumn(name = "tag_id"), 
        inverseJoinColumns = @JoinColumn(name = "question_id")
    )     
    private List<Question> questions;
	
    //Constructors
    public Tag() {
    }
    
	public Tag(String subject) {
		this.subject = subject;
	}
	
	//Getters
	public Long getId() {
		return id;
	}
	public String getSubject() {
		return subject;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public List<Question> getQuestions() {
		return questions;
	}
	
	//Setters
	public void setId(Long id) {
		this.id = id;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}   
}
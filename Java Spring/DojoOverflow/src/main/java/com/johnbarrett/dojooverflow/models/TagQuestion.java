package com.johnbarrett.dojooverflow.models;

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

@Entity
@Table(name="tags_questions")
public class TagQuestion {

	//Attributes
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="tag_id")
    private Tag tag;
    
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="question_id")
    private Question question;
    
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
    
	//Constructors
	public TagQuestion() {
	}
	
	//Getters
	public Long getId() {
		return id;
	}
	public Tag getTag() {
		return tag;
	}
	public Question getQuestion() {
		return question;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	
	//Setters
	public void setId(Long id) {
		this.id = id;
	}
	public void setTag(Tag tag) {
		this.tag = tag;
	}
	public void setQuestion(Question question) {
		this.question = question;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
}
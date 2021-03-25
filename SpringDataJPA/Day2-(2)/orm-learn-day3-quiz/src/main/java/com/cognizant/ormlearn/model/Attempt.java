package com.cognizant.ormlearn.model;

import java.util.Date;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

@Entity
@Table(name="options")
public class Attempt {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="at_id")
	private int id;
	
	@Column(name="at_date")
	private Date date;
	
	@Column(name="at_score")
	private String score;

	
	@ManyToOne  
	@JoinColumn(name="at_us_id")
	private User user;
	
	@OneToMany(mappedBy = "attempt")
	@OrderBy("question.id")
	private Set<AttemptQuestion> attemptQuestion;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<AttemptQuestion> getAttemptQuestion() {
		return attemptQuestion;
	}

	public void setAttemptQuestion(Set<AttemptQuestion> attemptQuestion) {
		this.attemptQuestion = attemptQuestion;
	}
	
	
}

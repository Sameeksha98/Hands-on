package com.cognizant.ormlearn.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="qt_id")
	private int id;
	
	@Column(name="qt_text")
	private String text;
	
	@OneToMany(mappedBy = "question", fetch = FetchType.EAGER)
	private List<AttemptQuestion> attemptQuestion;
	
	@OneToMany(mappedBy = "question" , fetch = FetchType.EAGER)
	private Set<Options> options;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public List<AttemptQuestion> getAttemptQuestion() {
		return attemptQuestion;
	}

	public void setAttemptQuestion(List<AttemptQuestion> attemptQuestion) {
		this.attemptQuestion = attemptQuestion;
	}

	public Set<Options> getOptions() {
		return options;
	}

	public void setOptions(Set<Options> options) {
		this.options = options;
	}
	
	
}

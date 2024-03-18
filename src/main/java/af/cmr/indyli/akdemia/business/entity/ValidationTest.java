package af.cmr.indyli.akdemia.business.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * This class represents a Validation entity. It encapsulates information about
 * the validation of trainer.
 */
@Entity
@Table(name = "AKDEMIA_VALIDATION_TEST")
public class ValidationTest implements IEntity {
	
	// --------------------- //
	// ----- ATTRIBUTS ----- //
	// --------------------- //
	/**
	 * 
	 */
	private static final long serialVersionUID = -7864482508793024323L;

	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "TEST_DATE")
	private Date testDate;

	@Column(name = "SCORE")
	private Integer score;

	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;

    @ManyToOne
    @JoinColumn(name="ID_AKDEMIA_TEST")
    private Test test;
	//
	//
	//
	//
	//
	// -------------------- //
	// ----- METHODES ----- //
	// -------------------- //
	public ValidationTest() {
	}
	//
	//
	//
	//
	//
	// ----------------------------- //
	// ----- GETTERS & SETTERS ----- //
	// ----------------------------- //
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public Test getTest() {
		return test;
	}

	public void setTest(Test test) {
		this.test = test;
	}
}

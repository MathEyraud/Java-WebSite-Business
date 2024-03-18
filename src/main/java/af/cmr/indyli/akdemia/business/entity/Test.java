package af.cmr.indyli.akdemia.business.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * This class represents a Test entity. It encapsulates information about a test
 * or assessment conducted as part of an evaluation process.
 */
@Entity
@Table(name = "AKDEMIA_TEST")
public class Test implements IEntity {
	/**
	 * 
	 */
	// --------------------- //
	// ----- ATTRIBUTS ----- //
	// --------------------- //
	private static final long serialVersionUID = -6596294061124817514L;

	@Id
	@Column(name = "ID")
	private Integer id;

	@Column(name = "NAME")
	private String name;

	@Column(name = "DESCRIPTION")
	private String description;

	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
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
}

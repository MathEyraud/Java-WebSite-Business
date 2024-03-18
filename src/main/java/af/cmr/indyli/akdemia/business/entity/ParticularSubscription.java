package af.cmr.indyli.akdemia.business.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * This class represents a ParticularSubscription entity. It encapsulates information about
 * the subscription to an intersession by a particular.
 */
@Entity
@Table(name = "AKDEMIA_PARTICULAR_SOUSCRIPTION")
public class ParticularSubscription implements IEntity {

	// --------------------- //
	// ----- ATTRIBUTS ----- //
	// --------------------- //
	
	private static final long serialVersionUID = -4456210831722351387L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID")
	private Integer id;
	
	@Column(name = "STATUS")
	@Enumerated(EnumType.STRING) // Indique à Hibernate de persister le champ enum en tant que chaînes (VARCHAR) dans la base de données
	private Status status;
	
	@Column(name = "CREATION_DATE")
	private Date creationDate;

	@Column(name = "UPDATE_DATE")
	private Date updateDate;
	
	@ManyToOne
    @JoinColumn(name = "ID_AKDEMIA_INTER_SESSION", referencedColumnName = "ID", insertable = false, updatable = false)
	private InterSession interSession;
	
	@ManyToOne
    @JoinColumn(name = "ID_AKDEMIA_PARTICULAR", referencedColumnName = "ID", insertable = false, updatable = false)
	private Particular particular;
	
	// ----------------------------- //
	// ----- GETTERS & SETTERS ----- //
	// ----------------------------- //

	// GET SET ID
	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	// GET SET CREATION DATE
	@Override
	public Date getCreationDate() {
		return creationDate;
	}

	@Override
	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	// GET SET UPDATE DATE
	@Override
	public Date getUpdateDate() {
		return updateDate;
	}

	@Override
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	// GET SET STATUS
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	// GET SET INTER SESSION
	public InterSession getInterSession() {
		return interSession;
	}

	public void setInterSession(InterSession interSession) {
		this.interSession = interSession;
	}

	// GET SET PARTICULAR
	public Particular getParticular() {
		return particular;
	}

	public void setParticular(Particular particular) {
		this.particular = particular;
	}

}

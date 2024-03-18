package af.cmr.indyli.akdemia.business.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "AKDEMIA_SESSION")
@Inheritance(strategy = InheritanceType.JOINED)
public class Session implements IEntity{
	
    /**
	 * 
	 */
	private static final long serialVersionUID = 6183410770871409003L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "CODE")
    private String code;

    @Column(name = "DURATION")
    private Double duration;

    @Column(name = "PRICE")
    private Double price;

    @Column(name = "DESCRIPTION")
    private String description;
   
    @Column(name = "STATUS")
    @Enumerated(EnumType.STRING) // Indique à Hibernate de persister le champ enum en tant que chaînes (VARCHAR) dans la base de données
    private Status status;

    @Column(name = "DATE")
    private Date date;

    @Column(name = "LOCATION")
    private String location;

    @Column(name = "SESSION_SCORE")
    private Integer sessionScore;

    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    @ManyToOne
    @JoinColumn(name = "ID_AKDEMIA_TRAINER", referencedColumnName = "ID", insertable = false, updatable = false)
    private Trainer trainer;

    @ManyToOne
    @JoinColumn(name = "ID_AKDEMIA_TRAINING", referencedColumnName = "ID", insertable = false, updatable = false)
    private Training training;

    //
	//
	//
	//
	//
	// ----------------------------- //
	// ----- GETTERS & SETTERS ----- //
	// ----------------------------- //
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Double getDuration() {
		return duration;
	}

	public void setDuration(Double duration) {
		this.duration = duration;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Integer getSessionScore() {
		return sessionScore;
	}

	public void setSessionScore(Integer sessionScore) {
		this.sessionScore = sessionScore;
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

	public Trainer getTrainer() {
		return trainer;
	}

	public void setTrainer(Trainer trainer) {
		this.trainer = trainer;
	}

	public Training getTraining() {
		return training;
	}

	public void setTraining(Training training) {
		this.training = training;
	}
    
}

package af.cmr.indyli.akdemia.business.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "AKDEMIA_TRAINING")
public class Training implements IEntity {
	
	private static final long serialVersionUID = -7390571978612902184L;

	// --------------------- //
	// ----- ATTRIBUTS ----- //
	// --------------------- //
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "TITLE")
    private String title;

    @Column(name = "DESCRIPTION", columnDefinition = "varchar(500)")
    private String description;

    @Column(name = "TRAINING_PRICE")
    private Double trainingPrice;

    @Column(name = "LOGO", columnDefinition = "longtext")
    private String logo;
    
    @Column(name = "CREATION_DATE")
    private Date creationDate;

    @Column(name = "UPDATE_DATE")
    private Date updateDate;

    @ManyToOne
    @JoinColumn(name = "ID_AKDEMIA_REQUIREMENT", referencedColumnName = "ID")
    private Requirement requirement;
    //
	//
	//
	//
	//
	// ----------------------------- //
	// ----- GETTERS & SETTERS ----- //
	// ----------------------------- //
    /**
	 * 
	 */
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getTrainingPrice() {
		return trainingPrice;
	}

	public void setTrainingPrice(Double trainingPrice) {
		this.trainingPrice = trainingPrice;
	}

	public String getLogo() {
		return logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
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

	public Requirement getRequirement() {
		return requirement;
	}

	public void setRequirement(Requirement requirement) {
		this.requirement = requirement;
	}
    
}

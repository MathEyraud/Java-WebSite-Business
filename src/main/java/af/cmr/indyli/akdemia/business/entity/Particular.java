package af.cmr.indyli.akdemia.business.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * This class represents a Particular entity. It encapsulates information about
 * an individual who is not employed by the company but participates in session,
 * it extends {@link User}
 */
@Entity
@Table(name = "AKDEMIA_PARTICULAR")
public class Particular extends User {

	// --------------------- //
	// ----- ATTRIBUTS ----- //
	// --------------------- //
	private static final long serialVersionUID = -3927855605514477847L;

	@Column(name = "FIRSTNAME")
	private String firstname;

	@Column(name = "LASTNAME")
	private String lastname;

	@Column(name = "GENDER")
	private String gender;
	@Column(name = "ACTIVITY")
	private String activity;

	@Column(name = "HIGHEST_DIPLOMA")
	private String highestDiploma;

	@Column(name = "BIRTH_DATE")
	private Date birthDate;
	
//	@OneToMany
//    @JoinColumn(name = "ID_AKDEMIA_PARTICULAR_SOUSCRIPTION", referencedColumnName = "ID", insertable = false, updatable = false)
//	private ParticularSubscription particularSubscription;
	
    @OneToMany(mappedBy = "particular", fetch = FetchType.EAGER)
	private List<ParticularSubscription> particularSubscription = new ArrayList<>();
	
	// -------------------- //
	// ----- METHODES ----- //
	// -------------------- //
	public Particular() {
	}

	// ----------------------------- //
	// ----- GETTERS & SETTERS ----- //
	// ----------------------------- //
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getHighestDiploma() {
		return highestDiploma;
	}

	public void setHighestDiploma(String highestDiploma) {
		this.highestDiploma = highestDiploma;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}
	
	public List<ParticularSubscription> getParticularSubscription() {
		return particularSubscription;
	}

	public void setParticularSubscription(List<ParticularSubscription> particularSubscription) {
		this.particularSubscription = particularSubscription;
	}
}

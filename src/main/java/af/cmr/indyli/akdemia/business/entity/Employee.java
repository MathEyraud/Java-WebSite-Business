package af.cmr.indyli.akdemia.business.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * This class represents an Employee entity. It encapsulates information about
 * an individual intern within the company.
 */
@Entity
@Table(name = "AKDEMIA_EMPLOYEE")
public class Employee extends User {

	// --------------------- //
	// ----- ATTRIBUTS ----- //
	// --------------------- //
	private static final long serialVersionUID = -583808416902647841L;

	@Column(name = "FIRSTNAME")
	private String firstname;

	@Column(name = "LASTNAME")
	private String lastname;

	@Column(name = "GENDER")
	private String gender;

	@Column(name = "HIGHEST_DIPLOMA")
	private String highestDiploma;

	@Column(name = "BIRTH_DATE")
	private Date birthDate;

	@ManyToOne
	@JoinColumn(name = "ID_AKDEMIA_COMPANY")
	private Company company;
	
	@OneToMany(mappedBy = "employee", fetch = FetchType.EAGER)
	private List<EmployeeSubscription> employeeSubscription = new ArrayList<>();

	// -------------------- //
	// ----- METHODES ----- //
	// -------------------- //
	public Employee() {
	}
	//
	//
	//
	//
	//
	// ----------------------------- //
	// ----- GETTERS & SETTERS ----- //
	// ----------------------------- //
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

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}

package af.cmr.indyli.akdemia.business.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "AKDEMIA_TRAINER")
public class Trainer extends User{
	
	/**
	 * 
	 */
	// --------------------- //
	// ----- ATTRIBUTS ----- //
	// --------------------- //
	private static final long serialVersionUID = -5531457959088896417L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Integer id;

    @Column(name = "ACTIVITY")
    private String activity;

    @Column(name = "CV_LINK")
    private String cvLink;

    @Column(name = "FIRSTNAME")
    private String firstName;

    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "GENDER")
    private String gender;

    @Column(name = "ID_AKDEMIA_VALIDATION_TEST")
    private Integer validationTestId;

    @ManyToOne
    @JoinColumn(name = "ID_AKDEMIA_VALIDATION_TEST", referencedColumnName = "ID", insertable = false, updatable = false)
    private ValidationTest validationTest;
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

	public String getActivity() {
		return activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getCvLink() {
		return cvLink;
	}

	public void setCvLink(String cvLink) {
		this.cvLink = cvLink;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Integer getValidationTestId() {
		return validationTestId;
	}

	public void setValidationTestId(Integer validationTestId) {
		this.validationTestId = validationTestId;
	}

	public ValidationTest getValidationTest() {
		return validationTest;
	}

	public void setValidationTest(ValidationTest validationTest) {
		this.validationTest = validationTest;
	}
    
}

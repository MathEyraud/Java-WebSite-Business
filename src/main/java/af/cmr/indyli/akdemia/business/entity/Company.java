package af.cmr.indyli.akdemia.business.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * This class represents a Company entity. It encapsulates information about a
 * company.
 */
@Entity
@Table(name = "AKDEMIA_COMPANY")
public class Company extends User implements IEntity {
	
	/**
	 * 
	 */
	// --------------------- //
	// ----- ATTRIBUTS ----- //
	// --------------------- //
	private static final long serialVersionUID = -6661852400731701601L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "ACTIVITY")
	private String activity;

	@OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
	private List<Employee> employees = new ArrayList<>();
	
	//ajouter pour correction
	
	@OneToMany(mappedBy = "company", fetch = FetchType.EAGER)
	private List<IntraSession> intraSession = new ArrayList<>();
	
	
	//
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

	public String getActivity() {
		return this.activity;
	}

	public void setActivity(String activity) {
		this.activity = activity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}

}

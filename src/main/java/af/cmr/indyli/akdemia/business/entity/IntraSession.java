package af.cmr.indyli.akdemia.business.entity;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "AKDEMIA_INTRA_SESSION")
public class IntraSession extends Session {

	private static final long serialVersionUID = -9037770451611252995L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "ID")
	private Integer id;

	// Constructeur par défaut
	public IntraSession() {
		super(); // Appel du constructeur de la classe parente
	}

	@ManyToOne
	@JoinColumn(name = "ID_AKDEMIA_COMPANY", referencedColumnName = "ID", insertable = false, updatable = false)
	private Company company;

	@OneToMany(mappedBy = "intraSession", fetch = FetchType.EAGER)
	private List<EmployeeSubscription> employeeSubscription = new ArrayList<>();

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public List<EmployeeSubscription> getEmployeeSubscription() {
		return employeeSubscription;
	}

	public void setEmployeeSubscription(List<EmployeeSubscription> employeeSubscription) {
		this.employeeSubscription = employeeSubscription;
	}

}

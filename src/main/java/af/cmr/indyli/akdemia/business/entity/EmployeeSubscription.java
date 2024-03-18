package af.cmr.indyli.akdemia.business.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * This class represents an EmployeeSubscription entity. It encapsulates information about
 * the subscription to a session by an employee.
 */
@Entity
@Table(name = "AKDEMIA_EMPLOYEE_SOUSCRIPTION")
public class EmployeeSubscription implements IEntity {

	// --------------------- //
	// ----- ATTRIBUTS ----- //
	// --------------------- //

	private static final long serialVersionUID = 2024839641851747221L;
	
	@Id
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
    @JoinColumn(name = "ID_AKDEMIA_INTRA_SESSION", referencedColumnName = "ID", insertable = false, updatable = false)
	private IntraSession intraSession;
	
	@ManyToOne
    @JoinColumn(name = "ID_AKDEMIA_EMPLOYEE", referencedColumnName = "ID", insertable = false, updatable = false)
	private Employee employee;
	
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

	// GET SET INTRA SESSION
	public IntraSession getIntraSession() {
		return intraSession;
	}

	public void setIntraSession(IntraSession intraSession) {
		this.intraSession = intraSession;
	}
	
	// GET SET EMPLOYEE
	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

}

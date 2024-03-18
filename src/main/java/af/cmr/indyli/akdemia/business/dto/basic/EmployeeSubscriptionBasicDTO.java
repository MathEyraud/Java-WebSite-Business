package af.cmr.indyli.akdemia.business.dto.basic;

import java.util.Date;

import af.cmr.indyli.akdemia.business.dto.IDTO;
import af.cmr.indyli.akdemia.business.entity.Employee;
import af.cmr.indyli.akdemia.business.entity.IntraSession;
import af.cmr.indyli.akdemia.business.entity.Status;

public class EmployeeSubscriptionBasicDTO implements IDTO {

	private static final long serialVersionUID = -5148101884842034334L;
	
	// ----- ATTRIBUTS ----- //
	private Integer id;
	private Status status;
	private Date creationDate;
	private Date updateDate;

	// ----- CONSTRUCTEURS ----- //
	public EmployeeSubscriptionBasicDTO() {
	}
	
	// ----- GETTERS & SETTERS ----- //
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
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

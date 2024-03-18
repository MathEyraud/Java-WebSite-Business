package af.cmr.indyli.akdemia.business.dto.basic;

import java.util.Date;

import af.cmr.indyli.akdemia.business.dto.IDTO;
import af.cmr.indyli.akdemia.business.entity.InterSession;
import af.cmr.indyli.akdemia.business.entity.Particular;
import af.cmr.indyli.akdemia.business.entity.Status;

public class ParticularSubscriptionBasicDTO implements IDTO {
	
	private static final long serialVersionUID = -7008397959018396864L;
	
	// ----- ATTRIBUTS ----- //
	private Integer id;
	private Status status;
	private Date creationDate;
	private Date updateDate;
	
	// ----- CONSTRUCTEURS ----- //
	public ParticularSubscriptionBasicDTO() {
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

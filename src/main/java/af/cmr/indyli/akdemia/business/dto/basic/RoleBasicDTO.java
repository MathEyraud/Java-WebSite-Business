package af.cmr.indyli.akdemia.business.dto.basic;

import java.util.Date;

import af.cmr.indyli.akdemia.business.dto.IDTO;
import af.cmr.indyli.akdemia.business.entity.Role;

/**
 * This class represents a basic Data Transfer Object (DTO) for a {@link Role}
 * entity.
 */
public class RoleBasicDTO implements IDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4328946802532864368L;
	private Integer id;
	private String roleName;
	private Date creationDate;
	private Date updateDate;

	public RoleBasicDTO() {
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
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

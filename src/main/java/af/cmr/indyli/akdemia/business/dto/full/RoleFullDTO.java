package af.cmr.indyli.akdemia.business.dto.full;

import java.util.List;

import af.cmr.indyli.akdemia.business.dto.basic.PrivilegeBasicDTO;
import af.cmr.indyli.akdemia.business.dto.medium.RoleMediumDTO;
import af.cmr.indyli.akdemia.business.entity.Role;

/**
 * This class represents a full Data Transfer Object (DTO) for a {@link Role}
 * entity, it extends {@link RoleMediumDTO}.
 */
public class RoleFullDTO extends RoleMediumDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -181242624376804055L;

	public RoleFullDTO() {

	}

	private List<PrivilegeBasicDTO> privileges;

	public List<PrivilegeBasicDTO> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<PrivilegeBasicDTO> privileges) {
		this.privileges = privileges;
	}
}
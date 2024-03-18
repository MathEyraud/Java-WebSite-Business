package af.cmr.indyli.akdemia.business.dto.full;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import af.cmr.indyli.akdemia.business.dto.medium.UserMediumDTO;
import af.cmr.indyli.akdemia.business.entity.User;

/**
 * This class represents a full Data Transfer Object (DTO) for a {@link User}
 * entity, it extends {@link UserMediumDTO}.
 */
public class UserFullDTO extends UserMediumDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3653067236876684432L;

	public UserFullDTO() {
	}

	@JsonIgnore
	private List<PrivilegeFullDTO> privileges;

	public List<PrivilegeFullDTO> getPrivileges() {
		return privileges;
	}

	public void setPrivileges(List<PrivilegeFullDTO> privileges) {
		this.privileges = privileges;
	}
}

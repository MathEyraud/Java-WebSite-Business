package af.cmr.indyli.akdemia.business.dto.medium;

import af.cmr.indyli.akdemia.business.dto.basic.InterSessionBasicDTO;

public class InterSessionMediumDTO extends InterSessionBasicDTO {
	
	private static final long serialVersionUID = 2608676417762723654L;
	
	private InterSessionBasicDTO interSession;
	
	public InterSessionMediumDTO() {
	}

	public InterSessionBasicDTO getInterSession() {
		return interSession;
	}

	public void setInterSession(InterSessionBasicDTO interSession) {
		this.interSession = interSession;
	}
	
}

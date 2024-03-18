package af.cmr.indyli.akdemia.business.dto.medium;

import af.cmr.indyli.akdemia.business.dto.basic.RequirementBasicDTO;
import af.cmr.indyli.akdemia.business.dto.basic.TrainingBasicDTO;

public class TrainingMediumDTO extends TrainingBasicDTO {

	private static final long serialVersionUID = -829134022477378075L;
	
	// ----- ATTRIBUTS ----- //
	private RequirementBasicDTO requirement;

	// ----- CONSTRUCTEURS ----- //
	public TrainingMediumDTO() {
		super();
	}

	// ----- GETTERS & SETTERS ----- //
	public RequirementBasicDTO getRequirement() {
		return requirement;
	}

	public void setRequirement(RequirementBasicDTO requirement) {
		this.requirement = requirement;
	}
}

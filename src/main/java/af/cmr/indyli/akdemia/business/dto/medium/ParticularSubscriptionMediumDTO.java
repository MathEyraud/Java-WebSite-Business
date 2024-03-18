package af.cmr.indyli.akdemia.business.dto.medium;

import af.cmr.indyli.akdemia.business.dto.basic.InterSessionBasicDTO;
import af.cmr.indyli.akdemia.business.dto.basic.ParticularBasicDTO;
import af.cmr.indyli.akdemia.business.dto.basic.ParticularSubscriptionBasicDTO;

public class ParticularSubscriptionMediumDTO extends ParticularSubscriptionBasicDTO{

	private static final long serialVersionUID = -6864769011858577941L;
	private InterSessionBasicDTO intersession;
	private ParticularBasicDTO particular;

	public InterSessionBasicDTO getIntersessionBasicDTO() {
		return intersession;
	}

	public void setIntersessionBasicDTO(InterSessionBasicDTO intersession) {
		this.intersession = intersession;
	}

	public ParticularBasicDTO getParticularBasicDTO() {
		return particular;
	}

	public void setParticularBasicDTO(ParticularBasicDTO particular) {
		this.particular = particular;
	}

}

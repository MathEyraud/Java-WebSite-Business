package af.cmr.indyli.akdemia.business.dto.full;

import java.util.ArrayList;
import java.util.List;

import af.cmr.indyli.akdemia.business.dto.basic.ParticularSubscriptionBasicDTO;
import af.cmr.indyli.akdemia.business.dto.medium.ParticularSubscriptionMediumDTO;

public class ParticularSubscriptionFullDTO extends ParticularSubscriptionMediumDTO {

	private static final long serialVersionUID = -172123128688838536L;

    // Liste des particularSubscriptions
	private List<ParticularSubscriptionBasicDTO> particularSubscriptions = new ArrayList<>();

	public ParticularSubscriptionFullDTO() {
	}
	
    /**
     * Getter pour la liste des particularSubscriptions.
     *
     * @return La liste des particularSubscriptions.
     */
	public List<ParticularSubscriptionBasicDTO> getParticularSubscriptions() {
		return particularSubscriptions;
	}
	
    /**
     * Setter pour la liste des particularSubscriptions.
     *
     * @param particulars La nouvelle liste des particularSubscriptions.
     */
	
	public void setParticularSubscriptions(List<ParticularSubscriptionBasicDTO> particularSubscriptions) {
		this.particularSubscriptions = particularSubscriptions;
	}
	
}

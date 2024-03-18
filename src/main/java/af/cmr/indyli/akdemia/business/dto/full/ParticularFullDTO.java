package af.cmr.indyli.akdemia.business.dto.full;

import java.util.ArrayList;
import java.util.List;

import af.cmr.indyli.akdemia.business.dto.basic.ParticularBasicDTO;
import af.cmr.indyli.akdemia.business.dto.medium.ParticularMediumDTO;
import af.cmr.indyli.akdemia.business.entity.Particular;

/**
 * This class represents a full Data Transfer Object (DTO) for a
 * {@link Particular} entity, it extends {@link ParticularMediumDTO}.
 */
public class ParticularFullDTO extends ParticularMediumDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4485931367922752039L;
	
    // Liste des particulars
	private List<ParticularBasicDTO> particulars = new ArrayList<>();

	public ParticularFullDTO() {
	}
	
    /**
     * Getter pour la liste des particulars.
     *
     * @return La liste des particulars.
     */
	public List<ParticularBasicDTO> getParticulars() {
		return particulars;
	}
	
    /**
     * Setter pour la liste des particulars.
     *
     * @param particulars La nouvelle liste des particulars.
     */
	
	public void setParticulars(List<ParticularBasicDTO> particulars) {
		this.particulars = particulars;
	}

}

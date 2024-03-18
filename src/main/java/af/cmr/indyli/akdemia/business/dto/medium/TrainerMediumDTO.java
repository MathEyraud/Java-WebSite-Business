package af.cmr.indyli.akdemia.business.dto.medium;

import af.cmr.indyli.akdemia.business.dto.basic.TrainerBasicDTO;
import af.cmr.indyli.akdemia.business.entity.Trainer;

/**
 * This class represents a medium Data Transfer Object (DTO) for a
 * {@link Trainer} entity. It extends {@link TrainerBasicDTO} and inherits basic
 * information about a trainer. Medium DTOs typically include additional details
 * beyond the basic DTO but exclude complex associations like lists.
 */
public class TrainerMediumDTO extends TrainerBasicDTO{

	/**
	 * 
	 */
	private static final long serialVersionUID = 8683506010928349209L;
}

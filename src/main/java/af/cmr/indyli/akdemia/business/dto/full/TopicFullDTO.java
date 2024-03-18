package af.cmr.indyli.akdemia.business.dto.full;

import java.util.ArrayList;
import java.util.List;

import af.cmr.indyli.akdemia.business.dto.basic.SubTopicBasicDTO;
import af.cmr.indyli.akdemia.business.dto.medium.TopicMediumDTO;
import af.cmr.indyli.akdemia.business.entity.Topic;

/**
 * This class represents a full Data Transfer Object (DTO) for a {@link Topic}
 * entity, it extends {@link TopicMediumDTO}.
 */
public class TopicFullDTO extends TopicMediumDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -70905208811847950L;
	private List<SubTopicBasicDTO> subThemes = new ArrayList<>();

	public List<SubTopicBasicDTO> getSubThemes() {
		return subThemes;
	}

	public void setSubThemes(List<SubTopicBasicDTO> subThemes) {
		this.subThemes = subThemes;
	}
}
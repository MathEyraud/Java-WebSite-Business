package af.cmr.indyli.akdemia.business.dto.full;

import java.util.ArrayList;
import java.util.List;

import af.cmr.indyli.akdemia.business.dto.basic.TopicBasicDTO;
import af.cmr.indyli.akdemia.business.dto.medium.SubTopicMediumDTO;
import af.cmr.indyli.akdemia.business.entity.SubTopic;

/**
 * This class represents a full Data Transfer Object (DTO) for a
 * {@link SubTopic} entity, it extends {@link SubTopicMediumDTO}.
 */
public class SubTopicFullDTO extends SubTopicMediumDTO {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3597928466015413620L;
	private List<TopicBasicDTO> themes = new ArrayList<>();

	public List<TopicBasicDTO> getThemes() {
		return themes;
	}

	public void setThemes(List<TopicBasicDTO> themes) {
		this.themes = themes;
	}
}
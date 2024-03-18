package af.cmr.indyli.akdemia.business.dto.basic;

import java.util.Date;

import af.cmr.indyli.akdemia.business.dto.IDTO;
import af.cmr.indyli.akdemia.business.entity.SubTopic;

/**
 * This class represents a basic Data Transfer Object (DTO) for a
 * {@link SubTopic} entity.
 */
public class SubTopicBasicDTO implements IDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3665528182606070363L;
	private Integer id;
	private String subthemeTitle;
	private String description;
	private Date creationDate;
	private Date updateDate;

	public SubTopicBasicDTO() {
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public String getSubthemeTitle() {
		return subthemeTitle;
	}

	public void setSubthemeTitle(String subthemeTitle) {
		this.subthemeTitle = subthemeTitle;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getCreationDate() {
		return creationDate;
	}

	public void setCreationDate(Date creationDate) {
		this.creationDate = creationDate;
	}

	public Date getUpdateDate() {
		return updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
}

package af.cmr.indyli.akdemia.business.dto.basic;

import java.util.Date;

import af.cmr.indyli.akdemia.business.dto.IDTO;
import af.cmr.indyli.akdemia.business.entity.ValidationTest;

/**
 * This class represents a basic Data Transfer Object (DTO) for a
 * {@link ValidationTest} entity.
 */
public class ValidationTestBasicDTO implements IDTO {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5177683837887150440L;
	private Integer id;
	private Date testDate;
	private Integer score;
	private Date creationDate;
	private Date updateDate;

	public ValidationTestBasicDTO() {
	}

	@Override
	public Integer getId() {
		return id;
	}

	@Override
	public void setId(Integer id) {
		this.id = id;
	}

	public Date getTestDate() {
		return testDate;
	}

	public void setTestDate(Date testDate) {
		this.testDate = testDate;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
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

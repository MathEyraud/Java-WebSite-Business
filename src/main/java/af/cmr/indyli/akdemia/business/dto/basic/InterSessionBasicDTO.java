package af.cmr.indyli.akdemia.business.dto.basic;

import java.util.Date;

import af.cmr.indyli.akdemia.business.dto.IDTO;

public class InterSessionBasicDTO implements IDTO{
	private static final long serialVersionUID = 8918332607411703552L;
	
		private Integer id;
		private String code;
		private String duration;
		private Double price;
		private String description;
		private String status;
		private Date date;
		private Date creationDate;
		private Date updateDate;
		private Date sessionScore;
		private int minParticipants;
		private String location;
	
		public InterSessionBasicDTO() {
			super();
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getCode() {
			return code;
		}

		public void setCode(String code) {
			this.code = code;
		}

		public String getDuration() {
			return duration;
		}

		public void setDuration(String duration) {
			this.duration = duration;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Date getDate() {
			return date;
		}

		public void setDate(Date date) {
			this.date = date;
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

		public Date getSessionScore() {
			return sessionScore;
		}

		public void setSessionScore(Date sessionScore) {
			this.sessionScore = sessionScore;
		}

		public int getMinParticipants() {
			return minParticipants;
		}

		public void setMinParticipants(int minParticipants) {
			this.minParticipants = minParticipants;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
	
}

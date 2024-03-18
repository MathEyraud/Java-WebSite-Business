package af.cmr.indyli.akdemia.business.dto.full;

import java.util.ArrayList;
import java.util.List;

import af.cmr.indyli.akdemia.business.dto.basic.EmployeeBasicDTO;
import af.cmr.indyli.akdemia.business.dto.medium.CompanyMediumDTO;
import af.cmr.indyli.akdemia.business.entity.Company;

/**
 * This class represents a full Data Transfer Object (DTO) for a {@link Company}
 * entity, it extends {@link CompanyMediumDTO}.
 */
public class CompanyFullDTO extends CompanyMediumDTO {

	private static final long serialVersionUID = -1135298102683981650L;
	
    // Liste des employés associés à la société
	private List<EmployeeBasicDTO> employees = new ArrayList<>();
	
    /**
     * Constructeur par défaut de la classe CompanyFullDTO.
     */
	public CompanyFullDTO() {
	}
	
    /**
     * Getter pour la liste des employés associés à la société.
     *
     * @return La liste des employés
     */
	public List<EmployeeBasicDTO> getEmployees() {
		return employees;
	}
	
    /**
     * Setter pour la liste des employés associés à la société.
     *
     * @param employees La nouvelle liste des employés
     */
	
	public void setEmployees(List<EmployeeBasicDTO> employees) {
		this.employees = employees;
	}

}

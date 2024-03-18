package af.cmr.indyli.akdemia.business.dto.medium;

import af.cmr.indyli.akdemia.business.dto.basic.EmployeeBasicDTO;
import af.cmr.indyli.akdemia.business.dto.basic.EmployeeSubscriptionBasicDTO;
import af.cmr.indyli.akdemia.business.dto.basic.IntraSessionBasicDTO;

public class EmployeeSubscriptionMediumDTO extends EmployeeSubscriptionBasicDTO {

	private static final long serialVersionUID = 4233423413706655169L;
	
	// intra session
	private IntraSessionBasicDTO intrasessionDTO;

	public IntraSessionBasicDTO getIntrasessionDTO() {
		return intrasessionDTO;
	}

	public void setIntrasessionDTO(IntraSessionBasicDTO intrasessionDTO) {
		this.intrasessionDTO = intrasessionDTO;
	}
	
	// employee
	private EmployeeBasicDTO employeeDTO;
	
	public EmployeeBasicDTO getEmployeeDTO() {
		return employeeDTO;
	}
	
	public void setEmployeeDTO(EmployeeBasicDTO employeeDTO) {
		this.employeeDTO = employeeDTO;
	}
}

package af.cmr.indyli.akdemia.business.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import af.cmr.indyli.akdemia.business.dao.IEmployeeSubscriptionRepository;
import af.cmr.indyli.akdemia.business.dto.basic.EmployeeSubscriptionBasicDTO;
import af.cmr.indyli.akdemia.business.dto.full.EmployeeSubscriptionFullDTO;
import af.cmr.indyli.akdemia.business.entity.EmployeeSubscription;
import af.cmr.indyli.akdemia.business.service.IEmployeeSubscriptionService;
import af.cmr.indyli.akdemia.business.utils.ConstsValues;
import jakarta.annotation.Resource;

@Service(ConstsValues.ServiceKeys.EMPLOYEE_SUBSCRIPTION_SERVICE_KEY)
public class EmployeeSubscriptionServiceImpl extends
		AbstractAkdemiaServiceImpl<EmployeeSubscription, EmployeeSubscriptionBasicDTO, EmployeeSubscriptionFullDTO, IEmployeeSubscriptionRepository>
		implements IEmployeeSubscriptionService {

	// Injection de la dépendance du employeeSubscriptionRepository
	@Resource(name = ConstsValues.ConstsDAO.EMPLOYEE_SUBSCRIPTION_DAO_KEY)
	private IEmployeeSubscriptionRepository employeeSubscriptionRepository;

	// Constructeur par défaut
	public EmployeeSubscriptionServiceImpl() {
		// Appel du constructeur de la classe parente avec les types des classes
		// d'entités et de DTO
		super(EmployeeSubscription.class, EmployeeSubscriptionBasicDTO.class, EmployeeSubscriptionFullDTO.class);
	}

	// Méthode pour récupérer le repository
	@Override
	public IEmployeeSubscriptionRepository getDAO() {
		return this.employeeSubscriptionRepository;
	}

	// Méthode pour trouver tous les employeeSubscriptions avec des DTO complets
	public List<EmployeeSubscriptionFullDTO> findAllFull() {
		return this.getDAO().findAll().stream()
				.map(p -> this.getModelMapper().map(p, EmployeeSubscriptionFullDTO.class)).toList();
	}

}

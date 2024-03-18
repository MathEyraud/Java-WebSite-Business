package af.cmr.indyli.akdemia.business.service.impl;

import org.springframework.stereotype.Service;

import af.cmr.indyli.akdemia.business.dao.ITrainerRepository;
import af.cmr.indyli.akdemia.business.dto.basic.TrainerBasicDTO;
import af.cmr.indyli.akdemia.business.dto.full.TrainerFullDTO;
import af.cmr.indyli.akdemia.business.entity.Trainer;
import af.cmr.indyli.akdemia.business.service.ITrainerService;
import af.cmr.indyli.akdemia.business.utils.ConstsValues;
import jakarta.annotation.Resource;

/**
 * Service implementation class for managing Trainer entity, extending the
 * AbstractAkdemiaServiceImpl class. This class provides specific functionality
 * for managing trainers, including CRUD operations and validation.
 *
 * @see AbstractAkdemiaServiceImpl
 */
@Service(ConstsValues.ServiceKeys.TRAINER_SERVICE_KEY)
public class TrainerServiceImpl 
	extends AbstractAkdemiaServiceImpl<Trainer, TrainerBasicDTO, TrainerFullDTO, ITrainerRepository>
	implements ITrainerService {
	
	@Resource(name = ConstsValues.ConstsDAO.TRAINER_DAO_KEY)
	private ITrainerRepository trainerRepository;

	public TrainerServiceImpl() {
		super(Trainer.class, TrainerBasicDTO.class, TrainerFullDTO.class);
	}

	@Override
	public ITrainerRepository getDAO() {
		return this.trainerRepository;
	}
	
}

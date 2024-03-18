package af.cmr.indyli.akdemia.business.service.impl;

import org.springframework.stereotype.Service;

import af.cmr.indyli.akdemia.business.dao.ITrainingRepository;
import af.cmr.indyli.akdemia.business.dto.basic.TrainingBasicDTO;
import af.cmr.indyli.akdemia.business.dto.full.TrainingFullDTO;
import af.cmr.indyli.akdemia.business.entity.Training;
import af.cmr.indyli.akdemia.business.service.ITrainingService;
import af.cmr.indyli.akdemia.business.utils.ConstsValues;
import jakarta.annotation.Resource;

/**
 * Service implementation class for managing Training entity, extending the
 * AbstractAkdemiaServiceImpl class. This class provides specific functionality
 * for managing trainings, including CRUD operations and validation.
 *
 * @see AbstractAkdemiaServiceImpl
 */
@Service(ConstsValues.ServiceKeys.TRAINING_SERVICE_KEY)
public class TrainingServiceImpl
		extends AbstractAkdemiaServiceImpl<Training, TrainingBasicDTO, TrainingFullDTO, ITrainingRepository>
		implements ITrainingService {
	
	@Resource(name = ConstsValues.ConstsDAO.TRAINING_DAO_KEY)
	private ITrainingRepository trainingRepository;
	
	public TrainingServiceImpl() {
		super(Training.class, TrainingBasicDTO.class, TrainingFullDTO.class);
	}

	@Override
	public ITrainingRepository getDAO() {
		return this.trainingRepository;
	}

}

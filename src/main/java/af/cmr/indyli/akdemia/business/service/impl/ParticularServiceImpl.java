package af.cmr.indyli.akdemia.business.service.impl;

import java.nio.file.AccessDeniedException;
import java.util.Date;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import af.cmr.indyli.akdemia.business.dao.IParticularRepository;
import af.cmr.indyli.akdemia.business.dto.basic.ParticularBasicDTO;
import af.cmr.indyli.akdemia.business.dto.full.ParticularFullDTO;
import af.cmr.indyli.akdemia.business.entity.Particular;
import af.cmr.indyli.akdemia.business.exception.AkdemiaBusinessException;
import af.cmr.indyli.akdemia.business.service.IParticularService;
import af.cmr.indyli.akdemia.business.service.IUserService;
import af.cmr.indyli.akdemia.business.utils.ConstBusinessRules;
import af.cmr.indyli.akdemia.business.utils.ConstRejectBusinessMessage;
import af.cmr.indyli.akdemia.business.utils.ConstsValues;
import jakarta.annotation.Resource;

/**
 * Classe d'implémentation du service pour la gestion de l'entité Particular, 
 * étendant la classe AbstractAkdemiaServiceImpl. 
 * Cette classe fournit des fonctionnalités spécifiques pour la gestion des entités Particular, 
 * y compris les opérations CRUD et la validation.
 *
 * @see AbstractAkdemiaServiceImpl Classe abstraite pour les services Akdemia
 */

@Service(ConstsValues.ServiceKeys.PARTICULAR_SERVICE_KEY)

public class ParticularServiceImpl
		extends AbstractAkdemiaServiceImpl<Particular, ParticularBasicDTO, ParticularFullDTO, IParticularRepository>
		implements IParticularService {
	
	// Injection du repository spécifique pour l'entité Particular
	@Resource(name = ConstsValues.ConstsDAO.PARTICULAR_DAO_KEY)
	private IParticularRepository particularRepository;

	// Injection du userservice pour les opérations liées aux utilisateurs
	@Resource(name = ConstsValues.ServiceKeys.USER_SERVICE_KEY)
	private IUserService userService;

	// Constructeur par défaut, configurant les types des entités et DTO associés
	public ParticularServiceImpl() {
		super(Particular.class, ParticularBasicDTO.class, ParticularFullDTO.class);
	}

	// Méthode permettant d'obtenir le repository associé à l'entité Particular
	@Override
	public IParticularRepository getDAO() {
		return this.particularRepository;
	}

	// CREATE : implémentation de la création d'une entité ParticularFullDTO avec validation
	@Override
	public ParticularFullDTO create(ParticularFullDTO view) throws AkdemiaBusinessException {
		if (!userService.isExistUserByEmail(view.getEmail())) {
			view.setCreationDate(new Date());
			Particular entity = this.getDAO().saveAndFlush(this.getModelMapper().map(view, Particular.class));

			return this.getModelMapper().map(entity, ParticularFullDTO.class);
		}
		throw new AkdemiaBusinessException(ConstBusinessRules.RG02);
	}

	// UPDATE : implémentation de la mise à jour d'une entité ParticularFullDTO avec validation
	@Override
	public ParticularFullDTO update(ParticularFullDTO viewToUpdate)
			throws AkdemiaBusinessException, AccessDeniedException {
		if (!userService.isExistUserByEmail(viewToUpdate.getEmail(), viewToUpdate.getId())) {
			viewToUpdate.setUpdateDate(new Date());
			Particular entity = this.getDAO().findById(viewToUpdate.getId()).orElse(null);
			if (entity != null) {
				BeanUtils.copyProperties(viewToUpdate, entity);
				this.getDAO().saveAndFlush(entity);
			} else {
				throw new AkdemiaBusinessException(ConstRejectBusinessMessage.OBJECT_SEARCHED_NOT_FOUND);
			}
			return viewToUpdate;
		}
		throw new AkdemiaBusinessException(ConstBusinessRules.RG02);
	}

	// DELETE : implémentation de la suppression d'une entité ParticularFullDTO avec validation
	@Override
	public void deleteById(int id) throws AkdemiaBusinessException, AccessDeniedException {
		var tmpParticipant = this.findById(id);

		if (tmpParticipant == null) {
			throw new AkdemiaBusinessException(ConstRejectBusinessMessage.DELETE_OBJECT_NOT_FOUND);
		}

		getDAO().deleteById(id);
	}
}

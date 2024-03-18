package af.cmr.indyli.akdemia.business.service;

import java.util.List;

import af.cmr.indyli.akdemia.business.dao.IParticularSubscriptionRepository;
import af.cmr.indyli.akdemia.business.dto.basic.ParticularSubscriptionBasicDTO;
import af.cmr.indyli.akdemia.business.dto.full.ParticularSubscriptionFullDTO;
import af.cmr.indyli.akdemia.business.entity.ParticularSubscription;

/**
 * Interface extending the IAbstractAkdemiaService interface for managing
 * particularSubscriptions, providing specific operations for
 * {@link particularSubscriptions} entities.
 *
 * @see IAbstractAkdemiaService
 */
public interface IParticularSubscriptionService extends
		IAbstractAkdemiaService<ParticularSubscription, ParticularSubscriptionBasicDTO, ParticularSubscriptionFullDTO, IParticularSubscriptionRepository> {

	List<ParticularSubscriptionFullDTO> findAllFull();

}

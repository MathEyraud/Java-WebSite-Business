package af.cmr.indyli.akdemia.business.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import af.cmr.indyli.akdemia.business.dao.IParticularSubscriptionRepository;
import af.cmr.indyli.akdemia.business.dto.basic.ParticularSubscriptionBasicDTO;
import af.cmr.indyli.akdemia.business.dto.full.ParticularSubscriptionFullDTO;
import af.cmr.indyli.akdemia.business.entity.ParticularSubscription;
import af.cmr.indyli.akdemia.business.service.IParticularSubscriptionService;
import af.cmr.indyli.akdemia.business.utils.ConstsValues;
import jakarta.annotation.Resource;

@Service(ConstsValues.ServiceKeys.PARTICULAR_SUBSCRIPTION_SERVICE_KEY)
public class ParticularSubscriptionServiceImpl extends
        AbstractAkdemiaServiceImpl<ParticularSubscription, ParticularSubscriptionBasicDTO, ParticularSubscriptionFullDTO, IParticularSubscriptionRepository>
        implements IParticularSubscriptionService {
    
    // Injection de la dépendance du particularSubscriptionRepository
    @Resource(name = ConstsValues.ConstsDAO.PARTICULAR_SUBSCRIPTION_DAO_KEY)
    private IParticularSubscriptionRepository particularSubscriptionRepository;
    
    // Constructeur par défaut
    public ParticularSubscriptionServiceImpl() {
        // Appel du constructeur de la classe parente avec les types des classes d'entités et de DTO
        super(ParticularSubscription.class, ParticularSubscriptionBasicDTO.class, ParticularSubscriptionFullDTO.class);
    }
    
    // Méthode pour récupérer le repository
    @Override
    public IParticularSubscriptionRepository getDAO() {
        return this.particularSubscriptionRepository;
    }
    
    // Méthode pour trouver tous les particularSubscriptions avec des DTO complets
    @Override
    public List<ParticularSubscriptionFullDTO> findAllFull() {
        // Conversion de la liste d'entités en liste de DTO complets en utilisant un mapper
        return this.getDAO().findAll().stream().map(p -> this.getModelMapper().map(p, ParticularSubscriptionFullDTO.class)).toList();
    }
}

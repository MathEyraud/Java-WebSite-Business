package af.cmr.indyli.akdemia.business.service;

import af.cmr.indyli.akdemia.business.dao.IParticularRepository;
import af.cmr.indyli.akdemia.business.dto.basic.ParticularBasicDTO;
import af.cmr.indyli.akdemia.business.dto.full.ParticularFullDTO;
import af.cmr.indyli.akdemia.business.entity.Particular;

/**
 * Interface étendant l'interface IAbstractAkdemiaService pour la gestion des
 * entités "Particular", fournissant des opérations spécifiques pour les entités
 * de type Particular.
 *
 * Cette interface permet de définir les méthodes nécessaires pour la gestion
 * des opérations liées à l'entité Particular, en utilisant les classes DTO
 * (ParticularBasicDTO et ParticularFullDTO) et le repository spécifique
 * (IParticularRepository).
 *
 * @see IAbstractAkdemiaService Interface générale pour les services Akdemia
 */
public interface IParticularService
		extends IAbstractAkdemiaService<Particular, ParticularBasicDTO, ParticularFullDTO, IParticularRepository> {
}

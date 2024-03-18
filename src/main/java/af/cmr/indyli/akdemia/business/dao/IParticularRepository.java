package af.cmr.indyli.akdemia.business.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import af.cmr.indyli.akdemia.business.entity.Particular;
import af.cmr.indyli.akdemia.business.utils.ConstsValues;

/**
 * This interface serves as a repository for managing {@link Particular}
 * entities in the database. It extends JpaRepository, providing CRUD operations
 * for the Particular entity with Integer as the type of its primary
 * key.
 */

@Repository(value = ConstsValues.ConstsDAO.PARTICULAR_DAO_KEY)

public interface IParticularRepository extends JpaRepository<Particular, Integer> {
}

//JpaRepository fournit déjà plusieurs méthodes de base, telles que :

//save() : Enregistre une entité particulière dans la base de données.
//Par exemple : repository.save(particular);

//findById() : Recherche une entité particulière par son identifiant.
//Par exemple : repository.findById(id);

//findAll() : Récupère toutes les entités particulières de la base de données.
//Par exemple : repository.findAll();

//delete() : Supprime une entité particulière de la base de données.
//Par exemple : repository.delete(particular);

//count() : Renvoie le nombre total d'entités particulières dans la base de données.
//Par exemple : repository.count();
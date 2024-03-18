package af.cmr.indyli.akdemia.business.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import af.cmr.indyli.akdemia.business.entity.ParticularSubscription;
import af.cmr.indyli.akdemia.business.utils.ConstsValues;

/**
 * This interface serves as a repository for managing
 * {@link ParticularSubscription} entities in the database. It extends
 * JpaRepository, providing CRUD operations for the
 * {@link ParticularSubscription} entity with Integer as the type of its primary
 * key.
 */

@Repository(value = ConstsValues.ConstsDAO.PARTICULAR_SUBSCRIPTION_DAO_KEY)

public interface IParticularSubscriptionRepository extends JpaRepository<ParticularSubscription, Integer> {

}

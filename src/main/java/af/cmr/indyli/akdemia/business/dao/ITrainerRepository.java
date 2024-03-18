package af.cmr.indyli.akdemia.business.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import af.cmr.indyli.akdemia.business.entity.Trainer;
import af.cmr.indyli.akdemia.business.utils.ConstsValues;

/**
 * This interface serves as a repository for managing {@link Trainer} entities
 * in the database. It extends JpaRepository, providing CRUD operations for the
 * Trainer entity with Integer as the type of its primary key.
 */
@Repository(value = ConstsValues.ConstsDAO.TRAINER_DAO_KEY)
public interface ITrainerRepository extends JpaRepository<Trainer, Integer>{}
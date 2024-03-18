package af.cmr.indyli.akdemia.business.dao;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import af.cmr.indyli.akdemia.business.entity.User;
import af.cmr.indyli.akdemia.business.utils.ConstsValues;

/**
 * This interface serves as a repository for managing {@link User} entities in
 * the database. It extends JpaRepository, providing CRUD operations for the
 * {@link User} entity with Integer as the type of its primary key.
 */
@Repository(value = ConstsValues.ConstsDAO.USER_DAO_KEY)
public interface IUserRepository extends JpaRepository<User, Integer> {
	Optional<User> findUserByEmail(String email);
}

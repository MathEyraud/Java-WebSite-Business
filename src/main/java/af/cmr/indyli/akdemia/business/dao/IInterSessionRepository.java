package af.cmr.indyli.akdemia.business.dao;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import af.cmr.indyli.akdemia.business.entity.InterSession;
import af.cmr.indyli.akdemia.business.utils.ConstsValues;

@Repository(value = ConstsValues.ConstsDAO.INTER_SESSION_DAO_KEY)
public interface IInterSessionRepository extends JpaRepository<InterSession, Integer>{

}

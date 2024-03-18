package af.cmr.indyli.akdemia.business.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import af.cmr.indyli.akdemia.business.dao.ISessionRepository;
import af.cmr.indyli.akdemia.business.dto.basic.SessionBasicDTO;
import af.cmr.indyli.akdemia.business.dto.full.SessionFullDTO;
import af.cmr.indyli.akdemia.business.entity.Session;
import af.cmr.indyli.akdemia.business.service.ISessionService;
import af.cmr.indyli.akdemia.business.utils.ConstsValues;
import jakarta.annotation.Resource;

@Service(ConstsValues.ServiceKeys.SESSION_SERVICE_KEY)
public class SessionServiceImpl
		extends AbstractAkdemiaServiceImpl<Session, SessionBasicDTO, SessionFullDTO, ISessionRepository>
		implements ISessionService {
	
	@Resource(name = ConstsValues.ConstsDAO.SESSION_DAO_KEY)
	private ISessionRepository sessionRepository;

	public SessionServiceImpl() {
		super(Session.class, SessionBasicDTO.class, SessionFullDTO.class);

	}

	@Override
	public ISessionRepository getDAO() {
		return this.sessionRepository;
	}
	
	@Override
	public List<SessionFullDTO> findAllFull() {
		return this.getDAO().findAll().stream().map(p -> this.getModelMapper().map(p, SessionFullDTO.class)).toList();
	}
	
	
	
	
}

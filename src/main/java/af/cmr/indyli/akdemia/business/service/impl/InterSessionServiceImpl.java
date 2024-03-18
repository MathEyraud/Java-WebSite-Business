package af.cmr.indyli.akdemia.business.service.impl;

import org.springframework.stereotype.Service;

import af.cmr.indyli.akdemia.business.dao.IInterSessionRepository;
import af.cmr.indyli.akdemia.business.dto.basic.InterSessionBasicDTO;
import af.cmr.indyli.akdemia.business.dto.full.InterSessionFullDTO;
import af.cmr.indyli.akdemia.business.entity.InterSession;
import af.cmr.indyli.akdemia.business.service.IInterSessionService;
import af.cmr.indyli.akdemia.business.utils.ConstsValues;
import jakarta.annotation.Resource;

@Service(ConstsValues.ServiceKeys.INTER_SESSION_SERVICE_KEY)
public class InterSessionServiceImpl
	extends AbstractAkdemiaServiceImpl<InterSession, InterSessionBasicDTO, InterSessionFullDTO, IInterSessionRepository>
	implements IInterSessionService{
	
	@Resource(name = ConstsValues.ConstsDAO.INTER_SESSION_DAO_KEY)
	private IInterSessionRepository interSessionRepository;

	
	public InterSessionServiceImpl() {
		super(InterSession.class, InterSessionBasicDTO.class, InterSessionFullDTO.class);
	}


	@Override
	public IInterSessionRepository getDAO() {
		return this.interSessionRepository;
	}

}

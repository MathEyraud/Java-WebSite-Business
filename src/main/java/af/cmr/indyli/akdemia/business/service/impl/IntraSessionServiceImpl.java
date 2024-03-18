package af.cmr.indyli.akdemia.business.service.impl;

import org.springframework.stereotype.Service;

import af.cmr.indyli.akdemia.business.dao.IIntraSessionRepository;
import af.cmr.indyli.akdemia.business.dto.basic.IntraSessionBasicDTO;
import af.cmr.indyli.akdemia.business.dto.full.IntraSessionFullDTO;
import af.cmr.indyli.akdemia.business.entity.IntraSession;
import af.cmr.indyli.akdemia.business.service.IIntraSessionService;
import af.cmr.indyli.akdemia.business.utils.ConstsValues;
import jakarta.annotation.Resource;

@Service(ConstsValues.ServiceKeys.INTRA_SESSION_SERVICE_KEY)
public class IntraSessionServiceImpl 
	extends AbstractAkdemiaServiceImpl<IntraSession, IntraSessionBasicDTO, IntraSessionFullDTO, IIntraSessionRepository>
	implements IIntraSessionService{
	
	@Resource(name = ConstsValues.ConstsDAO.INTRA_SESSION_DAO_KEY)
	private IIntraSessionRepository intraSessionRepository;

	public IntraSessionServiceImpl() {
		super(IntraSession.class, IntraSessionBasicDTO.class, IntraSessionFullDTO.class);
	}

	@Override
	public IIntraSessionRepository getDAO() {
		return this.intraSessionRepository;
	}

}

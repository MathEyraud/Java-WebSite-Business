package af.cmr.indyli.akdemia.business.utils;

/**
 * Cette classe contient des valeurs constantes utilisées comme clés pour les DAO et les services dans l'application Akdemia.
 * Elle organise ces clés en classes imbriquées pour les DAO et les clés de service.
 */
public class ConstsValues {

	/**
	 * Cette classe interne contient des clés constantes pour les DAO utilisés dans l'application.
	 * Chaque clé représente un DAO spécifique utilisé pour l'accès à la base de données.
	 */
	public static final class ConstsDAO {
		// Clés constantes pour les DAO
		public static final String COMPANY_DAO_KEY 			= "companyDAO";
		public static final String EMPLOYEE_DAO_KEY 		= "employeeDAO";
		public static final String EVALUATION_DAO_KEY 		= "evaluationDAO";
		public static final String MANAGER_DAO_KEY 			= "managerDAO";
		public static final String PARTICULAR_DAO_KEY 		= "particularDAO";
		public static final String PLANNING_DAO_KEY 		= "planificationDAO";
		public static final String PRIVILEGE_DAO_KEY 		= "privilegeDAO";
		public static final String REQUIREMENT_DAO_KEY 		= "requirementDAO";
		public static final String ROLE_DAO_KEY 			= "roleDAO";
		public static final String SUB_TOPIC_DAO_KEY 		= "subTopicDAO";
		public static final String TOPIC_DAO_KEY 			= "topicDAO";
		public static final String TEST_DAO_KEY 			= "testDAO";
		public static final String VALIDATION_TEST_DAO_KEY 	= "validationTestDAO";
		public static final String USER_DAO_KEY 			= "userDAO";
		public static final String SESSION_DAO_KEY 			= "sessionDAO";
		public static final String TRAINER_DAO_KEY 			= "trainerDAO";
		public static final String TRAINING_DAO_KEY 		= "trainingDAO";
		public static final String INTER_SESSION_DAO_KEY 	= "interSessionDAO";
		public static final String INTRA_SESSION_DAO_KEY 	= "intraSessionDAO";
		public static final String PARTICULAR_SUBSCRIPTION_DAO_KEY 		= "particularSubscriptionDAO";
		public static final String EMPLOYEE_SUBSCRIPTION_DAO_KEY 		= "employeeSubscriptionDAO";

	}

	/**
	 * Cette classe interne contient des clés constantes pour les services utilisés dans l'application.
	 * Chaque clé représente un service spécifique utilisé pour la logique métier.
	 */
	public static final class ServiceKeys {
		// Clés constantes pour les services
		public static final String COMPANY_SERVICE_KEY 			= "companyService";
		public static final String EMPLOYEE_SERVICE_KEY 		= "employeeService";
		public static final String EVALUATION_SERVICE_KEY 		= "evaluationService";
		public static final String MANAGER_SERVICE_KEY 			= "managerService";
		public static final String PARTICULAR_SERVICE_KEY 		= "particularService";
		public static final String PRIVILEGE_SERVICE_KEY 		= "privilegeService";
		public static final String REQUIREMENT_SERVICE_KEY 		= "requirementService";
		public static final String ROLE_SERVICE_KEY 			= "roleService";
		public static final String SUB_TOPIC_SERVICE_KEY 		= "subTopicService";
		public static final String TOPIC_SERVICE_KEY 			= "topicService";
		public static final String TEST_SERVICE_KEY 			= "testService";
		public static final String VALIDATION_TEST_SERVICE_KEY 	= "validationTestService";
		public static final String PLANNING_SERVICE_KEY 		= "planningService";
		public static final String USER_SERVICE_KEY 			= "userService";
		public static final String USER_SERVICE 				= "userAuthService";
		public static final String SESSION_SERVICE_KEY 			= "sessionService";
		public static final String TRAINER_SERVICE_KEY 			= "trainerService";
		public static final String TRAINING_SERVICE_KEY 		= "trainingService";
		public static final String INTER_SESSION_SERVICE_KEY 	= "interSessionService";
		public static final String INTRA_SESSION_SERVICE_KEY 	= "intraSessionService";
		public static final String PARTICULAR_SUBSCRIPTION_SERVICE_KEY 		= "particularSubscriptionService";
		public static final String EMPLOYEE_SUBSCRIPTION_SERVICE_KEY 		= "employeeSubscriptionService";

	}
}

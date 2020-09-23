/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CustomerRelationshipManagementApiService {

	SDCustomerRelationshipManagementActivateOutputModel activate(SDCustomerRelationshipManagementActivateInputModel request);
	
	BQIncidentCaptureOutputModel captureIncident(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIncidentCaptureInputModel request);
	
	SDCustomerRelationshipManagementConfigureOutputModel configure(String sdReferenceId, SDCustomerRelationshipManagementConfigureInputModel request);
	
	BQIncidentControlOutputModel controlIncident(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIncidentControlInputModel request);
	
	CRCustomerRelationshipManagementPlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerRelationshipManagementPlanControlInputModel request);
	
	CRCustomerRelationshipManagementPlanCreateOutputModel create(String sdReferenceId, CRCustomerRelationshipManagementPlanCreateInputModel request);
	
	BQContactCreateOutputModel createContact(String sdReferenceId, String crReferenceId, BQContactCreateInputModel request);
	
	BQDevelopmentCreateOutputModel createDevelopment(String sdReferenceId, String crReferenceId, BQDevelopmentCreateInputModel request);
	
	BQIncidentCreateOutputModel createIncident(String sdReferenceId, String crReferenceId, BQIncidentCreateInputModel request);
	
	BQDevelopmentExchangeOutputModel exchangeDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentExchangeInputModel request);
	
	BQIncidentExchangeOutputModel exchangeIncident(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIncidentExchangeInputModel request);
	
	CRCustomerRelationshipManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerRelationshipManagementPlanExchangeInputModel request);
	
	SDCustomerRelationshipManagementFeedbackOutputModel feedback(String sdReferenceId, SDCustomerRelationshipManagementFeedbackInputModel request);
	
	CRCustomerRelationshipManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCustomerRelationshipManagementPlanGrantInputModel request);
	
	BQContactRequestOutputModel requestContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactRequestInputModel request);
	
	BQDevelopmentRequestOutputModel requestDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentRequestInputModel request);
	
	CRCustomerRelationshipManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerRelationshipManagementPlanRequestInputModel request);
	
	CRCustomerRelationshipManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId);
	
	List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	BQContactRetrieveOutputModel retrieveContact(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQDevelopmentRetrieveOutputModel retrieveDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	BQIncidentRetrieveOutputModel retrieveIncident(String sdReferenceId, String crReferenceId, String bqReferenceId);
	
	List<String> retrieveRefIds(String sdReferenceId);
	
	SDCustomerRelationshipManagementRetrieveOutputModel retrieveSD(String sdReferenceId);
	
	CRCustomerRelationshipManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerRelationshipManagementPlanUpdateInputModel request);
	
	BQContactUpdateOutputModel updateContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactUpdateInputModel request);
	
	BQDevelopmentUpdateOutputModel updateDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentUpdateInputModel request);
	
	BQIncidentUpdateOutputModel updateIncident(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIncidentUpdateInputModel request);
	
}

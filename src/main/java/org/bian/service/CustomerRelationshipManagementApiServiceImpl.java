/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CustomerRelationshipManagementApiServiceImpl implements CustomerRelationshipManagementApiService {

	public SDCustomerRelationshipManagementActivateOutputModel activate(SDCustomerRelationshipManagementActivateInputModel request){
		return JsonReader.read("activate-SDCustomerRelationshipManagementActivateOutputModel.json",new TypeReference<SDCustomerRelationshipManagementActivateOutputModel>(){});
	}
	
	public BQIncidentCaptureOutputModel captureIncident(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIncidentCaptureInputModel request){
		return JsonReader.read("capture-BQIncidentCaptureOutputModel.json",new TypeReference<BQIncidentCaptureOutputModel>(){});
	}
	
	public SDCustomerRelationshipManagementConfigureOutputModel configure(String sdReferenceId, SDCustomerRelationshipManagementConfigureInputModel request){
		return JsonReader.read("configure-SDCustomerRelationshipManagementConfigureOutputModel.json",new TypeReference<SDCustomerRelationshipManagementConfigureOutputModel>(){});
	}
	
	public BQIncidentControlOutputModel controlIncident(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIncidentControlInputModel request){
		return JsonReader.read("control-BQIncidentControlOutputModel.json",new TypeReference<BQIncidentControlOutputModel>(){});
	}
	
	public CRCustomerRelationshipManagementPlanControlOutputModel control(String sdReferenceId, String crReferenceId, CRCustomerRelationshipManagementPlanControlInputModel request){
		return JsonReader.read("control-CRCustomerRelationshipManagementPlanControlOutputModel.json",new TypeReference<CRCustomerRelationshipManagementPlanControlOutputModel>(){});
	}
	
	public CRCustomerRelationshipManagementPlanCreateOutputModel create(String sdReferenceId, CRCustomerRelationshipManagementPlanCreateInputModel request){
		return JsonReader.read("create-CRCustomerRelationshipManagementPlanCreateOutputModel.json",new TypeReference<CRCustomerRelationshipManagementPlanCreateOutputModel>(){});
	}
	
	public BQContactCreateOutputModel createContact(String sdReferenceId, String crReferenceId, BQContactCreateInputModel request){
		return JsonReader.read("create-BQContactCreateOutputModel.json",new TypeReference<BQContactCreateOutputModel>(){});
	}
	
	public BQDevelopmentCreateOutputModel createDevelopment(String sdReferenceId, String crReferenceId, BQDevelopmentCreateInputModel request){
		return JsonReader.read("create-BQDevelopmentCreateOutputModel.json",new TypeReference<BQDevelopmentCreateOutputModel>(){});
	}
	
	public BQIncidentCreateOutputModel createIncident(String sdReferenceId, String crReferenceId, BQIncidentCreateInputModel request){
		return JsonReader.read("create-BQIncidentCreateOutputModel.json",new TypeReference<BQIncidentCreateOutputModel>(){});
	}
	
	public BQDevelopmentExchangeOutputModel exchangeDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentExchangeInputModel request){
		return JsonReader.read("exchange-BQDevelopmentExchangeOutputModel.json",new TypeReference<BQDevelopmentExchangeOutputModel>(){});
	}
	
	public BQIncidentExchangeOutputModel exchangeIncident(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIncidentExchangeInputModel request){
		return JsonReader.read("exchange-BQIncidentExchangeOutputModel.json",new TypeReference<BQIncidentExchangeOutputModel>(){});
	}
	
	public CRCustomerRelationshipManagementPlanExchangeOutputModel exchange(String sdReferenceId, String crReferenceId, CRCustomerRelationshipManagementPlanExchangeInputModel request){
		return JsonReader.read("exchange-CRCustomerRelationshipManagementPlanExchangeOutputModel.json",new TypeReference<CRCustomerRelationshipManagementPlanExchangeOutputModel>(){});
	}
	
	public SDCustomerRelationshipManagementFeedbackOutputModel feedback(String sdReferenceId, SDCustomerRelationshipManagementFeedbackInputModel request){
		return JsonReader.read("feedback-SDCustomerRelationshipManagementFeedbackOutputModel.json",new TypeReference<SDCustomerRelationshipManagementFeedbackOutputModel>(){});
	}
	
	public CRCustomerRelationshipManagementPlanGrantOutputModel grant(String sdReferenceId, String crReferenceId, CRCustomerRelationshipManagementPlanGrantInputModel request){
		return JsonReader.read("grant-CRCustomerRelationshipManagementPlanGrantOutputModel.json",new TypeReference<CRCustomerRelationshipManagementPlanGrantOutputModel>(){});
	}
	
	public BQContactRequestOutputModel requestContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactRequestInputModel request){
		return JsonReader.read("request-BQContactRequestOutputModel.json",new TypeReference<BQContactRequestOutputModel>(){});
	}
	
	public BQDevelopmentRequestOutputModel requestDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentRequestInputModel request){
		return JsonReader.read("request-BQDevelopmentRequestOutputModel.json",new TypeReference<BQDevelopmentRequestOutputModel>(){});
	}
	
	public CRCustomerRelationshipManagementPlanRequestOutputModel request(String sdReferenceId, String crReferenceId, CRCustomerRelationshipManagementPlanRequestInputModel request){
		return JsonReader.read("request-CRCustomerRelationshipManagementPlanRequestOutputModel.json",new TypeReference<CRCustomerRelationshipManagementPlanRequestOutputModel>(){});
	}
	
	public CRCustomerRelationshipManagementPlanRetrieveOutputModel retrieve(String sdReferenceId, String crReferenceId){
		return JsonReader.read("retrieve-CRCustomerRelationshipManagementPlanRetrieveOutputModel.json",new TypeReference<CRCustomerRelationshipManagementPlanRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveBQIds(String sdReferenceId, String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public BQContactRetrieveOutputModel retrieveContact(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQContactRetrieveOutputModel.json",new TypeReference<BQContactRetrieveOutputModel>(){});
	}
	
	public BQDevelopmentRetrieveOutputModel retrieveDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQDevelopmentRetrieveOutputModel.json",new TypeReference<BQDevelopmentRetrieveOutputModel>(){});
	}
	
	public BQIncidentRetrieveOutputModel retrieveIncident(String sdReferenceId, String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-BQIncidentRetrieveOutputModel.json",new TypeReference<BQIncidentRetrieveOutputModel>(){});
	}
	
	public List<String> retrieveRefIds(String sdReferenceId){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public SDCustomerRelationshipManagementRetrieveOutputModel retrieveSD(String sdReferenceId){
		return JsonReader.read("retrieveSD-SDCustomerRelationshipManagementRetrieveOutputModel.json",new TypeReference<SDCustomerRelationshipManagementRetrieveOutputModel>(){});
	}
	
	public CRCustomerRelationshipManagementPlanUpdateOutputModel update(String sdReferenceId, String crReferenceId, CRCustomerRelationshipManagementPlanUpdateInputModel request){
		return JsonReader.read("update-CRCustomerRelationshipManagementPlanUpdateOutputModel.json",new TypeReference<CRCustomerRelationshipManagementPlanUpdateOutputModel>(){});
	}
	
	public BQContactUpdateOutputModel updateContact(String sdReferenceId, String crReferenceId, String bqReferenceId, BQContactUpdateInputModel request){
		return JsonReader.read("update-BQContactUpdateOutputModel.json",new TypeReference<BQContactUpdateOutputModel>(){});
	}
	
	public BQDevelopmentUpdateOutputModel updateDevelopment(String sdReferenceId, String crReferenceId, String bqReferenceId, BQDevelopmentUpdateInputModel request){
		return JsonReader.read("update-BQDevelopmentUpdateOutputModel.json",new TypeReference<BQDevelopmentUpdateOutputModel>(){});
	}
	
	public BQIncidentUpdateOutputModel updateIncident(String sdReferenceId, String crReferenceId, String bqReferenceId, BQIncidentUpdateInputModel request){
		return JsonReader.read("update-BQIncidentUpdateOutputModel.json",new TypeReference<BQIncidentUpdateOutputModel>(){});
	}
	
}

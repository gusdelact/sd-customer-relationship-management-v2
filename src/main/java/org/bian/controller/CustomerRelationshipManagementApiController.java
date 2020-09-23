/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Manage;

@BianRestController
public class CustomerRelationshipManagementApiController {

	@Autowired
	CustomerRelationshipManagementApiService service;
	
	@Manage.Activate
	public BianResponse<SDCustomerRelationshipManagementActivateOutputModel> activate(@RequestBody BianRequest<SDCustomerRelationshipManagementActivateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.activate(bianRequest.getData()));
	}
	
	@BQ("incident")
	@Manage.Capture
	public BianResponse<BQIncidentCaptureOutputModel> captureIncident(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIncidentCaptureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.captureIncident(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Configure
	public BianResponse<SDCustomerRelationshipManagementConfigureOutputModel> configure(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerRelationshipManagementConfigureInputModel> bianRequest) {
		return BianResponse.forSuccess(service.configure(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("incident")
	@Manage.Control
	public BianResponse<BQIncidentControlOutputModel> controlIncident(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIncidentControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.controlIncident(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Control
	public BianResponse<CRCustomerRelationshipManagementPlanControlOutputModel> control(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerRelationshipManagementPlanControlInputModel> bianRequest) {
		return BianResponse.forSuccess(service.control(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Create
	public BianResponse<CRCustomerRelationshipManagementPlanCreateOutputModel> create(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<CRCustomerRelationshipManagementPlanCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.create(sdReferenceId, bianRequest.getData()));
	}
	
	@BQ("contact")
	@Manage.Create
	public BianResponse<BQContactCreateOutputModel> createContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQContactCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createContact(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("development")
	@Manage.Create
	public BianResponse<BQDevelopmentCreateOutputModel> createDevelopment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQDevelopmentCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createDevelopment(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("incident")
	@Manage.Create
	public BianResponse<BQIncidentCreateOutputModel> createIncident(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<BQIncidentCreateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.createIncident(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("development")
	@Manage.Exchange
	public BianResponse<BQDevelopmentExchangeOutputModel> exchangeDevelopment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDevelopmentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeDevelopment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("incident")
	@Manage.Exchange
	public BianResponse<BQIncidentExchangeOutputModel> exchangeIncident(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIncidentExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchangeIncident(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Exchange
	public BianResponse<CRCustomerRelationshipManagementPlanExchangeOutputModel> exchange(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerRelationshipManagementPlanExchangeInputModel> bianRequest) {
		return BianResponse.forSuccess(service.exchange(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Feedback
	public BianResponse<SDCustomerRelationshipManagementFeedbackOutputModel> feedback(@PathVariable("sd-reference-id") String sdReferenceId, @RequestBody BianRequest<SDCustomerRelationshipManagementFeedbackInputModel> bianRequest) {
		return BianResponse.forSuccess(service.feedback(sdReferenceId, bianRequest.getData()));
	}
	
	@Manage.Grant
	public BianResponse<CRCustomerRelationshipManagementPlanGrantOutputModel> grant(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerRelationshipManagementPlanGrantInputModel> bianRequest) {
		return BianResponse.forSuccess(service.grant(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contact")
	@Manage.Request
	public BianResponse<BQContactRequestOutputModel> requestContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQContactRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestContact(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("development")
	@Manage.Request
	public BianResponse<BQDevelopmentRequestOutputModel> requestDevelopment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDevelopmentRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.requestDevelopment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Manage.Request
	public BianResponse<CRCustomerRelationshipManagementPlanRequestOutputModel> request(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerRelationshipManagementPlanRequestInputModel> bianRequest) {
		return BianResponse.forSuccess(service.request(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@Manage.Retrieve
	public BianResponse<CRCustomerRelationshipManagementPlanRetrieveOutputModel> retrieve(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(sdReferenceId, crReferenceId));
	}
	
	@Manage.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(sdReferenceId, crReferenceId, behaviorQualifier));
	}
	
	@Manage.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@BQ("contact")
	@Manage.Retrieve
	public BianResponse<BQContactRetrieveOutputModel> retrieveContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveContact(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("development")
	@Manage.Retrieve
	public BianResponse<BQDevelopmentRetrieveOutputModel> retrieveDevelopment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveDevelopment(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@BQ("incident")
	@Manage.Retrieve
	public BianResponse<BQIncidentRetrieveOutputModel> retrieveIncident(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveIncident(sdReferenceId, crReferenceId, bqReferenceId));
	}
	
	@Manage.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveRefIds(sdReferenceId));
	}
	
	@Manage.RetrieveSD
	public BianResponse<SDCustomerRelationshipManagementRetrieveOutputModel> retrieveSD(@PathVariable("sd-reference-id") String sdReferenceId) {
		return BianResponse.forSuccess(service.retrieveSD(sdReferenceId));
	}
	
	@Manage.Update
	public BianResponse<CRCustomerRelationshipManagementPlanUpdateOutputModel> update(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CRCustomerRelationshipManagementPlanUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.update(sdReferenceId, crReferenceId, bianRequest.getData()));
	}
	
	@BQ("contact")
	@Manage.Update
	public BianResponse<BQContactUpdateOutputModel> updateContact(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQContactUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateContact(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("development")
	@Manage.Update
	public BianResponse<BQDevelopmentUpdateOutputModel> updateDevelopment(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQDevelopmentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateDevelopment(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("incident")
	@Manage.Update
	public BianResponse<BQIncidentUpdateOutputModel> updateIncident(@PathVariable("sd-reference-id") String sdReferenceId, @PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<BQIncidentUpdateInputModel> bianRequest) {
		return BianResponse.forSuccess(service.updateIncident(sdReferenceId, crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}

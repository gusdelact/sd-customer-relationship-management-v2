package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerRelationshipManagementPlanExchangeInputModelCustomerRelationshipManagementPlanExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQIncidentExchangeInputModel
 */
public class BQIncidentExchangeInputModel   {
  private String customerRelationshipManagementPlanInstanceReference = null;

  private String incidentInstanceReference = null;

  private Object incidentExchangeActionTaskRecord = null;

  private CRCustomerRelationshipManagementPlanExchangeInputModelCustomerRelationshipManagementPlanExchangeActionRequest incidentExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Relationship Management Plan instance 
   * @return customerRelationshipManagementPlanInstanceReference
  **/

  public String getCustomerRelationshipManagementPlanInstanceReference() {
    return customerRelationshipManagementPlanInstanceReference;
  }

  public void setCustomerRelationshipManagementPlanInstanceReference(String customerRelationshipManagementPlanInstanceReference) {
    this.customerRelationshipManagementPlanInstanceReference = customerRelationshipManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Incident instance 
   * @return incidentInstanceReference
  **/

  public String getIncidentInstanceReference() {
    return incidentInstanceReference;
  }

  public void setIncidentInstanceReference(String incidentInstanceReference) {
    this.incidentInstanceReference = incidentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return incidentExchangeActionTaskRecord
  **/

  public Object getIncidentExchangeActionTaskRecord() {
    return incidentExchangeActionTaskRecord;
  }

  public void setIncidentExchangeActionTaskRecord(Object incidentExchangeActionTaskRecord) {
    this.incidentExchangeActionTaskRecord = incidentExchangeActionTaskRecord;
  }


  /**
   * Get incidentExchangeActionRequest
   * @return incidentExchangeActionRequest
  **/

  public CRCustomerRelationshipManagementPlanExchangeInputModelCustomerRelationshipManagementPlanExchangeActionRequest getIncidentExchangeActionRequest() {
    return incidentExchangeActionRequest;
  }

  public void setIncidentExchangeActionRequest(CRCustomerRelationshipManagementPlanExchangeInputModelCustomerRelationshipManagementPlanExchangeActionRequest incidentExchangeActionRequest) {
    this.incidentExchangeActionRequest = incidentExchangeActionRequest;
  }


}


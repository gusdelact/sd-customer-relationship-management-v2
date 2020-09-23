package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerRelationshipManagementPlanControlInputModelCustomerRelationshipManagementPlanControlActionRequest;

import javax.validation.Valid;
  
/**
 * BQIncidentControlInputModel
 */
public class BQIncidentControlInputModel   {
  private String customerRelationshipManagementPlanInstanceReference = null;

  private String incidentInstanceReference = null;

  private Object incidentControlActionTaskRecord = null;

  private CRCustomerRelationshipManagementPlanControlInputModelCustomerRelationshipManagementPlanControlActionRequest incidentControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return incidentControlActionTaskRecord
  **/

  public Object getIncidentControlActionTaskRecord() {
    return incidentControlActionTaskRecord;
  }

  public void setIncidentControlActionTaskRecord(Object incidentControlActionTaskRecord) {
    this.incidentControlActionTaskRecord = incidentControlActionTaskRecord;
  }


  /**
   * Get incidentControlActionRequest
   * @return incidentControlActionRequest
  **/

  public CRCustomerRelationshipManagementPlanControlInputModelCustomerRelationshipManagementPlanControlActionRequest getIncidentControlActionRequest() {
    return incidentControlActionRequest;
  }

  public void setIncidentControlActionRequest(CRCustomerRelationshipManagementPlanControlInputModelCustomerRelationshipManagementPlanControlActionRequest incidentControlActionRequest) {
    this.incidentControlActionRequest = incidentControlActionRequest;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIncidentUpdateInputModelIncidentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIncidentUpdateInputModel
 */
public class BQIncidentUpdateInputModel   {
  private String customerRelationshipManagementPlanInstanceReference = null;

  private String incidentInstanceReference = null;

  private BQIncidentUpdateInputModelIncidentInstanceRecord incidentInstanceRecord = null;

  private Object incidentUpdateActionTaskRecord = null;

  private String incidentUpdateActionRequest = null;


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
   * Get incidentInstanceRecord
   * @return incidentInstanceRecord
  **/

  public BQIncidentUpdateInputModelIncidentInstanceRecord getIncidentInstanceRecord() {
    return incidentInstanceRecord;
  }

  public void setIncidentInstanceRecord(BQIncidentUpdateInputModelIncidentInstanceRecord incidentInstanceRecord) {
    this.incidentInstanceRecord = incidentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return incidentUpdateActionTaskRecord
  **/

  public Object getIncidentUpdateActionTaskRecord() {
    return incidentUpdateActionTaskRecord;
  }

  public void setIncidentUpdateActionTaskRecord(Object incidentUpdateActionTaskRecord) {
    this.incidentUpdateActionTaskRecord = incidentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return incidentUpdateActionRequest
  **/

  public String getIncidentUpdateActionRequest() {
    return incidentUpdateActionRequest;
  }

  public void setIncidentUpdateActionRequest(String incidentUpdateActionRequest) {
    this.incidentUpdateActionRequest = incidentUpdateActionRequest;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord;
import org.bian.dto.BQIncidentCreateInputModelIncidentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIncidentCreateOutputModel
 */
public class BQIncidentCreateOutputModel   {
  private BQDevelopmentCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord = null;

  private String incidentInstanceReference = null;

  private String incidentInitiateActionReference = null;

  private Object incidentInitiateActionRecord = null;

  private String incidentInstanceStatus = null;

  private BQIncidentCreateInputModelIncidentInstanceRecord incidentInstanceRecord = null;


  /**
   * Get customerRelationshipManagementPlanInstanceRecord
   * @return customerRelationshipManagementPlanInstanceRecord
  **/

  public BQDevelopmentCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord getCustomerRelationshipManagementPlanInstanceRecord() {
    return customerRelationshipManagementPlanInstanceRecord;
  }

  public void setCustomerRelationshipManagementPlanInstanceRecord(BQDevelopmentCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord) {
    this.customerRelationshipManagementPlanInstanceRecord = customerRelationshipManagementPlanInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return incidentInitiateActionReference
  **/

  public String getIncidentInitiateActionReference() {
    return incidentInitiateActionReference;
  }

  public void setIncidentInitiateActionReference(String incidentInitiateActionReference) {
    this.incidentInitiateActionReference = incidentInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return incidentInitiateActionRecord
  **/

  public Object getIncidentInitiateActionRecord() {
    return incidentInitiateActionRecord;
  }

  public void setIncidentInitiateActionRecord(Object incidentInitiateActionRecord) {
    this.incidentInitiateActionRecord = incidentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Incident instance (e.g. initialised, pending, active) 
   * @return incidentInstanceStatus
  **/

  public String getIncidentInstanceStatus() {
    return incidentInstanceStatus;
  }

  public void setIncidentInstanceStatus(String incidentInstanceStatus) {
    this.incidentInstanceStatus = incidentInstanceStatus;
  }


  /**
   * Get incidentInstanceRecord
   * @return incidentInstanceRecord
  **/

  public BQIncidentCreateInputModelIncidentInstanceRecord getIncidentInstanceRecord() {
    return incidentInstanceRecord;
  }

  public void setIncidentInstanceRecord(BQIncidentCreateInputModelIncidentInstanceRecord incidentInstanceRecord) {
    this.incidentInstanceRecord = incidentInstanceRecord;
  }


}


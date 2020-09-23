package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIncidentCaptureInputModelCaptureRecordType;
import org.bian.dto.BQIncidentCaptureInputModelIncidentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIncidentCaptureInputModel
 */
public class BQIncidentCaptureInputModel   {
  private String customerRelationshipManagementPlanInstanceReference = null;

  private String incidentInstanceReference = null;

  private BQIncidentCaptureInputModelIncidentInstanceRecord incidentInstanceRecord = null;

  private Object incidentCaptureActionTaskRecord = null;

  private BQIncidentCaptureInputModelCaptureRecordType captureRecordType = null;


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

  public BQIncidentCaptureInputModelIncidentInstanceRecord getIncidentInstanceRecord() {
    return incidentInstanceRecord;
  }

  public void setIncidentInstanceRecord(BQIncidentCaptureInputModelIncidentInstanceRecord incidentInstanceRecord) {
    this.incidentInstanceRecord = incidentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The capture service call consolidated processing record 
   * @return incidentCaptureActionTaskRecord
  **/

  public Object getIncidentCaptureActionTaskRecord() {
    return incidentCaptureActionTaskRecord;
  }

  public void setIncidentCaptureActionTaskRecord(Object incidentCaptureActionTaskRecord) {
    this.incidentCaptureActionTaskRecord = incidentCaptureActionTaskRecord;
  }


  /**
   * Get captureRecordType
   * @return captureRecordType
  **/

  public BQIncidentCaptureInputModelCaptureRecordType getCaptureRecordType() {
    return captureRecordType;
  }

  public void setCaptureRecordType(BQIncidentCaptureInputModelCaptureRecordType captureRecordType) {
    this.captureRecordType = captureRecordType;
  }


}


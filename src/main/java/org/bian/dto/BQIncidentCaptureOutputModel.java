package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIncidentCaptureOutputModelIncidentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIncidentCaptureOutputModel
 */
public class BQIncidentCaptureOutputModel   {
  private BQIncidentCaptureOutputModelIncidentInstanceRecord incidentInstanceRecord = null;

  private String incidentCaptureActionTaskReference = null;

  private Object incidentCaptureActionTaskRecord = null;

  private String incidentCaptureRecordReference = null;

  private Object captureResponseRecord = null;


  /**
   * Get incidentInstanceRecord
   * @return incidentInstanceRecord
  **/

  public BQIncidentCaptureOutputModelIncidentInstanceRecord getIncidentInstanceRecord() {
    return incidentInstanceRecord;
  }

  public void setIncidentInstanceRecord(BQIncidentCaptureOutputModelIncidentInstanceRecord incidentInstanceRecord) {
    this.incidentInstanceRecord = incidentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Incident instance capture service call 
   * @return incidentCaptureActionTaskReference
  **/

  public String getIncidentCaptureActionTaskReference() {
    return incidentCaptureActionTaskReference;
  }

  public void setIncidentCaptureActionTaskReference(String incidentCaptureActionTaskReference) {
    this.incidentCaptureActionTaskReference = incidentCaptureActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Incident structured input transaction/record 
   * @return incidentCaptureRecordReference
  **/

  public String getIncidentCaptureRecordReference() {
    return incidentCaptureRecordReference;
  }

  public void setIncidentCaptureRecordReference(String incidentCaptureRecordReference) {
    this.incidentCaptureRecordReference = incidentCaptureRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the capture action service response 
   * @return captureResponseRecord
  **/

  public Object getCaptureResponseRecord() {
    return captureResponseRecord;
  }

  public void setCaptureResponseRecord(Object captureResponseRecord) {
    this.captureResponseRecord = captureResponseRecord;
  }


}


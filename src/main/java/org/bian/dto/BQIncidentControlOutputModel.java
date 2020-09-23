package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIncidentControlOutputModel
 */
public class BQIncidentControlOutputModel   {
  private String incidentControlActionTaskReference = null;

  private Object incidentControlActionTaskRecord = null;

  private String incidentControlActionResponse = null;

  private String incidentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Incident instance control processing service call 
   * @return incidentControlActionTaskReference
  **/

  public String getIncidentControlActionTaskReference() {
    return incidentControlActionTaskReference;
  }

  public void setIncidentControlActionTaskReference(String incidentControlActionTaskReference) {
    this.incidentControlActionTaskReference = incidentControlActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return incidentControlActionResponse
  **/

  public String getIncidentControlActionResponse() {
    return incidentControlActionResponse;
  }

  public void setIncidentControlActionResponse(String incidentControlActionResponse) {
    this.incidentControlActionResponse = incidentControlActionResponse;
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


}


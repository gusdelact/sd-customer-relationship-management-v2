package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIncidentExchangeOutputModel
 */
public class BQIncidentExchangeOutputModel   {
  private String incidentExchangeActionTaskReference = null;

  private Object incidentExchangeActionTaskRecord = null;

  private String incidentExchangeActionResponse = null;

  private String incidentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Incident instance exchange service call 
   * @return incidentExchangeActionTaskReference
  **/

  public String getIncidentExchangeActionTaskReference() {
    return incidentExchangeActionTaskReference;
  }

  public void setIncidentExchangeActionTaskReference(String incidentExchangeActionTaskReference) {
    this.incidentExchangeActionTaskReference = incidentExchangeActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return incidentExchangeActionResponse
  **/

  public String getIncidentExchangeActionResponse() {
    return incidentExchangeActionResponse;
  }

  public void setIncidentExchangeActionResponse(String incidentExchangeActionResponse) {
    this.incidentExchangeActionResponse = incidentExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Incident instance (e.g. accepted, rejected, verified) 
   * @return incidentInstanceStatus
  **/

  public String getIncidentInstanceStatus() {
    return incidentInstanceStatus;
  }

  public void setIncidentInstanceStatus(String incidentInstanceStatus) {
    this.incidentInstanceStatus = incidentInstanceStatus;
  }


}


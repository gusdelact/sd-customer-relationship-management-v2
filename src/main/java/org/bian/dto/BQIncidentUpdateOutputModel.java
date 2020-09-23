package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIncidentUpdateInputModelIncidentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQIncidentUpdateOutputModel
 */
public class BQIncidentUpdateOutputModel   {
  private BQIncidentUpdateInputModelIncidentInstanceRecord incidentInstanceRecord = null;

  private String incidentUpdateActionTaskReference = null;

  private Object incidentUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return incidentUpdateActionTaskReference
  **/

  public String getIncidentUpdateActionTaskReference() {
    return incidentUpdateActionTaskReference;
  }

  public void setIncidentUpdateActionTaskReference(String incidentUpdateActionTaskReference) {
    this.incidentUpdateActionTaskReference = incidentUpdateActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the Update action service response 
   * @return updateResponseRecord
  **/

  public Object getUpdateResponseRecord() {
    return updateResponseRecord;
  }

  public void setUpdateResponseRecord(Object updateResponseRecord) {
    this.updateResponseRecord = updateResponseRecord;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIncidentRetrieveInputModelIncidentInstanceReport
 */
public class BQIncidentRetrieveInputModelIncidentInstanceReport   {
  private String incidentInstanceReportReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return incidentInstanceReportReference
  **/

  public String getIncidentInstanceReportReference() {
    return incidentInstanceReportReference;
  }

  public void setIncidentInstanceReportReference(String incidentInstanceReportReference) {
    this.incidentInstanceReportReference = incidentInstanceReportReference;
  }


}


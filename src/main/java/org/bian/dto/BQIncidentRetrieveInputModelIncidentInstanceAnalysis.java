package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIncidentRetrieveInputModelIncidentInstanceAnalysis
 */
public class BQIncidentRetrieveInputModelIncidentInstanceAnalysis   {
  private String incidentInstanceAnalysisReference = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return incidentInstanceAnalysisReference
  **/

  public String getIncidentInstanceAnalysisReference() {
    return incidentInstanceAnalysisReference;
  }

  public void setIncidentInstanceAnalysisReference(String incidentInstanceAnalysisReference) {
    this.incidentInstanceAnalysisReference = incidentInstanceAnalysisReference;
  }


}


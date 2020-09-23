package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIncidentCaptureOutputModelIncidentInstanceRecordRelationshipIncidentRecord
 */
public class BQIncidentCaptureOutputModelIncidentInstanceRecordRelationshipIncidentRecord   {
  private String customerIncidentResolution = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Narrative of the resolution actions made or committed 
   * @return customerIncidentResolution
  **/

  public String getCustomerIncidentResolution() {
    return customerIncidentResolution;
  }

  public void setCustomerIncidentResolution(String customerIncidentResolution) {
    this.customerIncidentResolution = customerIncidentResolution;
  }


}


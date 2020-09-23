package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContactCreateInputModelContactInstanceRecord
 */
public class BQContactCreateInputModelContactInstanceRecord   {
  private String customerRelationshipContactHistory = null;

  private String customerRelationshipContactSchedule = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Records the timing, purpose, details and impact of customer contacts 
   * @return customerRelationshipContactHistory
  **/

  public String getCustomerRelationshipContactHistory() {
    return customerRelationshipContactHistory;
  }

  public void setCustomerRelationshipContactHistory(String customerRelationshipContactHistory) {
    this.customerRelationshipContactHistory = customerRelationshipContactHistory;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The schedule of past and planned customer contacts 
   * @return customerRelationshipContactSchedule
  **/

  public String getCustomerRelationshipContactSchedule() {
    return customerRelationshipContactSchedule;
  }

  public void setCustomerRelationshipContactSchedule(String customerRelationshipContactSchedule) {
    this.customerRelationshipContactSchedule = customerRelationshipContactSchedule;
  }


}


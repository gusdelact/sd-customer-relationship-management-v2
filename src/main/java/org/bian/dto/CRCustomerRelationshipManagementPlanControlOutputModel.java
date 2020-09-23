package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanControlOutputModel
 */
public class CRCustomerRelationshipManagementPlanControlOutputModel   {
  private String customerRelationshipManagementPlanControlActionTaskReference = null;

  private Object customerRelationshipManagementPlanControlActionTaskRecord = null;

  private String customerRelationshipManagementPlanControlActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Relationship Management Plan instance control processing service call 
   * @return customerRelationshipManagementPlanControlActionTaskReference
  **/

  public String getCustomerRelationshipManagementPlanControlActionTaskReference() {
    return customerRelationshipManagementPlanControlActionTaskReference;
  }

  public void setCustomerRelationshipManagementPlanControlActionTaskReference(String customerRelationshipManagementPlanControlActionTaskReference) {
    this.customerRelationshipManagementPlanControlActionTaskReference = customerRelationshipManagementPlanControlActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerRelationshipManagementPlanControlActionTaskRecord
  **/

  public Object getCustomerRelationshipManagementPlanControlActionTaskRecord() {
    return customerRelationshipManagementPlanControlActionTaskRecord;
  }

  public void setCustomerRelationshipManagementPlanControlActionTaskRecord(Object customerRelationshipManagementPlanControlActionTaskRecord) {
    this.customerRelationshipManagementPlanControlActionTaskRecord = customerRelationshipManagementPlanControlActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the control action service response 
   * @return customerRelationshipManagementPlanControlActionResponse
  **/

  public String getCustomerRelationshipManagementPlanControlActionResponse() {
    return customerRelationshipManagementPlanControlActionResponse;
  }

  public void setCustomerRelationshipManagementPlanControlActionResponse(String customerRelationshipManagementPlanControlActionResponse) {
    this.customerRelationshipManagementPlanControlActionResponse = customerRelationshipManagementPlanControlActionResponse;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanExchangeOutputModel
 */
public class CRCustomerRelationshipManagementPlanExchangeOutputModel   {
  private String customerRelationshipManagementPlanExchangeActionTaskReference = null;

  private Object customerRelationshipManagementPlanExchangeActionTaskRecord = null;

  private String customerRelationshipManagementPlanExchangeActionResponse = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Relationship Management Plan instance exchange service call 
   * @return customerRelationshipManagementPlanExchangeActionTaskReference
  **/

  public String getCustomerRelationshipManagementPlanExchangeActionTaskReference() {
    return customerRelationshipManagementPlanExchangeActionTaskReference;
  }

  public void setCustomerRelationshipManagementPlanExchangeActionTaskReference(String customerRelationshipManagementPlanExchangeActionTaskReference) {
    this.customerRelationshipManagementPlanExchangeActionTaskReference = customerRelationshipManagementPlanExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return customerRelationshipManagementPlanExchangeActionTaskRecord
  **/

  public Object getCustomerRelationshipManagementPlanExchangeActionTaskRecord() {
    return customerRelationshipManagementPlanExchangeActionTaskRecord;
  }

  public void setCustomerRelationshipManagementPlanExchangeActionTaskRecord(Object customerRelationshipManagementPlanExchangeActionTaskRecord) {
    this.customerRelationshipManagementPlanExchangeActionTaskRecord = customerRelationshipManagementPlanExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return customerRelationshipManagementPlanExchangeActionResponse
  **/

  public String getCustomerRelationshipManagementPlanExchangeActionResponse() {
    return customerRelationshipManagementPlanExchangeActionResponse;
  }

  public void setCustomerRelationshipManagementPlanExchangeActionResponse(String customerRelationshipManagementPlanExchangeActionResponse) {
    this.customerRelationshipManagementPlanExchangeActionResponse = customerRelationshipManagementPlanExchangeActionResponse;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerRelationshipManagementPlanExchangeInputModelCustomerRelationshipManagementPlanExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * BQDevelopmentExchangeInputModel
 */
public class BQDevelopmentExchangeInputModel   {
  private String customerRelationshipManagementPlanInstanceReference = null;

  private String developmentInstanceReference = null;

  private Object developmentExchangeActionTaskRecord = null;

  private CRCustomerRelationshipManagementPlanExchangeInputModelCustomerRelationshipManagementPlanExchangeActionRequest developmentExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the parent Customer Relationship Management Plan instance 
   * @return customerRelationshipManagementPlanInstanceReference
  **/

  public String getCustomerRelationshipManagementPlanInstanceReference() {
    return customerRelationshipManagementPlanInstanceReference;
  }

  public void setCustomerRelationshipManagementPlanInstanceReference(String customerRelationshipManagementPlanInstanceReference) {
    this.customerRelationshipManagementPlanInstanceReference = customerRelationshipManagementPlanInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Development instance 
   * @return developmentInstanceReference
  **/

  public String getDevelopmentInstanceReference() {
    return developmentInstanceReference;
  }

  public void setDevelopmentInstanceReference(String developmentInstanceReference) {
    this.developmentInstanceReference = developmentInstanceReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return developmentExchangeActionTaskRecord
  **/

  public Object getDevelopmentExchangeActionTaskRecord() {
    return developmentExchangeActionTaskRecord;
  }

  public void setDevelopmentExchangeActionTaskRecord(Object developmentExchangeActionTaskRecord) {
    this.developmentExchangeActionTaskRecord = developmentExchangeActionTaskRecord;
  }


  /**
   * Get developmentExchangeActionRequest
   * @return developmentExchangeActionRequest
  **/

  public CRCustomerRelationshipManagementPlanExchangeInputModelCustomerRelationshipManagementPlanExchangeActionRequest getDevelopmentExchangeActionRequest() {
    return developmentExchangeActionRequest;
  }

  public void setDevelopmentExchangeActionRequest(CRCustomerRelationshipManagementPlanExchangeInputModelCustomerRelationshipManagementPlanExchangeActionRequest developmentExchangeActionRequest) {
    this.developmentExchangeActionRequest = developmentExchangeActionRequest;
  }


}


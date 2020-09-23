package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerRelationshipManagementPlanExchangeInputModelCustomerRelationshipManagementPlanExchangeActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanExchangeInputModel
 */
public class CRCustomerRelationshipManagementPlanExchangeInputModel   {
  private String customerRelationshipManagementServicingSessionReference = null;

  private String customerRelationshipManagementPlanInstanceReference = null;

  private Object customerRelationshipManagementPlanExchangeActionTaskRecord = null;

  private CRCustomerRelationshipManagementPlanExchangeInputModelCustomerRelationshipManagementPlanExchangeActionRequest customerRelationshipManagementPlanExchangeActionRequest = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the active servicing session 
   * @return customerRelationshipManagementServicingSessionReference
  **/

  public String getCustomerRelationshipManagementServicingSessionReference() {
    return customerRelationshipManagementServicingSessionReference;
  }

  public void setCustomerRelationshipManagementServicingSessionReference(String customerRelationshipManagementServicingSessionReference) {
    this.customerRelationshipManagementServicingSessionReference = customerRelationshipManagementServicingSessionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the Customer Relationship Management Plan instance 
   * @return customerRelationshipManagementPlanInstanceReference
  **/

  public String getCustomerRelationshipManagementPlanInstanceReference() {
    return customerRelationshipManagementPlanInstanceReference;
  }

  public void setCustomerRelationshipManagementPlanInstanceReference(String customerRelationshipManagementPlanInstanceReference) {
    this.customerRelationshipManagementPlanInstanceReference = customerRelationshipManagementPlanInstanceReference;
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
   * Get customerRelationshipManagementPlanExchangeActionRequest
   * @return customerRelationshipManagementPlanExchangeActionRequest
  **/

  public CRCustomerRelationshipManagementPlanExchangeInputModelCustomerRelationshipManagementPlanExchangeActionRequest getCustomerRelationshipManagementPlanExchangeActionRequest() {
    return customerRelationshipManagementPlanExchangeActionRequest;
  }

  public void setCustomerRelationshipManagementPlanExchangeActionRequest(CRCustomerRelationshipManagementPlanExchangeInputModelCustomerRelationshipManagementPlanExchangeActionRequest customerRelationshipManagementPlanExchangeActionRequest) {
    this.customerRelationshipManagementPlanExchangeActionRequest = customerRelationshipManagementPlanExchangeActionRequest;
  }


}


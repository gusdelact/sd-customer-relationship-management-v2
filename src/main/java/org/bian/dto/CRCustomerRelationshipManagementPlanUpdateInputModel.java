package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanUpdateInputModel
 */
public class CRCustomerRelationshipManagementPlanUpdateInputModel   {
  private String customerRelationshipManagementServicingSessionReference = null;

  private String customerRelationshipManagementPlanInstanceReference = null;

  private Object customerRelationshipManagementPlanUpdateActionTaskRecord = null;

  private String updateActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return customerRelationshipManagementPlanUpdateActionTaskRecord
  **/

  public Object getCustomerRelationshipManagementPlanUpdateActionTaskRecord() {
    return customerRelationshipManagementPlanUpdateActionTaskRecord;
  }

  public void setCustomerRelationshipManagementPlanUpdateActionTaskRecord(Object customerRelationshipManagementPlanUpdateActionTaskRecord) {
    this.customerRelationshipManagementPlanUpdateActionTaskRecord = customerRelationshipManagementPlanUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return updateActionRequest
  **/

  public String getUpdateActionRequest() {
    return updateActionRequest;
  }

  public void setUpdateActionRequest(String updateActionRequest) {
    this.updateActionRequest = updateActionRequest;
  }


}


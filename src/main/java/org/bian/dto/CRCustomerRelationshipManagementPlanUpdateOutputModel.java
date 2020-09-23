package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanUpdateOutputModel
 */
public class CRCustomerRelationshipManagementPlanUpdateOutputModel   {
  private String customerRelationshipManagementPlanUpdateActionTaskReference = null;

  private Object customerRelationshipManagementPlanUpdateActionTaskRecord = null;

  private Object updateResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an update service call 
   * @return customerRelationshipManagementPlanUpdateActionTaskReference
  **/

  public String getCustomerRelationshipManagementPlanUpdateActionTaskReference() {
    return customerRelationshipManagementPlanUpdateActionTaskReference;
  }

  public void setCustomerRelationshipManagementPlanUpdateActionTaskReference(String customerRelationshipManagementPlanUpdateActionTaskReference) {
    this.customerRelationshipManagementPlanUpdateActionTaskReference = customerRelationshipManagementPlanUpdateActionTaskReference;
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


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanRequestOutputModel
 */
public class CRCustomerRelationshipManagementPlanRequestOutputModel   {
  private String customerRelationshipManagementPlanRequestActionTaskReference = null;

  private Object customerRelationshipManagementPlanRequestActionTaskRecord = null;

  private String requestRecordReference = null;

  private Object requestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Relationship Management Plan instance request service call 
   * @return customerRelationshipManagementPlanRequestActionTaskReference
  **/

  public String getCustomerRelationshipManagementPlanRequestActionTaskReference() {
    return customerRelationshipManagementPlanRequestActionTaskReference;
  }

  public void setCustomerRelationshipManagementPlanRequestActionTaskReference(String customerRelationshipManagementPlanRequestActionTaskReference) {
    this.customerRelationshipManagementPlanRequestActionTaskReference = customerRelationshipManagementPlanRequestActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return customerRelationshipManagementPlanRequestActionTaskRecord
  **/

  public Object getCustomerRelationshipManagementPlanRequestActionTaskRecord() {
    return customerRelationshipManagementPlanRequestActionTaskRecord;
  }

  public void setCustomerRelationshipManagementPlanRequestActionTaskRecord(Object customerRelationshipManagementPlanRequestActionTaskRecord) {
    this.customerRelationshipManagementPlanRequestActionTaskRecord = customerRelationshipManagementPlanRequestActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the service request record 
   * @return requestRecordReference
  **/

  public String getRequestRecordReference() {
    return requestRecordReference;
  }

  public void setRequestRecordReference(String requestRecordReference) {
    this.requestRecordReference = requestRecordReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: Details of the request action service response 
   * @return requestResponseRecord
  **/

  public Object getRequestResponseRecord() {
    return requestResponseRecord;
  }

  public void setRequestResponseRecord(Object requestResponseRecord) {
    this.requestResponseRecord = requestResponseRecord;
  }


}


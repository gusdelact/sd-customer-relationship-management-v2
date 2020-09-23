package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerRelationshipManagementPlanCreateInputModelCustomerRelationshipManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanCreateInputModel
 */
public class CRCustomerRelationshipManagementPlanCreateInputModel   {
  private String customerRelationshipManagementServicingSessionReference = null;

  private Object customerRelationshipManagementPlanCreateActionRecord = null;

  private String customerRelationshipManagementPlanInstanceStatus = null;

  private CRCustomerRelationshipManagementPlanCreateInputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Create service call input and output record 
   * @return customerRelationshipManagementPlanCreateActionRecord
  **/

  public Object getCustomerRelationshipManagementPlanCreateActionRecord() {
    return customerRelationshipManagementPlanCreateActionRecord;
  }

  public void setCustomerRelationshipManagementPlanCreateActionRecord(Object customerRelationshipManagementPlanCreateActionRecord) {
    this.customerRelationshipManagementPlanCreateActionRecord = customerRelationshipManagementPlanCreateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Customer Relationship Management Plan instance (e.g. initialised, pending, active) 
   * @return customerRelationshipManagementPlanInstanceStatus
  **/

  public String getCustomerRelationshipManagementPlanInstanceStatus() {
    return customerRelationshipManagementPlanInstanceStatus;
  }

  public void setCustomerRelationshipManagementPlanInstanceStatus(String customerRelationshipManagementPlanInstanceStatus) {
    this.customerRelationshipManagementPlanInstanceStatus = customerRelationshipManagementPlanInstanceStatus;
  }


  /**
   * Get customerRelationshipManagementPlanInstanceRecord
   * @return customerRelationshipManagementPlanInstanceRecord
  **/

  public CRCustomerRelationshipManagementPlanCreateInputModelCustomerRelationshipManagementPlanInstanceRecord getCustomerRelationshipManagementPlanInstanceRecord() {
    return customerRelationshipManagementPlanInstanceRecord;
  }

  public void setCustomerRelationshipManagementPlanInstanceRecord(CRCustomerRelationshipManagementPlanCreateInputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord) {
    this.customerRelationshipManagementPlanInstanceRecord = customerRelationshipManagementPlanInstanceRecord;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerRelationshipManagementPlanCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanCreateOutputModel
 */
public class CRCustomerRelationshipManagementPlanCreateOutputModel   {
  private String customerRelationshipManagementPlanInstanceReference = null;

  private String customerRelationshipManagementPlanCreateActionReference = null;

  private Object customerRelationshipManagementPlanCreateActionRecord = null;

  private String customerRelationshipManagementPlanInstanceStatus = null;

  private CRCustomerRelationshipManagementPlanCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Create service call 
   * @return customerRelationshipManagementPlanCreateActionReference
  **/

  public String getCustomerRelationshipManagementPlanCreateActionReference() {
    return customerRelationshipManagementPlanCreateActionReference;
  }

  public void setCustomerRelationshipManagementPlanCreateActionReference(String customerRelationshipManagementPlanCreateActionReference) {
    this.customerRelationshipManagementPlanCreateActionReference = customerRelationshipManagementPlanCreateActionReference;
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

  public CRCustomerRelationshipManagementPlanCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord getCustomerRelationshipManagementPlanInstanceRecord() {
    return customerRelationshipManagementPlanInstanceRecord;
  }

  public void setCustomerRelationshipManagementPlanInstanceRecord(CRCustomerRelationshipManagementPlanCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord) {
    this.customerRelationshipManagementPlanInstanceRecord = customerRelationshipManagementPlanInstanceRecord;
  }


}


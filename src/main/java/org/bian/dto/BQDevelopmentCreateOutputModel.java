package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentCreateInputModelDevelopmentInstanceRecord;
import org.bian.dto.BQDevelopmentCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDevelopmentCreateOutputModel
 */
public class BQDevelopmentCreateOutputModel   {
  private BQDevelopmentCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord = null;

  private String developmentInstanceReference = null;

  private String developmentInitiateActionReference = null;

  private Object developmentInitiateActionRecord = null;

  private String developmentInstanceStatus = null;

  private BQDevelopmentCreateInputModelDevelopmentInstanceRecord developmentInstanceRecord = null;


  /**
   * Get customerRelationshipManagementPlanInstanceRecord
   * @return customerRelationshipManagementPlanInstanceRecord
  **/

  public BQDevelopmentCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord getCustomerRelationshipManagementPlanInstanceRecord() {
    return customerRelationshipManagementPlanInstanceRecord;
  }

  public void setCustomerRelationshipManagementPlanInstanceRecord(BQDevelopmentCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord) {
    this.customerRelationshipManagementPlanInstanceRecord = customerRelationshipManagementPlanInstanceRecord;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to an Initiate service call 
   * @return developmentInitiateActionReference
  **/

  public String getDevelopmentInitiateActionReference() {
    return developmentInitiateActionReference;
  }

  public void setDevelopmentInitiateActionReference(String developmentInitiateActionReference) {
    this.developmentInitiateActionReference = developmentInitiateActionReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The Initiate service call input and output record 
   * @return developmentInitiateActionRecord
  **/

  public Object getDevelopmentInitiateActionRecord() {
    return developmentInitiateActionRecord;
  }

  public void setDevelopmentInitiateActionRecord(Object developmentInitiateActionRecord) {
    this.developmentInitiateActionRecord = developmentInitiateActionRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Development instance (e.g. initialised, pending, active) 
   * @return developmentInstanceStatus
  **/

  public String getDevelopmentInstanceStatus() {
    return developmentInstanceStatus;
  }

  public void setDevelopmentInstanceStatus(String developmentInstanceStatus) {
    this.developmentInstanceStatus = developmentInstanceStatus;
  }


  /**
   * Get developmentInstanceRecord
   * @return developmentInstanceRecord
  **/

  public BQDevelopmentCreateInputModelDevelopmentInstanceRecord getDevelopmentInstanceRecord() {
    return developmentInstanceRecord;
  }

  public void setDevelopmentInstanceRecord(BQDevelopmentCreateInputModelDevelopmentInstanceRecord developmentInstanceRecord) {
    this.developmentInstanceRecord = developmentInstanceRecord;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentCreateInputModelCustomerRelationshipManagementPlanInstanceRecord;
import org.bian.dto.BQDevelopmentCreateInputModelDevelopmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDevelopmentCreateInputModel
 */
public class BQDevelopmentCreateInputModel   {
  private BQDevelopmentCreateInputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord = null;

  private String customerRelationshipManagementPlanInstanceReference = null;

  private Object developmentInitiateActionRecord = null;

  private BQDevelopmentCreateInputModelDevelopmentInstanceRecord developmentInstanceRecord = null;


  /**
   * Get customerRelationshipManagementPlanInstanceRecord
   * @return customerRelationshipManagementPlanInstanceRecord
  **/

  public BQDevelopmentCreateInputModelCustomerRelationshipManagementPlanInstanceRecord getCustomerRelationshipManagementPlanInstanceRecord() {
    return customerRelationshipManagementPlanInstanceRecord;
  }

  public void setCustomerRelationshipManagementPlanInstanceRecord(BQDevelopmentCreateInputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord) {
    this.customerRelationshipManagementPlanInstanceRecord = customerRelationshipManagementPlanInstanceRecord;
  }


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


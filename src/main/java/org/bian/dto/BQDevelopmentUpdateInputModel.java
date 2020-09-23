package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentUpdateInputModelCustomerRelationshipManagementPlanInstanceRecord;
import org.bian.dto.BQDevelopmentUpdateInputModelDevelopmentInstanceRecord;

import javax.validation.Valid;
  
/**
 * BQDevelopmentUpdateInputModel
 */
public class BQDevelopmentUpdateInputModel   {
  private BQDevelopmentUpdateInputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord = null;

  private String customerRelationshipManagementPlanInstanceReference = null;

  private String developmentInstanceReference = null;

  private BQDevelopmentUpdateInputModelDevelopmentInstanceRecord developmentInstanceRecord = null;

  private Object developmentUpdateActionTaskRecord = null;

  private String developmentUpdateActionRequest = null;


  /**
   * Get customerRelationshipManagementPlanInstanceRecord
   * @return customerRelationshipManagementPlanInstanceRecord
  **/

  public BQDevelopmentUpdateInputModelCustomerRelationshipManagementPlanInstanceRecord getCustomerRelationshipManagementPlanInstanceRecord() {
    return customerRelationshipManagementPlanInstanceRecord;
  }

  public void setCustomerRelationshipManagementPlanInstanceRecord(BQDevelopmentUpdateInputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord) {
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
   * Get developmentInstanceRecord
   * @return developmentInstanceRecord
  **/

  public BQDevelopmentUpdateInputModelDevelopmentInstanceRecord getDevelopmentInstanceRecord() {
    return developmentInstanceRecord;
  }

  public void setDevelopmentInstanceRecord(BQDevelopmentUpdateInputModelDevelopmentInstanceRecord developmentInstanceRecord) {
    this.developmentInstanceRecord = developmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The update service call consolidated processing record 
   * @return developmentUpdateActionTaskRecord
  **/

  public Object getDevelopmentUpdateActionTaskRecord() {
    return developmentUpdateActionTaskRecord;
  }

  public void setDevelopmentUpdateActionTaskRecord(Object developmentUpdateActionTaskRecord) {
    this.developmentUpdateActionTaskRecord = developmentUpdateActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the update action service request 
   * @return developmentUpdateActionRequest
  **/

  public String getDevelopmentUpdateActionRequest() {
    return developmentUpdateActionRequest;
  }

  public void setDevelopmentUpdateActionRequest(String developmentUpdateActionRequest) {
    this.developmentUpdateActionRequest = developmentUpdateActionRequest;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentRequestInputModelDevelopmentInstanceRecord;
import org.bian.dto.CRCustomerRelationshipManagementPlanRequestInputModelRequestRecordType;

import javax.validation.Valid;
  
/**
 * BQDevelopmentRequestInputModel
 */
public class BQDevelopmentRequestInputModel   {
  private String customerRelationshipManagementPlanInstanceReference = null;

  private String developmentInstanceReference = null;

  private BQDevelopmentRequestInputModelDevelopmentInstanceRecord developmentInstanceRecord = null;

  private Object developmentRequestActionTaskRecord = null;

  private CRCustomerRelationshipManagementPlanRequestInputModelRequestRecordType requestRecordType = null;


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

  public BQDevelopmentRequestInputModelDevelopmentInstanceRecord getDevelopmentInstanceRecord() {
    return developmentInstanceRecord;
  }

  public void setDevelopmentInstanceRecord(BQDevelopmentRequestInputModelDevelopmentInstanceRecord developmentInstanceRecord) {
    this.developmentInstanceRecord = developmentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The request service call consolidated processing record 
   * @return developmentRequestActionTaskRecord
  **/

  public Object getDevelopmentRequestActionTaskRecord() {
    return developmentRequestActionTaskRecord;
  }

  public void setDevelopmentRequestActionTaskRecord(Object developmentRequestActionTaskRecord) {
    this.developmentRequestActionTaskRecord = developmentRequestActionTaskRecord;
  }


  /**
   * Get requestRecordType
   * @return requestRecordType
  **/

  public CRCustomerRelationshipManagementPlanRequestInputModelRequestRecordType getRequestRecordType() {
    return requestRecordType;
  }

  public void setRequestRecordType(CRCustomerRelationshipManagementPlanRequestInputModelRequestRecordType requestRecordType) {
    this.requestRecordType = requestRecordType;
  }


}


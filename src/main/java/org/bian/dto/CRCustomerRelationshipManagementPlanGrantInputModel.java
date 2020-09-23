package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerRelationshipManagementPlanGrantInputModelGrantRequestInputRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanGrantInputModel
 */
public class CRCustomerRelationshipManagementPlanGrantInputModel   {
  private String customerRelationshipManagementServicingSessionReference = null;

  private String customerRelationshipManagementPlanInstanceReference = null;

  private Object customerRelationshipManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordType = null;

  private CRCustomerRelationshipManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The grant service call consolidated processing record 
   * @return customerRelationshipManagementPlanGrantActionTaskRecord
  **/

  public Object getCustomerRelationshipManagementPlanGrantActionTaskRecord() {
    return customerRelationshipManagementPlanGrantActionTaskRecord;
  }

  public void setCustomerRelationshipManagementPlanGrantActionTaskRecord(Object customerRelationshipManagementPlanGrantActionTaskRecord) {
    this.customerRelationshipManagementPlanGrantActionTaskRecord = customerRelationshipManagementPlanGrantActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Grant request type (e.g. access permission) 
   * @return grantRequestRecordType
  **/

  public String getGrantRequestRecordType() {
    return grantRequestRecordType;
  }

  public void setGrantRequestRecordType(String grantRequestRecordType) {
    this.grantRequestRecordType = grantRequestRecordType;
  }


  /**
   * Get grantRequestInputRecord
   * @return grantRequestInputRecord
  **/

  public CRCustomerRelationshipManagementPlanGrantInputModelGrantRequestInputRecord getGrantRequestInputRecord() {
    return grantRequestInputRecord;
  }

  public void setGrantRequestInputRecord(CRCustomerRelationshipManagementPlanGrantInputModelGrantRequestInputRecord grantRequestInputRecord) {
    this.grantRequestInputRecord = grantRequestInputRecord;
  }


}


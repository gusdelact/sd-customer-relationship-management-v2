package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerRelationshipManagementPlanGrantOutputModelGrantRequestResponseRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanGrantOutputModel
 */
public class CRCustomerRelationshipManagementPlanGrantOutputModel   {
  private String customerRelationshipManagementPlanGrantActionTaskReference = null;

  private Object customerRelationshipManagementPlanGrantActionTaskRecord = null;

  private String grantRequestRecordReference = null;

  private CRCustomerRelationshipManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Relationship Management Plan instance grant service call 
   * @return customerRelationshipManagementPlanGrantActionTaskReference
  **/

  public String getCustomerRelationshipManagementPlanGrantActionTaskReference() {
    return customerRelationshipManagementPlanGrantActionTaskReference;
  }

  public void setCustomerRelationshipManagementPlanGrantActionTaskReference(String customerRelationshipManagementPlanGrantActionTaskReference) {
    this.customerRelationshipManagementPlanGrantActionTaskReference = customerRelationshipManagementPlanGrantActionTaskReference;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the grant request record 
   * @return grantRequestRecordReference
  **/

  public String getGrantRequestRecordReference() {
    return grantRequestRecordReference;
  }

  public void setGrantRequestRecordReference(String grantRequestRecordReference) {
    this.grantRequestRecordReference = grantRequestRecordReference;
  }


  /**
   * Get grantRequestResponseRecord
   * @return grantRequestResponseRecord
  **/

  public CRCustomerRelationshipManagementPlanGrantOutputModelGrantRequestResponseRecord getGrantRequestResponseRecord() {
    return grantRequestResponseRecord;
  }

  public void setGrantRequestResponseRecord(CRCustomerRelationshipManagementPlanGrantOutputModelGrantRequestResponseRecord grantRequestResponseRecord) {
    this.grantRequestResponseRecord = grantRequestResponseRecord;
  }


}


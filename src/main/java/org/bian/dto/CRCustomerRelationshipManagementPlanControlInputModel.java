package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerRelationshipManagementPlanControlInputModelCustomerRelationshipManagementPlanControlActionRequest;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanControlInputModel
 */
public class CRCustomerRelationshipManagementPlanControlInputModel   {
  private String customerRelationshipManagementServicingSessionReference = null;

  private String customerRelationshipManagementPlanInstanceReference = null;

  private Object customerRelationshipManagementPlanControlActionTaskRecord = null;

  private CRCustomerRelationshipManagementPlanControlInputModelCustomerRelationshipManagementPlanControlActionRequest customerRelationshipManagementPlanControlActionRequest = null;


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The processing control service call consolidated processing record 
   * @return customerRelationshipManagementPlanControlActionTaskRecord
  **/

  public Object getCustomerRelationshipManagementPlanControlActionTaskRecord() {
    return customerRelationshipManagementPlanControlActionTaskRecord;
  }

  public void setCustomerRelationshipManagementPlanControlActionTaskRecord(Object customerRelationshipManagementPlanControlActionTaskRecord) {
    this.customerRelationshipManagementPlanControlActionTaskRecord = customerRelationshipManagementPlanControlActionTaskRecord;
  }


  /**
   * Get customerRelationshipManagementPlanControlActionRequest
   * @return customerRelationshipManagementPlanControlActionRequest
  **/

  public CRCustomerRelationshipManagementPlanControlInputModelCustomerRelationshipManagementPlanControlActionRequest getCustomerRelationshipManagementPlanControlActionRequest() {
    return customerRelationshipManagementPlanControlActionRequest;
  }

  public void setCustomerRelationshipManagementPlanControlActionRequest(CRCustomerRelationshipManagementPlanControlInputModelCustomerRelationshipManagementPlanControlActionRequest customerRelationshipManagementPlanControlActionRequest) {
    this.customerRelationshipManagementPlanControlActionRequest = customerRelationshipManagementPlanControlActionRequest;
  }


}


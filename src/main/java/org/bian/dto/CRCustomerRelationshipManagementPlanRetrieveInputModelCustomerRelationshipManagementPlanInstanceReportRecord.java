package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanRetrieveInputModelCustomerRelationshipManagementPlanInstanceReportRecord
 */
public class CRCustomerRelationshipManagementPlanRetrieveInputModelCustomerRelationshipManagementPlanInstanceReportRecord   {
  private String customerRelationshipManagementPlanInstanceReportReference = null;

  private String customerRelationshipManagementPlanInstanceReportType = null;

  private String customerRelationshipManagementPlanInstanceReportParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance report 
   * @return customerRelationshipManagementPlanInstanceReportReference
  **/

  public String getCustomerRelationshipManagementPlanInstanceReportReference() {
    return customerRelationshipManagementPlanInstanceReportReference;
  }

  public void setCustomerRelationshipManagementPlanInstanceReportReference(String customerRelationshipManagementPlanInstanceReportReference) {
    this.customerRelationshipManagementPlanInstanceReportReference = customerRelationshipManagementPlanInstanceReportReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return customerRelationshipManagementPlanInstanceReportType
  **/

  public String getCustomerRelationshipManagementPlanInstanceReportType() {
    return customerRelationshipManagementPlanInstanceReportType;
  }

  public void setCustomerRelationshipManagementPlanInstanceReportType(String customerRelationshipManagementPlanInstanceReportType) {
    this.customerRelationshipManagementPlanInstanceReportType = customerRelationshipManagementPlanInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return customerRelationshipManagementPlanInstanceReportParameters
  **/

  public String getCustomerRelationshipManagementPlanInstanceReportParameters() {
    return customerRelationshipManagementPlanInstanceReportParameters;
  }

  public void setCustomerRelationshipManagementPlanInstanceReportParameters(String customerRelationshipManagementPlanInstanceReportParameters) {
    this.customerRelationshipManagementPlanInstanceReportParameters = customerRelationshipManagementPlanInstanceReportParameters;
  }


}


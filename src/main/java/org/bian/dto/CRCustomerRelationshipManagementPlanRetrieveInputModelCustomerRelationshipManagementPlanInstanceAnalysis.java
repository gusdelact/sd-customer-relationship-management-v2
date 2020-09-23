package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanRetrieveInputModelCustomerRelationshipManagementPlanInstanceAnalysis
 */
public class CRCustomerRelationshipManagementPlanRetrieveInputModelCustomerRelationshipManagementPlanInstanceAnalysis   {
  private String customerRelationshipManagementPlanInstanceAnalysisReference = null;

  private String customerRelationshipManagementPlanInstanceAnalysisReportType = null;

  private String customerRelationshipManagementPlanInstanceAnalysisParameters = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the control record instance analysis view 
   * @return customerRelationshipManagementPlanInstanceAnalysisReference
  **/

  public String getCustomerRelationshipManagementPlanInstanceAnalysisReference() {
    return customerRelationshipManagementPlanInstanceAnalysisReference;
  }

  public void setCustomerRelationshipManagementPlanInstanceAnalysisReference(String customerRelationshipManagementPlanInstanceAnalysisReference) {
    this.customerRelationshipManagementPlanInstanceAnalysisReference = customerRelationshipManagementPlanInstanceAnalysisReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return customerRelationshipManagementPlanInstanceAnalysisReportType
  **/

  public String getCustomerRelationshipManagementPlanInstanceAnalysisReportType() {
    return customerRelationshipManagementPlanInstanceAnalysisReportType;
  }

  public void setCustomerRelationshipManagementPlanInstanceAnalysisReportType(String customerRelationshipManagementPlanInstanceAnalysisReportType) {
    this.customerRelationshipManagementPlanInstanceAnalysisReportType = customerRelationshipManagementPlanInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return customerRelationshipManagementPlanInstanceAnalysisParameters
  **/

  public String getCustomerRelationshipManagementPlanInstanceAnalysisParameters() {
    return customerRelationshipManagementPlanInstanceAnalysisParameters;
  }

  public void setCustomerRelationshipManagementPlanInstanceAnalysisParameters(String customerRelationshipManagementPlanInstanceAnalysisParameters) {
    this.customerRelationshipManagementPlanInstanceAnalysisParameters = customerRelationshipManagementPlanInstanceAnalysisParameters;
  }


}


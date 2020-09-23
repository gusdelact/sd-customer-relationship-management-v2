package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceAnalysis
 */
public class CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceAnalysis   {
  private String customerRelationshipManagementPlanInstanceAnalysisData = null;

  private String customerRelationshipManagementPlanInstanceAnalysisReportType = null;

  private Object customerRelationshipManagementPlanInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return customerRelationshipManagementPlanInstanceAnalysisData
  **/

  public String getCustomerRelationshipManagementPlanInstanceAnalysisData() {
    return customerRelationshipManagementPlanInstanceAnalysisData;
  }

  public void setCustomerRelationshipManagementPlanInstanceAnalysisData(String customerRelationshipManagementPlanInstanceAnalysisData) {
    this.customerRelationshipManagementPlanInstanceAnalysisData = customerRelationshipManagementPlanInstanceAnalysisData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return customerRelationshipManagementPlanInstanceAnalysisReport
  **/

  public Object getCustomerRelationshipManagementPlanInstanceAnalysisReport() {
    return customerRelationshipManagementPlanInstanceAnalysisReport;
  }

  public void setCustomerRelationshipManagementPlanInstanceAnalysisReport(Object customerRelationshipManagementPlanInstanceAnalysisReport) {
    this.customerRelationshipManagementPlanInstanceAnalysisReport = customerRelationshipManagementPlanInstanceAnalysisReport;
  }


}


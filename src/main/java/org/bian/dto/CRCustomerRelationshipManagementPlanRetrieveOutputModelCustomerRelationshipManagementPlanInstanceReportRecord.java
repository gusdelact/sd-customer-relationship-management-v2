package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceReportRecord
 */
public class CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceReportRecord   {
  private String customerRelationshipManagementPlanInstanceReportData = null;

  private String customerRelationshipManagementPlanInstanceReportType = null;

  private Object customerRelationshipManagementPlanInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return customerRelationshipManagementPlanInstanceReportData
  **/

  public String getCustomerRelationshipManagementPlanInstanceReportData() {
    return customerRelationshipManagementPlanInstanceReportData;
  }

  public void setCustomerRelationshipManagementPlanInstanceReportData(String customerRelationshipManagementPlanInstanceReportData) {
    this.customerRelationshipManagementPlanInstanceReportData = customerRelationshipManagementPlanInstanceReportData;
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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return customerRelationshipManagementPlanInstanceReport
  **/

  public Object getCustomerRelationshipManagementPlanInstanceReport() {
    return customerRelationshipManagementPlanInstanceReport;
  }

  public void setCustomerRelationshipManagementPlanInstanceReport(Object customerRelationshipManagementPlanInstanceReport) {
    this.customerRelationshipManagementPlanInstanceReport = customerRelationshipManagementPlanInstanceReport;
  }


}


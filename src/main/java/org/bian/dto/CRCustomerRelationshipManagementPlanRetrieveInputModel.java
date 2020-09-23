package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerRelationshipManagementPlanRetrieveInputModelCustomerRelationshipManagementPlanInstanceAnalysis;
import org.bian.dto.CRCustomerRelationshipManagementPlanRetrieveInputModelCustomerRelationshipManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanRetrieveInputModel
 */
public class CRCustomerRelationshipManagementPlanRetrieveInputModel   {
  private Object customerRelationshipManagementPlanRetrieveActionTaskRecord = null;

  private String customerRelationshipManagementPlanRetrieveActionRequest = null;

  private CRCustomerRelationshipManagementPlanRetrieveInputModelCustomerRelationshipManagementPlanInstanceReportRecord customerRelationshipManagementPlanInstanceReportRecord = null;

  private CRCustomerRelationshipManagementPlanRetrieveInputModelCustomerRelationshipManagementPlanInstanceAnalysis customerRelationshipManagementPlanInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return customerRelationshipManagementPlanRetrieveActionTaskRecord
  **/

  public Object getCustomerRelationshipManagementPlanRetrieveActionTaskRecord() {
    return customerRelationshipManagementPlanRetrieveActionTaskRecord;
  }

  public void setCustomerRelationshipManagementPlanRetrieveActionTaskRecord(Object customerRelationshipManagementPlanRetrieveActionTaskRecord) {
    this.customerRelationshipManagementPlanRetrieveActionTaskRecord = customerRelationshipManagementPlanRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return customerRelationshipManagementPlanRetrieveActionRequest
  **/

  public String getCustomerRelationshipManagementPlanRetrieveActionRequest() {
    return customerRelationshipManagementPlanRetrieveActionRequest;
  }

  public void setCustomerRelationshipManagementPlanRetrieveActionRequest(String customerRelationshipManagementPlanRetrieveActionRequest) {
    this.customerRelationshipManagementPlanRetrieveActionRequest = customerRelationshipManagementPlanRetrieveActionRequest;
  }


  /**
   * Get customerRelationshipManagementPlanInstanceReportRecord
   * @return customerRelationshipManagementPlanInstanceReportRecord
  **/

  public CRCustomerRelationshipManagementPlanRetrieveInputModelCustomerRelationshipManagementPlanInstanceReportRecord getCustomerRelationshipManagementPlanInstanceReportRecord() {
    return customerRelationshipManagementPlanInstanceReportRecord;
  }

  public void setCustomerRelationshipManagementPlanInstanceReportRecord(CRCustomerRelationshipManagementPlanRetrieveInputModelCustomerRelationshipManagementPlanInstanceReportRecord customerRelationshipManagementPlanInstanceReportRecord) {
    this.customerRelationshipManagementPlanInstanceReportRecord = customerRelationshipManagementPlanInstanceReportRecord;
  }


  /**
   * Get customerRelationshipManagementPlanInstanceAnalysis
   * @return customerRelationshipManagementPlanInstanceAnalysis
  **/

  public CRCustomerRelationshipManagementPlanRetrieveInputModelCustomerRelationshipManagementPlanInstanceAnalysis getCustomerRelationshipManagementPlanInstanceAnalysis() {
    return customerRelationshipManagementPlanInstanceAnalysis;
  }

  public void setCustomerRelationshipManagementPlanInstanceAnalysis(CRCustomerRelationshipManagementPlanRetrieveInputModelCustomerRelationshipManagementPlanInstanceAnalysis customerRelationshipManagementPlanInstanceAnalysis) {
    this.customerRelationshipManagementPlanInstanceAnalysis = customerRelationshipManagementPlanInstanceAnalysis;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceAnalysis;
import org.bian.dto.CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceRecord;
import org.bian.dto.CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceReportRecord;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanRetrieveOutputModel
 */
public class CRCustomerRelationshipManagementPlanRetrieveOutputModel   {
  private CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord = null;

  private String customerRelationshipManagementPlanRetrieveActionTaskReference = null;

  private Object customerRelationshipManagementPlanRetrieveActionTaskRecord = null;

  private String customerRelationshipManagementPlanRetrieveActionResponse = null;

  private CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceReportRecord customerRelationshipManagementPlanInstanceReportRecord = null;

  private CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceAnalysis customerRelationshipManagementPlanInstanceAnalysis = null;


  /**
   * Get customerRelationshipManagementPlanInstanceRecord
   * @return customerRelationshipManagementPlanInstanceRecord
  **/

  public CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceRecord getCustomerRelationshipManagementPlanInstanceRecord() {
    return customerRelationshipManagementPlanInstanceRecord;
  }

  public void setCustomerRelationshipManagementPlanInstanceRecord(CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord) {
    this.customerRelationshipManagementPlanInstanceRecord = customerRelationshipManagementPlanInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Customer Relationship Management Plan instance retrieve service call 
   * @return customerRelationshipManagementPlanRetrieveActionTaskReference
  **/

  public String getCustomerRelationshipManagementPlanRetrieveActionTaskReference() {
    return customerRelationshipManagementPlanRetrieveActionTaskReference;
  }

  public void setCustomerRelationshipManagementPlanRetrieveActionTaskReference(String customerRelationshipManagementPlanRetrieveActionTaskReference) {
    this.customerRelationshipManagementPlanRetrieveActionTaskReference = customerRelationshipManagementPlanRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return customerRelationshipManagementPlanRetrieveActionResponse
  **/

  public String getCustomerRelationshipManagementPlanRetrieveActionResponse() {
    return customerRelationshipManagementPlanRetrieveActionResponse;
  }

  public void setCustomerRelationshipManagementPlanRetrieveActionResponse(String customerRelationshipManagementPlanRetrieveActionResponse) {
    this.customerRelationshipManagementPlanRetrieveActionResponse = customerRelationshipManagementPlanRetrieveActionResponse;
  }


  /**
   * Get customerRelationshipManagementPlanInstanceReportRecord
   * @return customerRelationshipManagementPlanInstanceReportRecord
  **/

  public CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceReportRecord getCustomerRelationshipManagementPlanInstanceReportRecord() {
    return customerRelationshipManagementPlanInstanceReportRecord;
  }

  public void setCustomerRelationshipManagementPlanInstanceReportRecord(CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceReportRecord customerRelationshipManagementPlanInstanceReportRecord) {
    this.customerRelationshipManagementPlanInstanceReportRecord = customerRelationshipManagementPlanInstanceReportRecord;
  }


  /**
   * Get customerRelationshipManagementPlanInstanceAnalysis
   * @return customerRelationshipManagementPlanInstanceAnalysis
  **/

  public CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceAnalysis getCustomerRelationshipManagementPlanInstanceAnalysis() {
    return customerRelationshipManagementPlanInstanceAnalysis;
  }

  public void setCustomerRelationshipManagementPlanInstanceAnalysis(CRCustomerRelationshipManagementPlanRetrieveOutputModelCustomerRelationshipManagementPlanInstanceAnalysis customerRelationshipManagementPlanInstanceAnalysis) {
    this.customerRelationshipManagementPlanInstanceAnalysis = customerRelationshipManagementPlanInstanceAnalysis;
  }


}


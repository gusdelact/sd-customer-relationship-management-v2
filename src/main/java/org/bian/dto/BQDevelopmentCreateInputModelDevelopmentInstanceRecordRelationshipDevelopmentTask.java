package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDevelopmentCreateInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask
 */
public class BQDevelopmentCreateInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask   {
  private String customerDevelopmentTaskType = null;

  private String customerDevelopmentTaskDescription = null;

  private String customerRelationshipDevelopmentPlan = null;

  private String employeeBusinessUnitReference = null;

  private String customerDevelopmentWorkProduct = null;

  private String customerDevelopmentTaskResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of relationship development activity (e.g. sales, product explanation, financial advice) 
   * @return customerDevelopmentTaskType
  **/

  public String getCustomerDevelopmentTaskType() {
    return customerDevelopmentTaskType;
  }

  public void setCustomerDevelopmentTaskType(String customerDevelopmentTaskType) {
    this.customerDevelopmentTaskType = customerDevelopmentTaskType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A description of the task, including any intelligence gathered and follow up actions agreed 
   * @return customerDevelopmentTaskDescription
  **/

  public String getCustomerDevelopmentTaskDescription() {
    return customerDevelopmentTaskDescription;
  }

  public void setCustomerDevelopmentTaskDescription(String customerDevelopmentTaskDescription) {
    this.customerDevelopmentTaskDescription = customerDevelopmentTaskDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A plan outlining longer term relationship goals and performance/profitability both target and actual 
   * @return customerRelationshipDevelopmentPlan
  **/

  public String getCustomerRelationshipDevelopmentPlan() {
    return customerRelationshipDevelopmentPlan;
  }

  public void setCustomerRelationshipDevelopmentPlan(String customerRelationshipDevelopmentPlan) {
    this.customerRelationshipDevelopmentPlan = customerRelationshipDevelopmentPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to relationship managers and product specialists linked to the plan 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Work documentation, forms and schedules produced and referenced during the task 
   * @return customerDevelopmentWorkProduct
  **/

  public String getCustomerDevelopmentWorkProduct() {
    return customerDevelopmentWorkProduct;
  }

  public void setCustomerDevelopmentWorkProduct(String customerDevelopmentWorkProduct) {
    this.customerDevelopmentWorkProduct = customerDevelopmentWorkProduct;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The outcomes of customer development activity 
   * @return customerDevelopmentTaskResult
  **/

  public String getCustomerDevelopmentTaskResult() {
    return customerDevelopmentTaskResult;
  }

  public void setCustomerDevelopmentTaskResult(String customerDevelopmentTaskResult) {
    this.customerDevelopmentTaskResult = customerDevelopmentTaskResult;
  }


}


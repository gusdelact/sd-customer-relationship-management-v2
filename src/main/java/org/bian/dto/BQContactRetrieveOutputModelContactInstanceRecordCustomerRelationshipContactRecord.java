package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQContactRetrieveOutputModelContactInstanceRecordCustomerRelationshipContactRecord
 */
public class BQContactRetrieveOutputModelContactInstanceRecordCustomerRelationshipContactRecord   {
  private String customerRelationshipContactDate = null;

  private String employeeReference = null;

  private String customerRelationshipContactType = null;

  private String customerRelationshipContactResult = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime  general-info: The date time and location of the contact 
   * @return customerRelationshipContactDate
  **/

  public String getCustomerRelationshipContactDate() {
    return customerRelationshipContactDate;
  }

  public void setCustomerRelationshipContactDate(String customerRelationshipContactDate) {
    this.customerRelationshipContactDate = customerRelationshipContactDate;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the employee(s) in attendance 
   * @return employeeReference
  **/

  public String getEmployeeReference() {
    return employeeReference;
  }

  public void setEmployeeReference(String employeeReference) {
    this.employeeReference = employeeReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The reason and or purpose for the contact (e.g. review, issue, product sales, advice, customer enquiry) 
   * @return customerRelationshipContactType
  **/

  public String getCustomerRelationshipContactType() {
    return customerRelationshipContactType;
  }

  public void setCustomerRelationshipContactType(String customerRelationshipContactType) {
    this.customerRelationshipContactType = customerRelationshipContactType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The result of the contact, including follow up tasks 
   * @return customerRelationshipContactResult
  **/

  public String getCustomerRelationshipContactResult() {
    return customerRelationshipContactResult;
  }

  public void setCustomerRelationshipContactResult(String customerRelationshipContactResult) {
    this.customerRelationshipContactResult = customerRelationshipContactResult;
  }


}


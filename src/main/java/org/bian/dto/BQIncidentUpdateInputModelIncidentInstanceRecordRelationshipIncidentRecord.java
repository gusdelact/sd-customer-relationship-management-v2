package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIncidentUpdateInputModelIncidentInstanceRecordRelationshipIncidentRecord
 */
public class BQIncidentUpdateInputModelIncidentInstanceRecordRelationshipIncidentRecord   {
  private String employeeBusinessUnitReference = null;

  private String productServiceActivityReference = null;

  private String customerIncidentType = null;

  private String customerIncidentDescription = null;

  private String customerIncidentResolution = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to involved employees in the original incident or the resolution as appropriate 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Production activity and transaction records relating to the incident 
   * @return productServiceActivityReference
  **/

  public String getProductServiceActivityReference() {
    return productServiceActivityReference;
  }

  public void setProductServiceActivityReference(String productServiceActivityReference) {
    this.productServiceActivityReference = productServiceActivityReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The type of incident (e.g. product error, servicing issue) 
   * @return customerIncidentType
  **/

  public String getCustomerIncidentType() {
    return customerIncidentType;
  }

  public void setCustomerIncidentType(String customerIncidentType) {
    this.customerIncidentType = customerIncidentType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the incident in whatever form appropriate 
   * @return customerIncidentDescription
  **/

  public String getCustomerIncidentDescription() {
    return customerIncidentDescription;
  }

  public void setCustomerIncidentDescription(String customerIncidentDescription) {
    this.customerIncidentDescription = customerIncidentDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Narrative of the resolution actions made or committed 
   * @return customerIncidentResolution
  **/

  public String getCustomerIncidentResolution() {
    return customerIncidentResolution;
  }

  public void setCustomerIncidentResolution(String customerIncidentResolution) {
    this.customerIncidentResolution = customerIncidentResolution;
  }


}


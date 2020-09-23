package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDevelopmentRetrieveOutputModelCustomerRelationshipManagementPlanInstanceRecord
 */
public class BQDevelopmentRetrieveOutputModelCustomerRelationshipManagementPlanInstanceRecord   {
  private String customerReference = null;

  private String employeeBusinessUnitReference = null;

  private String customerRelationshipRatingType = null;

  private String customerRelationshipRating = null;

  private String customerInsightType = null;

  private String customerInsightDescription = null;

  private String customerBudget = null;

  private String customerProductCoverage = null;

  private String customerProductUsage = null;

  private String customerProductEligibilityProfile = null;

  private String customerSalesPlan = null;

  private String customerProfitability = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to the associated customer (can currently be a person or a company) 
   * @return customerReference
  **/

  public String getCustomerReference() {
    return customerReference;
  }

  public void setCustomerReference(String customerReference) {
    this.customerReference = customerReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: The assigned individual or business unit for the relationship 
   * @return employeeBusinessUnitReference
  **/

  public String getEmployeeBusinessUnitReference() {
    return employeeBusinessUnitReference;
  }

  public void setEmployeeBusinessUnitReference(String employeeBusinessUnitReference) {
    this.employeeBusinessUnitReference = employeeBusinessUnitReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A type of rating referenced and perhaps maintained by the relationship manager (e.g. credit, financial, collateral) 
   * @return customerRelationshipRatingType
  **/

  public String getCustomerRelationshipRatingType() {
    return customerRelationshipRatingType;
  }

  public void setCustomerRelationshipRatingType(String customerRelationshipRatingType) {
    this.customerRelationshipRatingType = customerRelationshipRatingType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The rating value (and explanation) 
   * @return customerRelationshipRating
  **/

  public String getCustomerRelationshipRating() {
    return customerRelationshipRating;
  }

  public void setCustomerRelationshipRating(String customerRelationshipRating) {
    this.customerRelationshipRating = customerRelationshipRating;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A type of insight referenced and perhaps maintained by the relationship manager (e.g. retention candidate, sales propensity, life events) 
   * @return customerInsightType
  **/

  public String getCustomerInsightType() {
    return customerInsightType;
  }

  public void setCustomerInsightType(String customerInsightType) {
    this.customerInsightType = customerInsightType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Description of the insight 
   * @return customerInsightDescription
  **/

  public String getCustomerInsightDescription() {
    return customerInsightDescription;
  }

  public void setCustomerInsightDescription(String customerInsightDescription) {
    this.customerInsightDescription = customerInsightDescription;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The target and actual budget covering income and allowed expenses/discounts 
   * @return customerBudget
  **/

  public String getCustomerBudget() {
    return customerBudget;
  }

  public void setCustomerBudget(String customerBudget) {
    this.customerBudget = customerBudget;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Covers current and near term target product/service coverage as per the judgment of the Relationship Manager 
   * @return customerProductCoverage
  **/

  public String getCustomerProductCoverage() {
    return customerProductCoverage;
  }

  public void setCustomerProductCoverage(String customerProductCoverage) {
    this.customerProductCoverage = customerProductCoverage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Extracted analysis from production activity used to detect trends and key events (product activity/turnover summaries) 
   * @return customerProductUsage
  **/

  public String getCustomerProductUsage() {
    return customerProductUsage;
  }

  public void setCustomerProductUsage(String customerProductUsage) {
    this.customerProductUsage = customerProductUsage;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Obtained from the appropriate Service Domain, this provides an automated/rules based analysis of unsold/eligible products and associated terms that can be refined by the manager 
   * @return customerProductEligibilityProfile
  **/

  public String getCustomerProductEligibilityProfile() {
    return customerProductEligibilityProfile;
  }

  public void setCustomerProductEligibilityProfile(String customerProductEligibilityProfile) {
    this.customerProductEligibilityProfile = customerProductEligibilityProfile;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The sales plan details specific actions taken and planned to address sales opportunities (i.e. target product sales and associated contact schedule) 
   * @return customerSalesPlan
  **/

  public String getCustomerSalesPlan() {
    return customerSalesPlan;
  }

  public void setCustomerSalesPlan(String customerSalesPlan) {
    this.customerSalesPlan = customerSalesPlan;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: A maintained perspective of the profitability of the relationship to date and projected 
   * @return customerProfitability
  **/

  public String getCustomerProfitability() {
    return customerProfitability;
  }

  public void setCustomerProfitability(String customerProfitability) {
    this.customerProfitability = customerProfitability;
  }


}


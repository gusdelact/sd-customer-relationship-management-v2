package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CRCustomerRelationshipManagementPlanCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord
 */
public class CRCustomerRelationshipManagementPlanCreateOutputModelCustomerRelationshipManagementPlanInstanceRecord   {
  private String customerInsightDescription = null;

  private String customerBudget = null;

  private String customerSalesPlan = null;

  private String customerProfitability = null;


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


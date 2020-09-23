package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQDevelopmentExchangeOutputModel
 */
public class BQDevelopmentExchangeOutputModel   {
  private String developmentExchangeActionTaskReference = null;

  private Object developmentExchangeActionTaskRecord = null;

  private String developmentExchangeActionResponse = null;

  private String developmentInstanceStatus = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Development instance exchange service call 
   * @return developmentExchangeActionTaskReference
  **/

  public String getDevelopmentExchangeActionTaskReference() {
    return developmentExchangeActionTaskReference;
  }

  public void setDevelopmentExchangeActionTaskReference(String developmentExchangeActionTaskReference) {
    this.developmentExchangeActionTaskReference = developmentExchangeActionTaskReference;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The exchange service call consolidated processing record 
   * @return developmentExchangeActionTaskRecord
  **/

  public Object getDevelopmentExchangeActionTaskRecord() {
    return developmentExchangeActionTaskRecord;
  }

  public void setDevelopmentExchangeActionTaskRecord(Object developmentExchangeActionTaskRecord) {
    this.developmentExchangeActionTaskRecord = developmentExchangeActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the exchange action service response 
   * @return developmentExchangeActionResponse
  **/

  public String getDevelopmentExchangeActionResponse() {
    return developmentExchangeActionResponse;
  }

  public void setDevelopmentExchangeActionResponse(String developmentExchangeActionResponse) {
    this.developmentExchangeActionResponse = developmentExchangeActionResponse;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The status of the Development instance (e.g. accepted, rejected, verified) 
   * @return developmentInstanceStatus
  **/

  public String getDevelopmentInstanceStatus() {
    return developmentInstanceStatus;
  }

  public void setDevelopmentInstanceStatus(String developmentInstanceStatus) {
    this.developmentInstanceStatus = developmentInstanceStatus;
  }


}


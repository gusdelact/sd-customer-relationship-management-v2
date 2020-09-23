package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIncidentRetrieveOutputModelIncidentInstanceReport
 */
public class BQIncidentRetrieveOutputModelIncidentInstanceReport   {
  private Object incidentInstanceReportRecord = null;

  private String incidentInstanceReportType = null;

  private String incidentInstanceReportParameters = null;

  private Object incidentInstanceReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The input information used to assemble the report that can be on-going, periodic and actual and projected 
   * @return incidentInstanceReportRecord
  **/

  public Object getIncidentInstanceReportRecord() {
    return incidentInstanceReportRecord;
  }

  public void setIncidentInstanceReportRecord(Object incidentInstanceReportRecord) {
    this.incidentInstanceReportRecord = incidentInstanceReportRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external report available 
   * @return incidentInstanceReportType
  **/

  public String getIncidentInstanceReportType() {
    return incidentInstanceReportType;
  }

  public void setIncidentInstanceReportType(String incidentInstanceReportType) {
    this.incidentInstanceReportType = incidentInstanceReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the report (e.g. period, content type) 
   * @return incidentInstanceReportParameters
  **/

  public String getIncidentInstanceReportParameters() {
    return incidentInstanceReportParameters;
  }

  public void setIncidentInstanceReportParameters(String incidentInstanceReportParameters) {
    this.incidentInstanceReportParameters = incidentInstanceReportParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external report in any suitable form including selection filters where appropriate 
   * @return incidentInstanceReport
  **/

  public Object getIncidentInstanceReport() {
    return incidentInstanceReport;
  }

  public void setIncidentInstanceReport(Object incidentInstanceReport) {
    this.incidentInstanceReport = incidentInstanceReport;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * BQIncidentRetrieveOutputModelIncidentInstanceAnalysis
 */
public class BQIncidentRetrieveOutputModelIncidentInstanceAnalysis   {
  private Object incidentInstanceAnalysisRecord = null;

  private String incidentInstanceAnalysisReportType = null;

  private String incidentInstanceAnalysisParameters = null;

  private Object incidentInstanceAnalysisReport = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The inputs and results of the instance analysis that can be on-going, periodic and actual and projected 
   * @return incidentInstanceAnalysisRecord
  **/

  public Object getIncidentInstanceAnalysisRecord() {
    return incidentInstanceAnalysisRecord;
  }

  public void setIncidentInstanceAnalysisRecord(Object incidentInstanceAnalysisRecord) {
    this.incidentInstanceAnalysisRecord = incidentInstanceAnalysisRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Code  general-info: The type of external performance analysis report available 
   * @return incidentInstanceAnalysisReportType
  **/

  public String getIncidentInstanceAnalysisReportType() {
    return incidentInstanceAnalysisReportType;
  }

  public void setIncidentInstanceAnalysisReportType(String incidentInstanceAnalysisReportType) {
    this.incidentInstanceAnalysisReportType = incidentInstanceAnalysisReportType;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: The selection parameters for the analysis (e.g. period, algorithm type) 
   * @return incidentInstanceAnalysisParameters
  **/

  public String getIncidentInstanceAnalysisParameters() {
    return incidentInstanceAnalysisParameters;
  }

  public void setIncidentInstanceAnalysisParameters(String incidentInstanceAnalysisParameters) {
    this.incidentInstanceAnalysisParameters = incidentInstanceAnalysisParameters;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The external analysis report in any suitable form including selection filters where appropriate 
   * @return incidentInstanceAnalysisReport
  **/

  public Object getIncidentInstanceAnalysisReport() {
    return incidentInstanceAnalysisReport;
  }

  public void setIncidentInstanceAnalysisReport(Object incidentInstanceAnalysisReport) {
    this.incidentInstanceAnalysisReport = incidentInstanceAnalysisReport;
  }


}


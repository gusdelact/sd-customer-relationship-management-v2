package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIncidentRetrieveInputModelIncidentInstanceAnalysis;
import org.bian.dto.BQIncidentRetrieveInputModelIncidentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQIncidentRetrieveInputModel
 */
public class BQIncidentRetrieveInputModel   {
  private Object incidentRetrieveActionTaskRecord = null;

  private String incidentRetrieveActionRequest = null;

  private BQIncidentRetrieveInputModelIncidentInstanceReport incidentInstanceReport = null;

  private BQIncidentRetrieveInputModelIncidentInstanceAnalysis incidentInstanceAnalysis = null;


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary  general-info: The retrieve service call consolidated processing record 
   * @return incidentRetrieveActionTaskRecord
  **/

  public Object getIncidentRetrieveActionTaskRecord() {
    return incidentRetrieveActionTaskRecord;
  }

  public void setIncidentRetrieveActionTaskRecord(Object incidentRetrieveActionTaskRecord) {
    this.incidentRetrieveActionTaskRecord = incidentRetrieveActionTaskRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service request (lists requested reports) 
   * @return incidentRetrieveActionRequest
  **/

  public String getIncidentRetrieveActionRequest() {
    return incidentRetrieveActionRequest;
  }

  public void setIncidentRetrieveActionRequest(String incidentRetrieveActionRequest) {
    this.incidentRetrieveActionRequest = incidentRetrieveActionRequest;
  }


  /**
   * Get incidentInstanceReport
   * @return incidentInstanceReport
  **/

  public BQIncidentRetrieveInputModelIncidentInstanceReport getIncidentInstanceReport() {
    return incidentInstanceReport;
  }

  public void setIncidentInstanceReport(BQIncidentRetrieveInputModelIncidentInstanceReport incidentInstanceReport) {
    this.incidentInstanceReport = incidentInstanceReport;
  }


  /**
   * Get incidentInstanceAnalysis
   * @return incidentInstanceAnalysis
  **/

  public BQIncidentRetrieveInputModelIncidentInstanceAnalysis getIncidentInstanceAnalysis() {
    return incidentInstanceAnalysis;
  }

  public void setIncidentInstanceAnalysis(BQIncidentRetrieveInputModelIncidentInstanceAnalysis incidentInstanceAnalysis) {
    this.incidentInstanceAnalysis = incidentInstanceAnalysis;
  }


}


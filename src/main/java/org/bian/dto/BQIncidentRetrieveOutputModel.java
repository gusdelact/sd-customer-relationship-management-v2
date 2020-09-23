package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIncidentRetrieveOutputModelCustomerRelationshipManagementPlanInstanceRecord;
import org.bian.dto.BQIncidentRetrieveOutputModelIncidentInstanceAnalysis;
import org.bian.dto.BQIncidentRetrieveOutputModelIncidentInstanceRecord;
import org.bian.dto.BQIncidentRetrieveOutputModelIncidentInstanceReport;

import javax.validation.Valid;
  
/**
 * BQIncidentRetrieveOutputModel
 */
public class BQIncidentRetrieveOutputModel   {
  private BQIncidentRetrieveOutputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord = null;

  private BQIncidentRetrieveOutputModelIncidentInstanceRecord incidentInstanceRecord = null;

  private String incidentRetrieveActionTaskReference = null;

  private Object incidentRetrieveActionTaskRecord = null;

  private String incidentRetrieveActionResponse = null;

  private BQIncidentRetrieveOutputModelIncidentInstanceReport incidentInstanceReport = null;

  private BQIncidentRetrieveOutputModelIncidentInstanceAnalysis incidentInstanceAnalysis = null;


  /**
   * Get customerRelationshipManagementPlanInstanceRecord
   * @return customerRelationshipManagementPlanInstanceRecord
  **/

  public BQIncidentRetrieveOutputModelCustomerRelationshipManagementPlanInstanceRecord getCustomerRelationshipManagementPlanInstanceRecord() {
    return customerRelationshipManagementPlanInstanceRecord;
  }

  public void setCustomerRelationshipManagementPlanInstanceRecord(BQIncidentRetrieveOutputModelCustomerRelationshipManagementPlanInstanceRecord customerRelationshipManagementPlanInstanceRecord) {
    this.customerRelationshipManagementPlanInstanceRecord = customerRelationshipManagementPlanInstanceRecord;
  }


  /**
   * Get incidentInstanceRecord
   * @return incidentInstanceRecord
  **/

  public BQIncidentRetrieveOutputModelIncidentInstanceRecord getIncidentInstanceRecord() {
    return incidentInstanceRecord;
  }

  public void setIncidentInstanceRecord(BQIncidentRetrieveOutputModelIncidentInstanceRecord incidentInstanceRecord) {
    this.incidentInstanceRecord = incidentInstanceRecord;
  }


  /**
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier  general-info: Reference to a Incident instance retrieve service call 
   * @return incidentRetrieveActionTaskReference
  **/

  public String getIncidentRetrieveActionTaskReference() {
    return incidentRetrieveActionTaskReference;
  }

  public void setIncidentRetrieveActionTaskReference(String incidentRetrieveActionTaskReference) {
    this.incidentRetrieveActionTaskReference = incidentRetrieveActionTaskReference;
  }


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
   * `status: Not Mapped`  core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text  general-info: Details of the retrieve action service response (lists returned reports) 
   * @return incidentRetrieveActionResponse
  **/

  public String getIncidentRetrieveActionResponse() {
    return incidentRetrieveActionResponse;
  }

  public void setIncidentRetrieveActionResponse(String incidentRetrieveActionResponse) {
    this.incidentRetrieveActionResponse = incidentRetrieveActionResponse;
  }


  /**
   * Get incidentInstanceReport
   * @return incidentInstanceReport
  **/

  public BQIncidentRetrieveOutputModelIncidentInstanceReport getIncidentInstanceReport() {
    return incidentInstanceReport;
  }

  public void setIncidentInstanceReport(BQIncidentRetrieveOutputModelIncidentInstanceReport incidentInstanceReport) {
    this.incidentInstanceReport = incidentInstanceReport;
  }


  /**
   * Get incidentInstanceAnalysis
   * @return incidentInstanceAnalysis
  **/

  public BQIncidentRetrieveOutputModelIncidentInstanceAnalysis getIncidentInstanceAnalysis() {
    return incidentInstanceAnalysis;
  }

  public void setIncidentInstanceAnalysis(BQIncidentRetrieveOutputModelIncidentInstanceAnalysis incidentInstanceAnalysis) {
    this.incidentInstanceAnalysis = incidentInstanceAnalysis;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIncidentCaptureOutputModelIncidentInstanceRecordRelationshipIncidentRecord;

import javax.validation.Valid;
  
/**
 * BQIncidentCaptureOutputModelIncidentInstanceRecord
 */
public class BQIncidentCaptureOutputModelIncidentInstanceRecord   {
  private BQIncidentCaptureOutputModelIncidentInstanceRecordRelationshipIncidentRecord relationshipIncidentRecord = null;


  /**
   * Get relationshipIncidentRecord
   * @return relationshipIncidentRecord
  **/

  public BQIncidentCaptureOutputModelIncidentInstanceRecordRelationshipIncidentRecord getRelationshipIncidentRecord() {
    return relationshipIncidentRecord;
  }

  public void setRelationshipIncidentRecord(BQIncidentCaptureOutputModelIncidentInstanceRecordRelationshipIncidentRecord relationshipIncidentRecord) {
    this.relationshipIncidentRecord = relationshipIncidentRecord;
  }


}


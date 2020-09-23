package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIncidentCaptureInputModelIncidentInstanceRecordRelationshipIncidentRecord;

import javax.validation.Valid;
  
/**
 * BQIncidentCaptureInputModelIncidentInstanceRecord
 */
public class BQIncidentCaptureInputModelIncidentInstanceRecord   {
  private BQIncidentCaptureInputModelIncidentInstanceRecordRelationshipIncidentRecord relationshipIncidentRecord = null;


  /**
   * Get relationshipIncidentRecord
   * @return relationshipIncidentRecord
  **/

  public BQIncidentCaptureInputModelIncidentInstanceRecordRelationshipIncidentRecord getRelationshipIncidentRecord() {
    return relationshipIncidentRecord;
  }

  public void setRelationshipIncidentRecord(BQIncidentCaptureInputModelIncidentInstanceRecordRelationshipIncidentRecord relationshipIncidentRecord) {
    this.relationshipIncidentRecord = relationshipIncidentRecord;
  }


}


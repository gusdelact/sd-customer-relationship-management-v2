package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIncidentCreateInputModelIncidentInstanceRecordRelationshipIncidentRecord;

import javax.validation.Valid;
  
/**
 * BQIncidentCreateInputModelIncidentInstanceRecord
 */
public class BQIncidentCreateInputModelIncidentInstanceRecord   {
  private BQIncidentCreateInputModelIncidentInstanceRecordRelationshipIncidentRecord relationshipIncidentRecord = null;


  /**
   * Get relationshipIncidentRecord
   * @return relationshipIncidentRecord
  **/

  public BQIncidentCreateInputModelIncidentInstanceRecordRelationshipIncidentRecord getRelationshipIncidentRecord() {
    return relationshipIncidentRecord;
  }

  public void setRelationshipIncidentRecord(BQIncidentCreateInputModelIncidentInstanceRecordRelationshipIncidentRecord relationshipIncidentRecord) {
    this.relationshipIncidentRecord = relationshipIncidentRecord;
  }


}


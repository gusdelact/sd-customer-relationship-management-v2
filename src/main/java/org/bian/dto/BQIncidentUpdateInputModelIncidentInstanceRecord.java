package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIncidentUpdateInputModelIncidentInstanceRecordRelationshipIncidentRecord;

import javax.validation.Valid;
  
/**
 * BQIncidentUpdateInputModelIncidentInstanceRecord
 */
public class BQIncidentUpdateInputModelIncidentInstanceRecord   {
  private BQIncidentUpdateInputModelIncidentInstanceRecordRelationshipIncidentRecord relationshipIncidentRecord = null;


  /**
   * Get relationshipIncidentRecord
   * @return relationshipIncidentRecord
  **/

  public BQIncidentUpdateInputModelIncidentInstanceRecordRelationshipIncidentRecord getRelationshipIncidentRecord() {
    return relationshipIncidentRecord;
  }

  public void setRelationshipIncidentRecord(BQIncidentUpdateInputModelIncidentInstanceRecordRelationshipIncidentRecord relationshipIncidentRecord) {
    this.relationshipIncidentRecord = relationshipIncidentRecord;
  }


}


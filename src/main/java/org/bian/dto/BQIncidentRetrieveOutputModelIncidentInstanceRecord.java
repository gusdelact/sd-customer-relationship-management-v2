package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQIncidentRetrieveOutputModelIncidentInstanceRecordRelationshipIncidentRecord;

import javax.validation.Valid;
  
/**
 * BQIncidentRetrieveOutputModelIncidentInstanceRecord
 */
public class BQIncidentRetrieveOutputModelIncidentInstanceRecord   {
  private BQIncidentRetrieveOutputModelIncidentInstanceRecordRelationshipIncidentRecord relationshipIncidentRecord = null;


  /**
   * Get relationshipIncidentRecord
   * @return relationshipIncidentRecord
  **/

  public BQIncidentRetrieveOutputModelIncidentInstanceRecordRelationshipIncidentRecord getRelationshipIncidentRecord() {
    return relationshipIncidentRecord;
  }

  public void setRelationshipIncidentRecord(BQIncidentRetrieveOutputModelIncidentInstanceRecordRelationshipIncidentRecord relationshipIncidentRecord) {
    this.relationshipIncidentRecord = relationshipIncidentRecord;
  }


}


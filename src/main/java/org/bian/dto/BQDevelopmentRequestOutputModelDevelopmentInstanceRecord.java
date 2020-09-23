package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentRequestOutputModelDevelopmentInstanceRecordRelationshipDevelopmentTask;

import javax.validation.Valid;
  
/**
 * BQDevelopmentRequestOutputModelDevelopmentInstanceRecord
 */
public class BQDevelopmentRequestOutputModelDevelopmentInstanceRecord   {
  private BQDevelopmentRequestOutputModelDevelopmentInstanceRecordRelationshipDevelopmentTask relationshipDevelopmentTask = null;


  /**
   * Get relationshipDevelopmentTask
   * @return relationshipDevelopmentTask
  **/

  public BQDevelopmentRequestOutputModelDevelopmentInstanceRecordRelationshipDevelopmentTask getRelationshipDevelopmentTask() {
    return relationshipDevelopmentTask;
  }

  public void setRelationshipDevelopmentTask(BQDevelopmentRequestOutputModelDevelopmentInstanceRecordRelationshipDevelopmentTask relationshipDevelopmentTask) {
    this.relationshipDevelopmentTask = relationshipDevelopmentTask;
  }


}


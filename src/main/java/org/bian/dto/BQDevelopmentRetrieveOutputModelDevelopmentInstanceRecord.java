package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentRetrieveOutputModelDevelopmentInstanceRecordRelationshipDevelopmentTask;

import javax.validation.Valid;
  
/**
 * BQDevelopmentRetrieveOutputModelDevelopmentInstanceRecord
 */
public class BQDevelopmentRetrieveOutputModelDevelopmentInstanceRecord   {
  private BQDevelopmentRetrieveOutputModelDevelopmentInstanceRecordRelationshipDevelopmentTask relationshipDevelopmentTask = null;


  /**
   * Get relationshipDevelopmentTask
   * @return relationshipDevelopmentTask
  **/

  public BQDevelopmentRetrieveOutputModelDevelopmentInstanceRecordRelationshipDevelopmentTask getRelationshipDevelopmentTask() {
    return relationshipDevelopmentTask;
  }

  public void setRelationshipDevelopmentTask(BQDevelopmentRetrieveOutputModelDevelopmentInstanceRecordRelationshipDevelopmentTask relationshipDevelopmentTask) {
    this.relationshipDevelopmentTask = relationshipDevelopmentTask;
  }


}


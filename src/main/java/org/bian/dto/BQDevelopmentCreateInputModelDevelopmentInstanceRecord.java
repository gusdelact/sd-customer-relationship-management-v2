package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentCreateInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask;

import javax.validation.Valid;
  
/**
 * BQDevelopmentCreateInputModelDevelopmentInstanceRecord
 */
public class BQDevelopmentCreateInputModelDevelopmentInstanceRecord   {
  private BQDevelopmentCreateInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask relationshipDevelopmentTask = null;


  /**
   * Get relationshipDevelopmentTask
   * @return relationshipDevelopmentTask
  **/

  public BQDevelopmentCreateInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask getRelationshipDevelopmentTask() {
    return relationshipDevelopmentTask;
  }

  public void setRelationshipDevelopmentTask(BQDevelopmentCreateInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask relationshipDevelopmentTask) {
    this.relationshipDevelopmentTask = relationshipDevelopmentTask;
  }


}


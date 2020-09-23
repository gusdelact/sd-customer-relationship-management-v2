package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentUpdateInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask;

import javax.validation.Valid;
  
/**
 * BQDevelopmentUpdateInputModelDevelopmentInstanceRecord
 */
public class BQDevelopmentUpdateInputModelDevelopmentInstanceRecord   {
  private BQDevelopmentUpdateInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask relationshipDevelopmentTask = null;


  /**
   * Get relationshipDevelopmentTask
   * @return relationshipDevelopmentTask
  **/

  public BQDevelopmentUpdateInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask getRelationshipDevelopmentTask() {
    return relationshipDevelopmentTask;
  }

  public void setRelationshipDevelopmentTask(BQDevelopmentUpdateInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask relationshipDevelopmentTask) {
    this.relationshipDevelopmentTask = relationshipDevelopmentTask;
  }


}


package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQDevelopmentRequestInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask;

import javax.validation.Valid;
  
/**
 * BQDevelopmentRequestInputModelDevelopmentInstanceRecord
 */
public class BQDevelopmentRequestInputModelDevelopmentInstanceRecord   {
  private BQDevelopmentRequestInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask relationshipDevelopmentTask = null;


  /**
   * Get relationshipDevelopmentTask
   * @return relationshipDevelopmentTask
  **/

  public BQDevelopmentRequestInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask getRelationshipDevelopmentTask() {
    return relationshipDevelopmentTask;
  }

  public void setRelationshipDevelopmentTask(BQDevelopmentRequestInputModelDevelopmentInstanceRecordRelationshipDevelopmentTask relationshipDevelopmentTask) {
    this.relationshipDevelopmentTask = relationshipDevelopmentTask;
  }


}


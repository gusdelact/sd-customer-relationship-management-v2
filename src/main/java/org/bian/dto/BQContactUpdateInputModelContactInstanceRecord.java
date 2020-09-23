package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactUpdateInputModelContactInstanceRecordCustomerRelationshipContactRecord;

import javax.validation.Valid;
  
/**
 * BQContactUpdateInputModelContactInstanceRecord
 */
public class BQContactUpdateInputModelContactInstanceRecord   {
  private BQContactUpdateInputModelContactInstanceRecordCustomerRelationshipContactRecord customerRelationshipContactRecord = null;


  /**
   * Get customerRelationshipContactRecord
   * @return customerRelationshipContactRecord
  **/

  public BQContactUpdateInputModelContactInstanceRecordCustomerRelationshipContactRecord getCustomerRelationshipContactRecord() {
    return customerRelationshipContactRecord;
  }

  public void setCustomerRelationshipContactRecord(BQContactUpdateInputModelContactInstanceRecordCustomerRelationshipContactRecord customerRelationshipContactRecord) {
    this.customerRelationshipContactRecord = customerRelationshipContactRecord;
  }


}


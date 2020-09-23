package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactRequestInputModelContactInstanceRecordCustomerRelationshipContactRecord;

import javax.validation.Valid;
  
/**
 * BQContactRequestInputModelContactInstanceRecord
 */
public class BQContactRequestInputModelContactInstanceRecord   {
  private BQContactRequestInputModelContactInstanceRecordCustomerRelationshipContactRecord customerRelationshipContactRecord = null;


  /**
   * Get customerRelationshipContactRecord
   * @return customerRelationshipContactRecord
  **/

  public BQContactRequestInputModelContactInstanceRecordCustomerRelationshipContactRecord getCustomerRelationshipContactRecord() {
    return customerRelationshipContactRecord;
  }

  public void setCustomerRelationshipContactRecord(BQContactRequestInputModelContactInstanceRecordCustomerRelationshipContactRecord customerRelationshipContactRecord) {
    this.customerRelationshipContactRecord = customerRelationshipContactRecord;
  }


}


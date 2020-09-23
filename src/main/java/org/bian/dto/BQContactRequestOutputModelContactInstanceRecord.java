package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.bian.dto.BQContactRequestOutputModelContactInstanceRecordCustomerRelationshipContactRecord;

import javax.validation.Valid;
  
/**
 * BQContactRequestOutputModelContactInstanceRecord
 */
public class BQContactRequestOutputModelContactInstanceRecord   {
  private BQContactRequestOutputModelContactInstanceRecordCustomerRelationshipContactRecord customerRelationshipContactRecord = null;


  /**
   * Get customerRelationshipContactRecord
   * @return customerRelationshipContactRecord
  **/

  public BQContactRequestOutputModelContactInstanceRecordCustomerRelationshipContactRecord getCustomerRelationshipContactRecord() {
    return customerRelationshipContactRecord;
  }

  public void setCustomerRelationshipContactRecord(BQContactRequestOutputModelContactInstanceRecordCustomerRelationshipContactRecord customerRelationshipContactRecord) {
    this.customerRelationshipContactRecord = customerRelationshipContactRecord;
  }


}


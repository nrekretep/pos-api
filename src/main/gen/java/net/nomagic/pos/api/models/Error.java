package net.nomagic.pos.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import net.nomagic.pos.api.models.AdditionalMessage;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="Error")
public class Error  {
  
  
  private String error = null;
  
  private String errorDescription = null;
  
  private String errorUri = null;
  
  private String requestId = null;
  
  private List<AdditionalMessage> additionalMessages = new ArrayList<AdditionalMessage>();

  
  /**
   **/
  @JsonProperty("error")
  public String getError() {
    return error;
  }
  public void setError(String error) {
    this.error = error;
  }

  
  /**
   **/
  @JsonProperty("error_description")
  public String getErrorDescription() {
    return errorDescription;
  }
  public void setErrorDescription(String errorDescription) {
    this.errorDescription = errorDescription;
  }

  
  /**
   **/
  @JsonProperty("error_uri")
  public String getErrorUri() {
    return errorUri;
  }
  public void setErrorUri(String errorUri) {
    this.errorUri = errorUri;
  }

  
  /**
   **/
  @JsonProperty("request_id")
  public String getRequestId() {
    return requestId;
  }
  public void setRequestId(String requestId) {
    this.requestId = requestId;
  }

  
  /**
   **/
  @JsonProperty("additional_messages")
  public List<AdditionalMessage> getAdditionalMessages() {
    return additionalMessages;
  }
  public void setAdditionalMessages(List<AdditionalMessage> additionalMessages) {
    this.additionalMessages = additionalMessages;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Error {\n");
    
    sb.append("  error: ").append(error).append("\n");
    sb.append("  errorDescription: ").append(errorDescription).append("\n");
    sb.append("  errorUri: ").append(errorUri).append("\n");
    sb.append("  requestId: ").append(requestId).append("\n");
    sb.append("  additionalMessages: ").append(additionalMessages).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

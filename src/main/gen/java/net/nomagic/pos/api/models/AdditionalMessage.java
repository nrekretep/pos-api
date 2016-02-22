package net.nomagic.pos.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="AdditionalMessage")
public class AdditionalMessage  {
  
  
  private String id = null;
  
  private String description = null;
  
  public enum SeverityEnum {
     error,  warning,  information, 
  };
  private SeverityEnum severity = null;
  
  private String helpUri = null;
  
  private String _path = null;

  
  /**
   **/
  @JsonProperty("id")
  public String getId() {
    return id;
  }
  public void setId(String id) {
    this.id = id;
  }

  
  /**
   **/
  @JsonProperty("description")
  public String getDescription() {
    return description;
  }
  public void setDescription(String description) {
    this.description = description;
  }

  
  /**
   **/
  @JsonProperty("severity")
  public SeverityEnum getSeverity() {
    return severity;
  }
  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  
  /**
   **/
  @JsonProperty("help_uri")
  public String getHelpUri() {
    return helpUri;
  }
  public void setHelpUri(String helpUri) {
    this.helpUri = helpUri;
  }

  
  /**
   **/
  @JsonProperty("path")
  public String getPath() {
    return _path;
  }
  public void setPath(String _path) {
    this._path = _path;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AdditionalMessage {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  description: ").append(description).append("\n");
    sb.append("  severity: ").append(severity).append("\n");
    sb.append("  helpUri: ").append(helpUri).append("\n");
    sb.append("  _path: ").append(_path).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

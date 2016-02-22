package net.nomagic.pos.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="Product")
public class Product  {
  
  
  private Long id = null;
  
  private String sku = null;
  
  private String displayName = null;
  
  private Float basePrice = null;
  
  private Float vatRate = 0.19f;

  
  /**
   * tbd
   **/
  @JsonProperty("id")
  public Long getId() {
    return id;
  }
  public void setId(Long id) {
    this.id = id;
  }

  
  /**
   * tbd
   **/
  @JsonProperty("sku")
  public String getSku() {
    return sku;
  }
  public void setSku(String sku) {
    this.sku = sku;
  }

  
  /**
   * Display name of product.
   **/
  @JsonProperty("display_name")
  public String getDisplayName() {
    return displayName;
  }
  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  
  /**
   **/
  @JsonProperty("base_price")
  public Float getBasePrice() {
    return basePrice;
  }
  public void setBasePrice(Float basePrice) {
    this.basePrice = basePrice;
  }

  
  /**
   **/
  @JsonProperty("vat_rate")
  public Float getVatRate() {
    return vatRate;
  }
  public void setVatRate(Float vatRate) {
    this.vatRate = vatRate;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Product {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  sku: ").append(sku).append("\n");
    sb.append("  displayName: ").append(displayName).append("\n");
    sb.append("  basePrice: ").append(basePrice).append("\n");
    sb.append("  vatRate: ").append(vatRate).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

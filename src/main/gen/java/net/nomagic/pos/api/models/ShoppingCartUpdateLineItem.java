package net.nomagic.pos.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="ShoppingCartUpdateLineItem")
public class ShoppingCartUpdateLineItem  {
  
  
  private Integer quantity = null;
  
  private Float grossPrice = null;
  
  private Float netPrice = null;

  
  /**
   * tbd
   **/
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }
  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  
  /**
   * tbd
   **/
  @JsonProperty("gross_price")
  public Float getGrossPrice() {
    return grossPrice;
  }
  public void setGrossPrice(Float grossPrice) {
    this.grossPrice = grossPrice;
  }

  
  /**
   * tbd
   **/
  @JsonProperty("net_price")
  public Float getNetPrice() {
    return netPrice;
  }
  public void setNetPrice(Float netPrice) {
    this.netPrice = netPrice;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCartUpdateLineItem {\n");
    
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  grossPrice: ").append(grossPrice).append("\n");
    sb.append("  netPrice: ").append(netPrice).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

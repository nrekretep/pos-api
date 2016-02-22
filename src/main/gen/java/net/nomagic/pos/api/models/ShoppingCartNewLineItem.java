package net.nomagic.pos.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import net.nomagic.pos.api.models.Product;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="ShoppingCartNewLineItem")
public class ShoppingCartNewLineItem  {
  
  
  private Integer quantity = null;
  
  private Product product = null;

  
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
   **/
  @JsonProperty("product")
  public Product getProduct() {
    return product;
  }
  public void setProduct(Product product) {
    this.product = product;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCartNewLineItem {\n");
    
    sb.append("  quantity: ").append(quantity).append("\n");
    sb.append("  product: ").append(product).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

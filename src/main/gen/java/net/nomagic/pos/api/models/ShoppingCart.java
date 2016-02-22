package net.nomagic.pos.api.models;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.*;
import java.util.Date;
import net.nomagic.pos.api.models.Customer;
import net.nomagic.pos.api.models.ShoppingCartLineItem;

import javax.xml.bind.annotation.XmlRootElement;



@XmlRootElement(name="ShoppingCart")
public class ShoppingCart  {
  
  
  private Long id = null;
  
  private List<ShoppingCartLineItem> lineItems = new ArrayList<ShoppingCartLineItem>();
  
  private Date orderTime = null;
  
  private Date creationTime = null;
  
  private Float totalAmount = null;
  
  private Customer customer = null;

  
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
   **/
  @JsonProperty("line_items")
  public List<ShoppingCartLineItem> getLineItems() {
    return lineItems;
  }
  public void setLineItems(List<ShoppingCartLineItem> lineItems) {
    this.lineItems = lineItems;
  }

  
  /**
   * tbd
   **/
  @JsonProperty("order_time")
  public Date getOrderTime() {
    return orderTime;
  }
  public void setOrderTime(Date orderTime) {
    this.orderTime = orderTime;
  }

  
  /**
   * tbd
   **/
  @JsonProperty("creation_time")
  public Date getCreationTime() {
    return creationTime;
  }
  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }

  
  /**
   * tbd
   **/
  @JsonProperty("total_amount")
  public Float getTotalAmount() {
    return totalAmount;
  }
  public void setTotalAmount(Float totalAmount) {
    this.totalAmount = totalAmount;
  }

  
  /**
   **/
  @JsonProperty("customer")
  public Customer getCustomer() {
    return customer;
  }
  public void setCustomer(Customer customer) {
    this.customer = customer;
  }

  

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class ShoppingCart {\n");
    
    sb.append("  id: ").append(id).append("\n");
    sb.append("  lineItems: ").append(lineItems).append("\n");
    sb.append("  orderTime: ").append(orderTime).append("\n");
    sb.append("  creationTime: ").append(creationTime).append("\n");
    sb.append("  totalAmount: ").append(totalAmount).append("\n");
    sb.append("  customer: ").append(customer).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}

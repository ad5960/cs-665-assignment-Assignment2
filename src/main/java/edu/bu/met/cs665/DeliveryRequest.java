package edu.bu.met.cs665;

public class DeliveryRequest {
  public final int maxUnits = 3;
  private String name;
  private String product;
  private int quantity;
  
  /**
   * Delivery Request Constructor.
   *
   * @param product value of product
   * @param quantity value of quantity
   */
  public DeliveryRequest(String product, int quantity) {
    if (this.validate(quantity)) {
      this.product = product;
      this.quantity = quantity;
    }
  }
  
  
  public String getProduct() {
    return product;
  }
  
  public int getQuantity() {
    return quantity;
  }
  
  public String getName() {
    return name;
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  private boolean validate(int quantity) {
    if (quantity <= maxUnits) {
      return true;
    } else {
      return false;
    }
    
  }
}
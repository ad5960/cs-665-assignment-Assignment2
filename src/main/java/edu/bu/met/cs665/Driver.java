package edu.bu.met.cs665;

public class Driver implements NotifyDrivers {
  
  public String name;
  
  public String product;
  
  public String getProduct() {
    return product;
  }
  
  public Driver(String name) {
    this.name = name;
  }
  
  @Override
  public void notify(DeliveryRequest deliveryRequest) {
    this.product = deliveryRequest.getProduct();
    System.out.println(name + " has received delivery request sent from shop "
        + deliveryRequest.getName() + " for " + deliveryRequest.getQuantity()
        + " " + deliveryRequest.getProduct());
  }
  
  public String getName() {
    return name;
  }
  
  
}

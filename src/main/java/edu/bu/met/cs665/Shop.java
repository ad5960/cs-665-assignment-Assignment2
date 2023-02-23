package edu.bu.met.cs665;

import java.util.ArrayList;
import java.util.List;

public class Shop implements ShopSubject {
  private List<DeliveryRequest> deliveryRequests;
  private List<Driver> drivers;
  private String name;
  
  /**
   * Shop Constructor.
   *
   * @param name sets name of shop
   */
  public Shop(String name) {
    this.name = name;
    this.drivers = new ArrayList<>();
    this.deliveryRequests = new ArrayList<>();
  }
  
  public String getName() {
    return name;
  }
  
  /**
   * Creates new delivery request and sends notification to driver.
   *
   * @param deliveryRequest sets new delivery request
   * @return
   */
  public DeliveryRequest createDeliveryRequest(DeliveryRequest deliveryRequest) {
    if (null != deliveryRequest.getProduct()) {
      deliveryRequest.setName(this.name);
      deliveryRequests.add(deliveryRequest);
      notifyDrivers(deliveryRequest);
      return deliveryRequest;
      
    }
    return null;
  }
  
  @Override
  public void addDriver(NotifyDrivers notifyDrivers) {
    drivers.add((Driver) notifyDrivers);
  }
  
  @Override
  public void removeDriver(NotifyDrivers notifyDrivers) {
    drivers.remove(notifyDrivers);
  }
  
  @Override
  public void notifyDrivers(DeliveryRequest deliveryRequest) {
    for (Driver drivers : drivers) {
      drivers.notify(deliveryRequest);
    }
    
  }
}

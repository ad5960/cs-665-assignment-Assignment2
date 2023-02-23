package edu.bu.met.cs665;


public class Main {
  /**
   * This methods serves as a client.
   */
  public static void main(String[] args) {
    Shop shop = new Shop("Supermarket");
    
    DeliveryRequest deliveryRequest = new DeliveryRequest("Banana", 2);
    
    Driver driver1 = new Driver("John who drives a van");
    shop.addDriver(driver1);
    Driver driver2 = new Driver("Mary who drives a taxi");
    shop.addDriver(driver2);
    Driver driver3 = new Driver("Peter who drives a van");
    shop.addDriver(driver3);
    Driver driver4 = new Driver("Tom who drives a taxi");
    shop.addDriver(driver4);
    Driver driver5 = new Driver("Lisa who drives a scooter");
    shop.addDriver(driver5);
    
    shop.createDeliveryRequest(deliveryRequest);
    
    
  }
}




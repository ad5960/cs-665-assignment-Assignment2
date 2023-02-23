package edu.bu.met.cs665;

import org.junit.Assert;
import org.junit.Test;

public class DeliveryAppTest {
  
  @Test
  public void test1() {
    DeliveryRequest deliveryRequest = new DeliveryRequest("Banana", 5);
    Assert.assertNull(deliveryRequest.getName());
  }
  
  @Test
  public void test2() {
    DeliveryRequest deliveryRequest = new DeliveryRequest("Banana", 1);
    Assert.assertTrue(deliveryRequest.getProduct().equals("Banana"));
    
  }
  
  @Test
  public void test3() {
    DeliveryRequest deliveryRequest = new DeliveryRequest("Banana", 5);
    Shop shop = new Shop("ABC");
    Assert.assertNull(shop.createDeliveryRequest(deliveryRequest));
    
  }
  
  @Test
  public void test4() {
    DeliveryRequest deliveryRequest = new DeliveryRequest("Banana", 2);
    Shop shop = new Shop("ABC");
    Assert.assertEquals(shop.createDeliveryRequest(deliveryRequest), deliveryRequest);
    
  }
  
  @Test
  public void test5() {
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
    Assert.assertEquals(driver1.getProduct(), deliveryRequest.getProduct());
    
  }
}

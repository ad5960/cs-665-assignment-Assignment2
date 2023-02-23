package edu.bu.met.cs665;

public interface ShopSubject {
  public void addDriver(NotifyDrivers notifyDrivers);
  
  public void removeDriver(NotifyDrivers notifyDrivers);
  
  public void notifyDrivers(DeliveryRequest deliveryRequest);
}

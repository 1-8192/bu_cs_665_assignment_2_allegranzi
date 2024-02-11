package edu.bu.met.cs665;

public class Driver implements DriverSubscriber{

  private String name;
  private Shop shop;

  private DeliveryRequest deliveryRequest;

  public Driver(String name, Shop shop) {
    this.name = name;
    this.shop = shop;
  }

  public void update(DeliveryRequest deliveryRequest) {
    this.deliveryRequest = deliveryRequest;
    System.out.println("Driver " + name + " has received the following delivery request: \n"
    + deliveryRequest);
  }
}

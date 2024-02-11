/**
 * Name: Alessandro Allegranzi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Shop.java
 * Description: Concrete implementation of the ShopPublisher observable interface.
 */

package edu.bu.met.cs665;

import java.util.ArrayList;

/*
 * Shop is the concrete observable that sends out delivrey requests
 * to subscribed observers (drivers).
 */
public class Shop implements ShopPublisher{

  /*
   * The delivery notififation to send to drivers.
   */
  private DeliveryRequest deliveryRequest;

  /*
   * Array list of driver observers.
   */
  private ArrayList<DriverSubscriber> drivers = new ArrayList<>();

  public void subscribe(DriverSubscriber driver) {
    drivers.add(driver);
  }

  public void notifySubscribers() {
    for (DriverSubscriber driver : drivers) {
      driver.update(deliveryRequest);
    }
  }

  public void setDeliveryRequest(DeliveryRequest deliveryRequest) {
    this.deliveryRequest = deliveryRequest;
    notifySubscribers();
  }
}

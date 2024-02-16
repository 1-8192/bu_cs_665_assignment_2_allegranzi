/**
 * Name: Alessandro Allegranzi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Shop.java
 * Description: Concrete implementation of the ShopPublisher observable interface.
 */

package edu.bu.met.cs665.shop;

import edu.bu.met.cs665.DeliveryRequest;
import edu.bu.met.cs665.driver.DriverSubscriber;
import java.util.ArrayList;

/**
 * Shop is the concrete observable that sends out delivrey requests
 * to subscribed observers (drivers).
 */
public class Shop implements ShopPublisher {

  /*
   * The delivery notification to send to drivers.
   */
  private DeliveryRequest deliveryRequest;

  /*
   * Array list of driver observers.
   */
  private ArrayList<DriverSubscriber> drivers = new ArrayList<>();

  /**
   * Implementation of subscribe method. Adds a new driver to the drivers array list.
   *
   * @param driver the driver instance we are adding.
   */
  public void subscribe(DriverSubscriber driver) {
    drivers.add(driver);
  }

  /**
   * Implementation of notifySubscribers method. Sends out an update to all subscribed drivers.
   */
  public void notifySubscribers() {
    for (DriverSubscriber driver : drivers) {
      driver.update(deliveryRequest);
    }
  }

  /**
   * Setter method for the deliveryRequest instance that holds delivery informaton.
   *
   * @param deliveryRequest the request.
   */
  public void setDeliveryRequest(DeliveryRequest deliveryRequest) {
    this.deliveryRequest = deliveryRequest;
    notifySubscribers();
  }

  /**
   * Getter method for the subscribed drivers. Used for unit testing.
   *
   * @return ArrayList of drivers.
   */
  public ArrayList<DriverSubscriber> getDrivers() {
    return drivers;
  }
}

/**
 * Name: Alessandro Allegranzi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: DriverSubscriber.java
 * Description: Interface for the observer/subscriber class in the observer pattern.
 */

package edu.bu.met.cs665.driver;

import edu.bu.met.cs665.DeliveryRequest;

/*
 * Interface for subscribers/drivers in the app.
 */
public interface DriverSubscriber {

  /*
   * Update method to process and update from the observable.
   */
  void update(DeliveryRequest deliveryRequest);
}

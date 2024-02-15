/**
 * Name: Alessandro Allegranzi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: ShopPublisher.java
 * Description: Interface for the observable/publisher class in the observer pattern.
 */

package edu.bu.met.cs665.shop;

import edu.bu.met.cs665.driver.DriverSubscriber;

/**
 * Interface for observable/publisher classes to implement.
 */
public interface ShopPublisher {

  /**
   * Subscribe interface method.
   *
   * @param subscriber the class that will observe this observable.
   */
  void subscribe(DriverSubscriber subscriber);

  /**
   * Method to notify all observers of update.
   */
  void notifySubscribers();
}

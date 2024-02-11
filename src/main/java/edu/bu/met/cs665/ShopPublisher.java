/**
 * Name: Alessandro Allegranzi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: ShopPublisher.java
 * Description: Interface for the observable/publisher class in the observer pattern.
 */

package edu.bu.met.cs665;

/**
 * Interface for observable/publisher classes to implement.
 */
public interface ShopPublisher {
  void subscribe(DriverSubscriber subscriber);

  void notifySubscribers();
}

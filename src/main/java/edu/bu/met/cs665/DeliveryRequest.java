/**
 * Name: Alessandro Allegranzi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: DeliveryRequest.java
 * Description: Delivery request contains information for deliveries.
 */

package edu.bu.met.cs665;

/**
 * The request class represents a new delivery request from the shop to the drivers.
 */
public class DeliveryRequest {

  /*
   * Delivery address.
   */
  String location;

  /*
   * Order information.
   */
  String order;

  /*
   * Any special instructions for driver.
   */
  String message = "none";

  /**
   * Public constructor.
   */
  public DeliveryRequest(String location, String order, String message) {
    this.location = location;
    this.order = order;
    if (!message.isEmpty()) {
      this.message = message;
    }
  }

  /**
   * Overriding toString() to print an informative string for the request.
   */
  @Override
  public String toString() {
    return "--Delivery Request-- \n"
          + "order: " + order + "\n"
          + "location: " + location + "\n"
          + "special instructions: " + message;
  }
}

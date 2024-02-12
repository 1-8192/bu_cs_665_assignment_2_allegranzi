/**
 * Name: Alessandro Allegranzi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Driver.java
 * Description: Driver is the concrete observer class.
 */

package edu.bu.met.cs665;

/*
 * Class for drivers who received updates from the shop.
 */
public class Driver implements DriverSubscriber{

  /*
   * The driver name to distinguish the driver.
   */
  private String name;

  /*
   * The shop the driver subscribes to.
   */
  private Shop shop;

  /*
   * The delivery request the driver receives.
   */
  private DeliveryRequest deliveryRequest;

  /*
   * Class constructor.
   */
  public Driver(String name, Shop shop) {
    this.name = name;
    this.shop = shop;
  }

  /*
   * Concrete implementation for th interface update method.
   */
  public void update(DeliveryRequest deliveryRequest) {
    this.deliveryRequest = deliveryRequest;
    System.out.println("Driver " + name + " has received the following delivery request: \n"
    + deliveryRequest);
  }
}

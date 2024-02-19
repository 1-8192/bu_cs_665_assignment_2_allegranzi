/**
 * Name: Alessandro Allegranzi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Main.java
 * Description: The Main executable class for the application.
 */

package edu.bu.met.cs665;


import edu.bu.met.cs665.driver.Driver;
import edu.bu.met.cs665.driver.Scooter;
import edu.bu.met.cs665.driver.Taxi;
import edu.bu.met.cs665.driver.Van;
import edu.bu.met.cs665.shop.Shop;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * The main method that sets up the observable and observer classes for a test run
   * of the driver delivery system implementation.
   */
  public static void main(String[] args) {

    // Creating necessary variables.
    Shop uberShop = new Shop();
    Scooter scooter = new Scooter();
    Taxi taxi = new Taxi();
    Van van = new Van();

    Driver driverOne = new Driver("Thomas", uberShop, scooter);
    Driver driverTwo = new Driver("Wanda", uberShop, taxi);
    Driver driverThree = new Driver("Jane", uberShop, van);
    Driver driverFour = new Driver("Bill", uberShop, van);
    Driver driverFive = new Driver("Sam", uberShop, scooter);

    DeliveryRequest testRequest = new DeliveryRequest(
          "cheeseburger", "123 Main St", "hold the mayo");

    // Subscribing 5 drivers to the shop.
    uberShop.subscribe(driverOne);
    uberShop.subscribe(driverTwo);
    uberShop.subscribe(driverThree);
    uberShop.subscribe(driverFour);
    uberShop.subscribe(driverFive);

    // Testing the notification.
    uberShop.setDeliveryRequest(testRequest);
  }
}

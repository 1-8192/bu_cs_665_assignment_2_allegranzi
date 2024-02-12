/**
 * Name: Alessandro Allegranzi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Main.java
 * Description: The Main executable class for the application.
 */

package edu.bu.met.cs665;

import edu.bu.met.cs665.example1.Person;

/**
 * This is the Main class.
 */
public class Main {

  /**
   * A main method to run examples.
   * You may use this method for development purposes as you start building your
   * assignments/final project.  This could prove convenient to test as you are developing.
   * However, please note that every assignment/final projects requires JUnit tests.
   */
  public static void main(String[] args) {

    Shop uberShop = new Shop();

    Driver driverOne = new Driver("Thomas", uberShop);
    Driver driverTwo = new Driver("Wanda", uberShop);
    Driver driverThree = new Driver("Jane", uberShop);
    Driver driverFour = new Driver("Bill", uberShop);
    Driver driverFive = new Driver("Sam", uberShop);

    uberShop.subscribe(driverOne);
    uberShop.subscribe(driverTwo);
    uberShop.subscribe(driverThree);
    uberShop.subscribe(driverFour);
    uberShop.subscribe(driverFive);

    DeliveryRequest testRequest = new DeliveryRequest(
          "cheeseburger", "123 Main St", "hold the mayo");

    uberShop.setDeliveryRequest(testRequest);
  }
}

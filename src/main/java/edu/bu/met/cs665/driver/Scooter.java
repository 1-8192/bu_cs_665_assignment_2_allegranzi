/**
 * Name: Alessandro Allegranzi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: Scooter.java
 * Description: Scooter class that implements Vehicle.
 */

package edu.bu.met.cs665.driver;

/**
 * Scooter class that implements vehicle interface.
 */
public class Scooter implements Vehicle {

  /**
   * Class specific implementation of the interface method. Shows the vehicle type.
   *
   * @return string the vehicle type.
   */
  @Override
  public String getVehicleType() {
    return "Scooter";
  }

}

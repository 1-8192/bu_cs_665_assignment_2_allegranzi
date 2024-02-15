package edu.bu.met.cs665.driver;

import edu.bu.met.cs665.driver.Vehicle;

public class Taxi implements Vehicle {

  @Override
  public String getVehicleType() {
    return "Taxi";
  }
}

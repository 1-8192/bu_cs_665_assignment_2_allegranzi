/**
 * Name: Alessandro Allegranzi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: TestDriver.java
 * Description: The test class for Driver.
 */

package edu.bu.met.cs665.driver;

import edu.bu.met.cs665.DeliveryRequest;
import edu.bu.met.cs665.shop.Shop;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Tests for the Driver observer class.
 */
public class TestDriver {

  /**
   * Testing the update interface method.
   */
  @Test
  public void testUpdate() {
    // Creating variables
    Shop shop =  new Shop();
    Van van = new Van();
    DeliveryRequest deliveryRequest = new DeliveryRequest("test st", "burger", "no pickles");
    Driver driver = new Driver("Tim", shop, van);

    // Subscribing driver to shop
    shop.subscribe(driver);
    shop.setDeliveryRequest(deliveryRequest);

    // Checking that the driver got the update.
    assertEquals(deliveryRequest, driver.getDeliveryRequest());
  }
}

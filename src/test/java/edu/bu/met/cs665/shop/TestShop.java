/**
 * Name: Alessandro Allegranzi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: TestShop.java
 * Description: The test class for Shop.
 */

package edu.bu.met.cs665.shop;

import edu.bu.met.cs665.DeliveryRequest;
import edu.bu.met.cs665.driver.Driver;
import edu.bu.met.cs665.driver.Scooter;
import edu.bu.met.cs665.driver.Taxi;
import edu.bu.met.cs665.driver.Van;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * Test class for Shop concrete observable.
 */
public class TestShop {

  /**
   * Testing the subscribe method.
   */
  @Test
  public void testSubscribe() {
    Shop shop = new Shop();
    Scooter scooter = new Scooter();
    Driver driver1 = new Driver("Bill", shop, scooter);

    shop.subscribe(driver1);

    assertTrue(shop.getDrivers().contains(driver1));
  }

  /**
   * Testing the notifySubscribers method. Testing 5 drivers since that was an assigment requirement.
   */
  @Test
  public void testNotifySubscribers() {
    Shop shop = new Shop();
    Scooter scooter = new Scooter();
    Taxi taxi = new Taxi();
    Van van = new Van();
    Driver driver1 = new Driver("Bill", shop, scooter);
    Driver driver2 = new Driver("Sara", shop, van);
    Driver driver3 = new Driver("Lara", shop, taxi);
    Driver driver4 = new Driver("Kara", shop, taxi);
    Driver driver5 = new Driver("Jim", shop, van);

    shop.subscribe(driver1);
    shop.subscribe(driver2);
    shop.subscribe(driver3);
    shop.subscribe(driver4);
    shop.subscribe(driver5);

    DeliveryRequest deliveryRequest = new DeliveryRequest("666 Elm Street", "pizza", "");
    shop.setDeliveryRequest(deliveryRequest);

    assertEquals(deliveryRequest, driver1.getDeliveryRequest());
    assertEquals(deliveryRequest, driver2.getDeliveryRequest());
    assertEquals(deliveryRequest, driver3.getDeliveryRequest());
    assertEquals(deliveryRequest, driver4.getDeliveryRequest());
    assertEquals(deliveryRequest, driver5.getDeliveryRequest());

  }
}

/**
 * Name: Alessandro Allegranzi
 * Course: CS-665 Software Designs & Patterns
 * Date: 02/22/2024
 * File Name: TestDeliveryRequest.java
 * Description: The test class for DeliveryRequest.
 */

package edu.bu.met.cs665;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Test class for DeliveryRequest.
 */
public class TestDeliveryRequest {

  /**
   * Testing the constructor.
   */
  @Test
  public void testConstructor() {
    DeliveryRequest deliveryRequest = new DeliveryRequest("666 Elm St", "Pizza",
          "Do not ring doorbell.");
    assertEquals("666 Elm St", deliveryRequest.location);
    assertEquals("Pizza", deliveryRequest.order);
    assertEquals("Do not ring doorbell.", deliveryRequest.message);
  }

  /**
   * Testing that string output matches what we want.
   */
  @Test
  public void testToString() {
    DeliveryRequest deliveryRequest = new DeliveryRequest("666 Elm St", "Sushi",
          "Do not ring doorbell.");
    String expectedString = "--Delivery Request-- \n"
          + "order: Sushi\n"
          + "location: 666 Elm St\n"
          + "special instructions: Do not ring doorbell.";
    assertEquals(expectedString, deliveryRequest.toString());
  }

  /**
   * Testing string output with default special instructions.
   */
  @Test
  public void testToStringWithDefaultMessage() {
    DeliveryRequest deliveryRequest = new DeliveryRequest("666 Elm St", "Sushi",
          "");
    String expectedString = "--Delivery Request-- \n"
          + "order: Sushi\n"
          + "location: 666 Elm St\n"
          + "special instructions: none";
    assertEquals(expectedString, deliveryRequest.toString());
  }
}

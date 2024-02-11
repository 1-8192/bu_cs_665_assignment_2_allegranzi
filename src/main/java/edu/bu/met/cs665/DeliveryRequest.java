package edu.bu.met.cs665;

public class DeliveryRequest {

  String location;

  String order;

  String message = "none";

  public DeliveryRequest(String location, String order, String message) {
    this.location = location;
    this.order = order;
    if (!message.isEmpty()) {
      this.message = message;
    }
  }

  @Override
  public String toString() {
    return "--Delivery Request-- \n"
          + "order: " + order + "\n"
          + "location: " + location + "\n"
          + "special instructions: " + message;
  }
}

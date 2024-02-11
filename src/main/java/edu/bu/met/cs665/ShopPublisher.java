package edu.bu.met.cs665;

public interface ShopPublisher {
  void subscribe(DriverSubscriber subscriber);

  void notifySubscribers();
}

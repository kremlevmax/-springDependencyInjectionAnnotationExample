package org.example;

public class VehicleFactory {
  Vehicle vehicle;

  public VehicleFactory(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public Vehicle getVehicle() {
    return vehicle;
  }

  public void setVehicle(Vehicle vehicle) {
    this.vehicle = vehicle;
  }

  public void createVehicle() {
    System.out.println("We created " + vehicle.getVehicleType());
    System.out.println(vehicle.getMake());
    System.out.println(vehicle.getYear());
  }

}

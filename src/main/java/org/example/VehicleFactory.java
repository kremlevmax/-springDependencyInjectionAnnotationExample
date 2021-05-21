package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class VehicleFactory {


  private Vehicle vehicle;

  @Autowired
  public VehicleFactory( @Qualifier("helicopter") Vehicle vehicle) {
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

package org.example;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Motorcycle implements Vehicle {

  @Value("${vehicle.make}")
  private String make;
  @Value("${vehicle.year}")
  private int year;

  public Motorcycle() {
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }

  @Override
  public String getVehicleType() {
    return "Motorcycle";
  }


}

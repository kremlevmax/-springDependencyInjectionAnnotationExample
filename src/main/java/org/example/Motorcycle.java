package org.example;

public class Motorcycle implements Vehicle {
  private String make;
  private int year;

  public Motorcycle(String make) {
    this.make = make;
  }

  public Motorcycle() {
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  @Override
  public String getVehicleType() {
    return "Motorcycle";
  }

  public int getYear() {
    return year;
  }

  public void setYear(int year) {
    this.year = year;
  }
}

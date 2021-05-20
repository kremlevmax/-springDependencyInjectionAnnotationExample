package org.example;

public class Car implements Vehicle {

  private String make;
  private int year;

  public Car(String make) {
    this.make = make;
  }

  public String getMake() {
    return make;
  }

  public void setMake(String make) {
    this.make = make;
  }

  @Override
  public int getYear() {
    return year;
  }

  @Override
  public void setYear(int year) {
    this.year = year;
  }

  public String getVehicleType() {
    return "Car";
  }
}

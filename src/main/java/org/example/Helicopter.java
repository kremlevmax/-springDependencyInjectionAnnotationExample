package org.example;

public class Helicopter implements Vehicle{

  private String make;
  private int year;

  public Helicopter(String make) {
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

  @Override
  public String getVehicleType() {
    return "Helicopter";
  }
}

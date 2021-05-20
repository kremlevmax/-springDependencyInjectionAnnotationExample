package org.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

  public static void main(String[] args) {
    ClassPathXmlApplicationContext context =
        new ClassPathXmlApplicationContext("applicationContext.xml");

//    Vehicle vehicleBean = context.getBean("vehicleBean", Vehicle.class);
//
//    VehicleFactory vehicleFactory = new VehicleFactory(vehicleBean);
//    vehicleFactory.createVehicle();

    VehicleFactory vehicleFactory = context.getBean("vehicleFactoryBean", VehicleFactory.class);
    vehicleFactory.createVehicle();
    context.close();
  }

}

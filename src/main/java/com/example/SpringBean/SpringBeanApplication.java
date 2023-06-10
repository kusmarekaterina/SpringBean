package com.example.SpringBean;

import com.example.SpringBean.driver.Driver;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.SpringBean.service.AppConfig;
import com.example.SpringBean.transport.Bus;
import com.example.SpringBean.transport.Car;
import com.example.SpringBean.transport.Pickup;

@SpringBootApplication
public class SpringBeanApplication {

	public static void main(String[] args) {
//		SpringApplication.run(SpringBeanApplication.class, args);
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Car car = context.getBean(Car.class);
		car.start();
		Bus bus = context.getBean(Bus.class);
		bus.start();
		Pickup pickup = context.getBean(Pickup.class);
		pickup.start();

		Driver driverCar = context.getBean("driverCar",Driver.class);
		driverCar.startTheCar();

		Driver driverBus = context.getBean("driverBus",Driver.class);
		driverBus.startTheCar();

		Driver driverPickup = context.getBean("driverPickup",Driver.class);
		driverPickup.startTheCar();
	}

}

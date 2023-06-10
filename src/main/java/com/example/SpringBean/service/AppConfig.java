package com.example.SpringBean.service;

import com.example.SpringBean.driver.Driver;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.example.SpringBean.transport.Bus;
import com.example.SpringBean.transport.Car;
import com.example.SpringBean.transport.Pickup;


@Configuration
public class AppConfig {
    @Bean
    Car car(){
        return new Car("BMW","A",2.1);
    }
    @Bean
    Bus bus(){
        return new Bus("Mercedes","B", 3.3);
    }
    @Bean
    Pickup pickup(){
        return new Pickup("Dodge","WC",4.2);
    }

    @Bean
    Driver driverCar(){
        return new Driver("Иван",car());
    }
    @Bean
    Driver driverBus(){
        return new Driver("Николай",bus());
    }
    @Bean
    Driver driverPickup(){
        return new Driver("Дмитрий",pickup());
    }
}

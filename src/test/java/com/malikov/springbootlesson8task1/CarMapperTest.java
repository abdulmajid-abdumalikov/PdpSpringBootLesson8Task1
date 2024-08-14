package com.malikov.springbootlesson8task1;

import com.malikov.springbootlesson8task1.car.Car;
import com.malikov.springbootlesson8task1.car.CarDTO;
import com.malikov.springbootlesson8task1.car.CarMapper;
import org.junit.jupiter.api.Test;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CarMapperTest {

    @Test
    public void testCarDTOToCarMapping() {
        CarDTO carDTO = new CarDTO("Tesla Model S", "2023");

        Car car = CarMapper.INSTANCE.toEntity(carDTO);

        assertNotNull(car.getId(), "Car ID should not be null");
        assertEquals(carDTO.getName(), car.getName(), "Car name should match");
        assertEquals(carDTO.getModel(), car.getModel(), "Car model should match");
    }

    @Test
    public void testCarToCarDTOMapping() {
        Car car = new Car(UUID.randomUUID().toString(), "Tesla Model S", "2023");

        CarDTO carDTO = CarMapper.INSTANCE.toDTO(car);

        assertEquals(car.getName(), carDTO.getName(), "CarDTO name should match");
        assertEquals(car.getModel(), carDTO.getModel(), "CarDTO model should match");
    }
}


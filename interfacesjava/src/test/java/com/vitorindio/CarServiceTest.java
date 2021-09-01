package com.vitorindio;

import org.junit.Test;

public class CarServiceTest {

  @Test
    public void shouldDemonstrateInterfaces(){
      CarService carService = new CarService();
      carService.drive();
  }
}

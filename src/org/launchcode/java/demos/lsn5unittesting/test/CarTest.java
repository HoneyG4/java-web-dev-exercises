package org.launchcode.java.demos.lsn5unittesting.test;

import org.junit.Before;
import org.junit.Test;
import org.launchcode.java.demos.lsn5unittesting.main.Car;

import static org.junit.Assert.*;

public class CarTest {
Car test_car;
  @Before
  public void createCarObject(){
      test_car = new Car("Toyota","prius",10,50);
  }
    //TODO: add emptyTest so we can configure our runtime environment (remove this test before pushing to your personal GitLab account)
    @Test
    public void emptyTest(){
        assertEquals(10,10,.00);
    }

    //TODO: constructor sets gasTankLevel properly
    @Test
    public void testInitialGasTank(){

      assertTrue(0 < test_car.getGasTankSize());
    }
    //TODO: gasTankLevel is accurate after driving within tank range
    //TODO: gasTankLevel is accurate after attempting to drive past tank range
    //TODO: can't have more gas than tank size, expect an exception

}

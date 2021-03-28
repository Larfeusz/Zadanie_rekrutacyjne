package com.company;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TemperatureTest {
    private Temperature temperature;

    @BeforeEach
    public void setUp() throws Exception {
        temperature = new Temperature();
    }
    @Test
    @DisplayName("Checking temperature equals 0")
    public void temperatureEqualsZeroTest() {
        assertEquals(new HashSet<>( Arrays.asList(0)), temperature.findTheClosestTempToZero(Arrays.asList(-3,-2,-1,0,1,2,3)),
                "Temperature is 0");
    }
    @Test
    @DisplayName("Checking temperatures equal -2,2")
    public void temperaturesEqualsTwoTest() {
        assertEquals(new HashSet<>( Arrays.asList(-2,2)), temperature.findTheClosestTempToZero(Arrays.asList(-3,-2,2,3)),
                "The closest temperatures are -2 and 2");
    }
}

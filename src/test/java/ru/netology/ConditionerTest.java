package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ConditionerTest {
//    @Test
//    public void shouldGetAndSet() {
//        Conditioner conditioner = new Conditioner();
//        String expected = "Кондишн";
//
//        assertNull(conditioner.getName());
//        conditioner.setName(expected);
//        assertEquals(expected, conditioner.getName());
//    }

    @Test
    public void shouldIncreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(22);
        assertEquals(22, conditioner.getCurrentTemperature());
        conditioner.setIncreaseCurrentTemperature(23);
        assertEquals(23, conditioner.getIncreaseCurrentTemperature());
    }

    @Test
    public void shouldDecreaseCurrentTemperature() {
        Conditioner conditioner = new Conditioner();
        conditioner.setMaxTemperature(35);
        conditioner.setMinTemperature(10);
        conditioner.setCurrentTemperature(22);
        assertEquals(22, conditioner.getCurrentTemperature());
        conditioner.setDecreaseCurrentTemperature(21);
        assertEquals(21, conditioner.getDecreaseCurrentTemperature());
    }
}
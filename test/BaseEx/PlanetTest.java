package BaseEx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    public void checkNameTest() {
        Planet planet = new Planet("Earth", 93496928, "The Sun");
        assertEquals("Earth", planet.getName());
    }

    @Test
    public void setDistanceTest() {
        Planet planet = new Planet("Earth", 93496928, "The Sun");
        planet.setDistanceFromSun(100);
        assertEquals(100, planet.getDistanceFromSun());
    }

    @Test
    public void equalPlanetsTest() {
        Planet planet = new Planet("Earth", 93496928, "The Sun");
        Planet planet2 = new Planet("Earth", 93496928, "The Sun");
        assertEquals(planet, planet2);
    }
}
package BaseEx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PlanetTest {

    @Test
    public void checkNameTest() {
        Planet planet = new Planet("Earth", 150410159, "The Sun");
        assertEquals("Earth", planet.getName());
    }

    @Test
    public void setDistanceTest() {
        Planet planet = new Planet("Earth", 150410159, "The Sun");
        planet.setDistanceFromTarget(100);
        assertEquals(100, planet.getDistanceFromTarget());
    }

    @Test
    public void equalPlanetsTest() {
        Planet planet = new Planet("Earth", 150410159, "The Sun");
        Planet planet2 = new Planet("Earth", 150410159, "The Sun");
        assertEquals(planet, planet2);
    }

    @Test
    public void howManyMoonsTest() {
        Moon jup1 = new Moon("Io", 423142, "Jupiter");
        Moon jup2 = new Moon("Europa", 673268, "Jupiter");
        Moon jup3 = new Moon("Ganymede", 1070400, "Jupiter");
        Moon jup4 = new Moon("Callisto", 1882700, "Jupiter");
        Planet planet = new Planet("Jupiter", 767895851, "The Sun");
        assertEquals(4, planet.howManyMoons());
    }

    @Test
    public void distanceBetweenPlanetsTest() {
        Planet planet = new Planet("Earth", 150410159, "The Sun");
        Planet planet2 = new Planet("Jupiter", 767895851, "The Sun");
        assertEquals(617485692, planet.distanceBetween(planet2));
    }
}
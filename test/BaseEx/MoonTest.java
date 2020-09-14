package BaseEx;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoonTest {

    @Test
    public void checkTargetTest() {
        Moon moon = new Moon("Moon", 229075, "Earth");
        assertEquals("Earth", moon.getTarget());
    }

    @Test
    public void setNameTest() {
        Moon moon = new Moon("Moon", 229075, "Earth");
        moon.setName("New Moon");
        assertEquals("New Moon", moon.getName());
    }

    @Test
    public void setTargetTest() {
        Moon moon = new Moon("Moon", 229075, "Earth");
        moon.setTarget("The Sun");
        assertNotEquals("Earth", moon.getTarget());
    }

    @Test
    public void toStringTest() {
        Moon moon = new Moon("Moon", 229075, "Earth");
        assertEquals("Moon Earth 229075", moon.toString());
    }

}
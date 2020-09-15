package BaseEx;

import static java.lang.Math.abs;

public class Planet extends Orbital {

    public Planet() {
    }

    public Planet(String name, int distance, String target) {
        this.name = name;
        this.distanceFromTarget = distance;
        this.target = target;
    }

    public int howManyMoons() {
        return Moon.moonsAroundPlanet.get(getName());
    }

    public int distanceBetween(Planet otherPlanet) {
        int distance = otherPlanet.distanceFromTarget - getDistanceFromTarget();
        return abs(distance);
    }
}

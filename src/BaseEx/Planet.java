package BaseEx;

public class Planet extends Orbital {

    public Planet() {
    }

    public Planet(String name, int distance, String target) {
        this.name = name;
        this.distanceFromTarget = distance;
        this.target = target;
    }
}

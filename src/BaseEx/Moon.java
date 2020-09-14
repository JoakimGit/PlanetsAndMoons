package BaseEx;

public class Moon extends Orbital {

    public Moon() {
    }

    public Moon(String name, int distance, String target) {
        this.name = name;
        this.distanceFromTarget = distance;
        this.target = target;
    }
}

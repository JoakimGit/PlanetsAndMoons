package BaseEx;

import java.util.HashMap;
import java.util.Map;

public class Moon extends Orbital {

    static Map<String, Integer> moonsAroundPlanet = new HashMap<>();

    public Moon() {
    }

    public Moon(String name, int distance, String target) {
        this.name = name;
        this.distanceFromTarget = distance;
        this.target = target;
        int count = moonsAroundPlanet.getOrDefault(target, 0);
        moonsAroundPlanet.put(target, count + 1);
    }
}

package BaseEx;

import java.util.Objects;

public abstract class Orbital {
    String name;
    String target;
    int distanceFromTarget;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public int getDistanceFromSun() {
        return distanceFromTarget;
    }

    public void setDistanceFromSun(int distanceFromSun) {
        this.distanceFromTarget = distanceFromSun;
    }

    @Override
    public String toString() {
        return name + " " + target + " " + distanceFromTarget;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orbital orbital = (Orbital) o;
        return distanceFromTarget == orbital.distanceFromTarget &&
                getName().equals(orbital.getName()) &&
                getTarget().equals(orbital.getTarget());
    }
}

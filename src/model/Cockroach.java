package model;

public class Cockroach extends Insect{
    public Cockroach() {
        super(6, "Cockroach", true, false);
    }

    public Cockroach(int nrOfLegs, String name, boolean canFly, boolean isDangerous) {
        super(nrOfLegs, name, canFly, isDangerous);
    }
}

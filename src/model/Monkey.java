package model;

public class Monkey extends Mammal {
    public Monkey() {
        super(2, "Monkey", 34.5f, 72.0f);
    }

    public Monkey(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
        super(nrOfLegs, name, normalBodyTemp, percBodyHair);
    }
}

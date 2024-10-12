package model;

public class Cow extends Mammal{
    public Cow() {
        super(4, "Cow", 38.0f, 75.0f);
    }

    public Cow(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
        super(nrOfLegs, name, normalBodyTemp, percBodyHair);
    }
}

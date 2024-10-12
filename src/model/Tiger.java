package model;

public class Tiger extends Mammal{
    public Tiger() {
        super(4, "Tiger", 38.5f, 88.5f);
    }

    public Tiger(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair) {
        super(nrOfLegs, name, normalBodyTemp, percBodyHair);
    }
}

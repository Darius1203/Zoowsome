package model;

public class Crow extends Bird{
    public Crow(){
        super(2,"Crow",true,45);
    }

    public Crow(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude){
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }
}

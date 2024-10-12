package model;

public class Seagull extends Bird{
    public Seagull(){
        super(2,"Seagull",true,15);
    }

    public Seagull(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude){
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }
}

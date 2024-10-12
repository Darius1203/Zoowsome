package model;

public class Eagle extends Bird{
    public Eagle(){
        super(2,"Eagle",true,3048);
    }

    public Eagle(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude){
        super(nrOfLegs, name, migrates, avgFlightAltitude);
    }
}

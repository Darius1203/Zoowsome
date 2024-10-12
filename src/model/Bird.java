package model;

public abstract class Bird extends Animal {
    private boolean migrates;
    private int avgFlightAltitude;

    public Bird(int nrOfLegs, String name, boolean migrates, int avgFlightAltitude){
        super(nrOfLegs, name);
        this.migrates = migrates;
        this.avgFlightAltitude = avgFlightAltitude;
    }

    public boolean getMigrates(){
        return migrates;
    }

    public void setMigrates(boolean migrates){
        this.migrates = migrates;
    }

    public int getAvgFlightAltitude(){
        return avgFlightAltitude;
    }

    public void setAvgFlightAltitude(int avgFlightAltitude){
        this.avgFlightAltitude = avgFlightAltitude;
    }
}

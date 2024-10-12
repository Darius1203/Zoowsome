package model;

public class Frog extends Aquatic{
    public Frog(){
        super(4,"Frog",10, WaterType.FRESHWATER);
    }

    public Frog(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType){
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }
}

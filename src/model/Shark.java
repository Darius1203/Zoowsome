package model;

public class Shark extends Aquatic{
    public Shark(){
        super(0,"Shark",1680,WaterType.SALTWATER);
    }

    public Shark(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType){
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }
}

package model;

public class Goldfish extends Aquatic{
    public Goldfish(){
        super(0,"Goldfish",2,WaterType.FRESHWATER);
    }

    public Goldfish(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType){
        super(nrOfLegs, name, avgSwimDepth, waterType);
    }
}

package model;

public class Butterfly extends Insect{
    public Butterfly(){
        super(6,"Butterfly",true,false);
    }
    public Butterfly(int nrOfLegs, String name, boolean canFly, boolean isDangerous){
        super(nrOfLegs,name,canFly,isDangerous);
    }
}

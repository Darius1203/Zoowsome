package model;

public class Lizzard extends Reptile{
    public Lizzard(){
        super(4,"Lizzard",true);
    }

    public Lizzard(int nrOfLegs, String name, boolean laysEggs){
        super(nrOfLegs, name, laysEggs);
    }
}

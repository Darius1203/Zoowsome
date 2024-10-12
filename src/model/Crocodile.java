package model;

public class Crocodile extends Reptile{
    public Crocodile(){
        super(4,"Crocodile",true);
    }

    public Crocodile(int nrOfLegs, String name, boolean laysEggs){
        super(nrOfLegs, name, laysEggs);
    }
}

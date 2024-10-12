package model;

public class Snake extends Reptile{
    public Snake(){
        super(0,"Snake",true);
    }

    public Snake(int nrOfLegs, String name, boolean laysEggs) {
        super(nrOfLegs, name, laysEggs);
    }
}

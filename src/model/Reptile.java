package model;

public abstract class Reptile extends Animal{
    private boolean laysEggs;

    public Reptile(int nrOfLegs,String name, boolean laysEggs){
        super(nrOfLegs, name);
        this.laysEggs = laysEggs;
    }

    public boolean getLaysEggs(){
        return laysEggs;
    }

    public void setLaysEggs(boolean laysEggs)
    {
        this.laysEggs = laysEggs;
    }
}

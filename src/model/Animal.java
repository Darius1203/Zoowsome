package model;

public abstract class Animal {

    private int nrOfLegs;

    private String name;

    public Animal(int nrOfLegs, String name){
        this.name=name;
        this.nrOfLegs=nrOfLegs;
    }
    public String getName(){ return this.name; }

    public void setName(String name){ this.name = name; }

    public int getNrOfLegs(){ return this.nrOfLegs; }

    public void setNrOfLegs(int nrOfLegs){ this.nrOfLegs = nrOfLegs; }
}

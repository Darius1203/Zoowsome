package model;

public abstract class Mammal extends Animal{
   private float normalBodyTemp;
   private float percBodyHair;

    public Mammal(int nrOfLegs, String name, float normalBodyTemp, float percBodyHair){
        super(nrOfLegs, name);
        this.normalBodyTemp = normalBodyTemp;
        this.percBodyHair = percBodyHair;
    }

    public float getNormalBodyTemp(){
        return normalBodyTemp;
    }

    public void setNormalBodyTemp(float normalBodyTemp){
        this.normalBodyTemp = normalBodyTemp;
    }

    public float getPercBodyHair(){
        return percBodyHair;
    }

    public void setPercBodyHair(float percBodyHair){
        this.percBodyHair = percBodyHair;
    }
}

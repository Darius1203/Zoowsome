package model;

public abstract class Aquatic extends Animal {

    public enum WaterType{
        FRESHWATER, SALTWATER
    }
    private int avgSwimDepth;

    private WaterType waterType;

    public Aquatic(int nrOfLegs, String name, int avgSwimDepth, WaterType waterType){
        super(nrOfLegs, name);
        this.avgSwimDepth = avgSwimDepth;
        this.waterType = waterType;
    }

    public int getAvgSwimDepth() {
        return avgSwimDepth;
    }

    public void setAvgSwimDepth(int avgSwimDepth) {
        this.avgSwimDepth = avgSwimDepth;
    }

    public WaterType getWaterType() {
        return waterType;
    }

    public void setWaterType(WaterType waterType) {
        this.waterType = waterType;
    }
}

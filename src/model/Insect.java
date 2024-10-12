package model;

public abstract class Insect extends Animal {
    private boolean canFly;
    private boolean isDangerous;

    public Insect(int nrOfLegs, String name, boolean canFly, boolean isDangerous){
        super(nrOfLegs, name);
        this.canFly = canFly;
        this.isDangerous = isDangerous;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean getisDangerous() {
        return isDangerous;
    }

    public void setisDangerous(boolean isDangerous) {
        this.isDangerous = isDangerous;
    }
}

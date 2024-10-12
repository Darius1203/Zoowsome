package factory;

import model.*;

public class AquaticFactory extends SpeciesFactory{

    @Override
    public Animal getAnimal(String type){
        if(Constants.Animals.Aquatics.SHARK.equals(type)){
            return new Shark();
        } else if (Constants.Animals.Aquatics.GOLDFISH.equals(type)){
            return new Goldfish();
        } else if (Constants.Animals.Aquatics.FROG.equals(type)){
            return new Frog();
        } else {
            try {
                throw new Exception("Invalid animal exception!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}

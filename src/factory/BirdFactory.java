package factory;

import model.*;

public class BirdFactory extends SpeciesFactory{

    @Override
    public Animal getAnimal(String type){
        if(Constants.Animals.Birds.CROW.equals(type)){
            return new Crow();
        } else if (Constants.Animals.Birds.EAGLE.equals(type)){
            return new Eagle();
        } else if (Constants.Animals.Birds.SEAGULL.equals(type)){
            return new Seagull();
        } else {
            try {
                throw new Exception("Invalid animal exception!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}

package factory;

import model.*;

public class ReptileFactory extends SpeciesFactory{

    @Override
        public Animal getAnimal(String type){
        if(Constants.Animals.Reptiles.SNAKE.equals(type)){
            return new Snake();
        } else if (Constants.Animals.Reptiles.CROCODILE.equals(type)){
            return new Crocodile();
        } else if (Constants.Animals.Reptiles.LIZZARD.equals(type)){
            return new Lizzard();
        } else {
            try {
                throw new Exception("Invalid animal exception!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
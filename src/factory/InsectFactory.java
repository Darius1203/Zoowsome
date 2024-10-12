package factory;

import model.*;

public class InsectFactory extends SpeciesFactory{

    @Override
        public Animal getAnimal(String type){
        if(Constants.Animals.Insects.BUTTERFLY.equals(type)){
            return new Butterfly();
        } else if (Constants.Animals.Insects.COCKROACH.equals(type)){
            return new Cockroach();
        } else if (Constants.Animals.Insects.SPIDER.equals(type)){
            return new Spider();
        } else {
            try {
                throw new Exception("Invalid animal exception!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}
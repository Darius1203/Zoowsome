package factory;

import java.lang.Exception;

public class AnimalFactory {
    public SpeciesFactory getSpeciesFactory(String type){
        if(Constants.Species.MAMMALS.equals(type)){
            return new MammalFactory();
        } else if (Constants.Species.REPTILES.equals(type)){
            return new ReptileFactory();
        } else if (Constants.Species.BIRDS.equals(type)){
            return new BirdFactory();
        } else if (Constants.Species.INSECTS.equals(type)){
            return new InsectFactory();
        } else if (Constants.Species.AQUATICS.equals(type)){
            return new AquaticFactory();
        } else
            try {
                throw new Exception("Invalid species exception");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
    }
}

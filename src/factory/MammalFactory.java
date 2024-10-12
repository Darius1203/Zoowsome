package factory;

import model.Animal;
import model.Cow;
import model.Monkey;
import model.Tiger;

public class MammalFactory extends SpeciesFactory{

    @Override
        public Animal getAnimal(String type){
        if(Constants.Animals.Mammals.TIGER.equals(type)){
            return new Tiger();
        } else if (Constants.Animals.Mammals.COW.equals(type)){
            return new Cow();
        } else if (Constants.Animals.Mammals.MONKEY.equals(type)){
            return new Monkey();
        } else {
            try {
                throw new Exception("Invalid animal exception!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }

    }
}

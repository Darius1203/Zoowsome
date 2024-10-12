import factory.AnimalFactory;
import factory.Constants;
import factory.SpeciesFactory;
import model.*;

public class Main {
    public static void main(String[] args) {
            AnimalFactory abstractFactory = new AnimalFactory();
            SpeciesFactory birdSpeciesFactory=

                    abstractFactory.getSpeciesFactory(Constants.Species.BIRDS);

            Bird lylethecrow =
                    (Bird) birdSpeciesFactory.getAnimal(Constants.Animals.Birds.CROW);
            System.out.printf("We have a bird with %d legs, whose type is %s, does it migrate? %B, and it flies at %d meters!\n", lylethecrow.getNrOfLegs(),lylethecrow.getName(),lylethecrow.getMigrates(), lylethecrow.getAvgFlightAltitude());

        SpeciesFactory mammalSpeciesFactory=

                abstractFactory.getSpeciesFactory(Constants.Species.MAMMALS);

        Mammal lokithetiger =
                (Mammal) mammalSpeciesFactory.getAnimal(Constants.Animals.Mammals.TIGER);
        System.out.printf("We have a mammal with %d legs, whose type is %s, its body temperature is %f, and its body hair percentage is %f!\n", lokithetiger.getNrOfLegs(),lokithetiger.getName(),lokithetiger.getNormalBodyTemp(), lokithetiger.getPercBodyHair());

        SpeciesFactory insectSpeciesFactory=

                abstractFactory.getSpeciesFactory(Constants.Species.INSECTS);

        Insect spikethespider =
                (Insect) insectSpeciesFactory.getAnimal(Constants.Animals.Insects.SPIDER);
        System.out.printf("We have an insect with %d legs, whose type is %s, does it fly? %B, and is it dangerous? %B !\n", spikethespider.getNrOfLegs(),spikethespider.getName(),spikethespider.getCanFly(), spikethespider.getisDangerous());

        SpeciesFactory reptileSpeciesFactory=

                abstractFactory.getSpeciesFactory(Constants.Species.REPTILES);

        Reptile shakythesnake =
                (Reptile) reptileSpeciesFactory.getAnimal(Constants.Animals.Reptiles.SNAKE);
        System.out.printf("We have a reptile with %d legs, whose type is %s, does it lay eggs? %B\n", shakythesnake.getNrOfLegs(),shakythesnake.getName(),shakythesnake.getLaysEggs());

        SpeciesFactory aquaticSpeciesFactory=

                abstractFactory.getSpeciesFactory(Constants.Species.AQUATICS);

        Aquatic jawtheshark =
                (Aquatic) aquaticSpeciesFactory.getAnimal(Constants.Animals.Aquatics.SHARK);
        System.out.printf("We have an aquatic with %d legs, whose type is %s, it swims at %d meters depth, and it lives in %s !\n", jawtheshark.getNrOfLegs(),jawtheshark.getName(),jawtheshark.getAvgSwimDepth(), jawtheshark.getWaterType());
    }
}
package animals;

import animals.predators.Predators;
import animals.vegans.Vegans;

import java.util.LinkedList;
import java.util.List;

public class FoodChain {


    public static String checkFoodChain(List<Animal> list) {
        String predator = null;
        String vegans = null;

        for (Animal i : list) {
            if (i instanceof Predators) {
                predator = i.toString();
            }
            if (i instanceof Vegans) {
                vegans = i.toString();
            }
        }

        if (predator == null || vegans == null) {
            return "They can't eat each other.";
        } else
            return predator + " can eat " + vegans;

    }
}

package animals;

import animals.predators.*;
import animals.vegans.*;

import java.util.LinkedList;
import java.util.List;

import static animals.FoodChain.checkFoodChain;

public class AnimalsService {
    public static void main(String[] args) {
        List<Animal> list = new LinkedList<>();


        Animal animal1 = new Wolf("Wolf");
        Animal animal2 = new Rabbit("Rabbit");

        list.add(animal1);
        list.add(animal2);


        System.out.println(checkFoodChain(list));
    }
}

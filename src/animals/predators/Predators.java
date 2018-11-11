package animals.predators;

import animals.Animal;

public class Predators extends Animal {
    public Predators(String kind) {
        super(kind);
    }

    @Override
    public String toString() {
        return getKind();
    }
}

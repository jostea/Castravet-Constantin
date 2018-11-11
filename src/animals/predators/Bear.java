package animals.predators;

public class Bear extends Predators {
    public Bear(String kind) {
        super(kind);
    }
    @Override
    public String toString() {
        return getKind();
    }
}

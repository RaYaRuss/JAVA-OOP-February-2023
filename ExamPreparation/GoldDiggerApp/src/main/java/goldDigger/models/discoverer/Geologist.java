package goldDigger.models.discoverer;

public class Geologist extends BaseDiscoverer{

    private static final double STARTING_ENERGY = 100;

    public Geologist(String name) {
        super(name, STARTING_ENERGY);
    }
}

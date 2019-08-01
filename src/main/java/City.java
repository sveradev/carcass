public class City extends Region {

    private boolean coat;

    public City(Limit north, Limit west, Limit south, Limit east) {
        super(north, west, south, east);
    }

    public City(Limit north, Limit west, Limit south, Limit east, boolean coat) {
        super(north, west, south, east);
        this.coat = coat;
    }

    public boolean isCoat() {
        return coat;
    }
}

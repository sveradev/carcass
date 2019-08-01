public class Field extends Region{
    private Road road;

    public Field(Limit north, Limit west, Limit south, Limit east) {
        super(north, west, south, east);
    }

    public Field(Limit north, Limit west, Limit south, Limit east, Road road) {
        super(north, west, south, east);
        this.road = road;
    }

    public Road getRoad() {
        return road;
    }
}

public abstract class Region {

    private Limit north;
    private Limit west;
    private Limit south;
    private Limit east;

    public Region( Limit north,
                   Limit west,
                   Limit south,
                   Limit east){
        this.north = north;
        this.west = west;
        this.south = south;
        this.east = east;
    }

    public Limit getNorth() {
        return north;
    }

    public Limit getWest() {
        return west;
    }

    public Limit getSouth() {
        return south;
    }

    public Limit getEast() {
        return east;
    }
}
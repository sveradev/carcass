public abstract class Region {

    private String name;
    private Limit north;
    private Limit west;
    private Limit south;
    private Limit east;

    public Region(
            Limit north,
            Limit west,
            Limit south,
            Limit east){
        this.north = north;
        this.west = west;
        this.south = south;
        this.east = east;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Limit getNorth() {
        return north;
    }

    public void setNorth(Limit north) {
        this.north = north;
    }

    public Limit getWest() {
        return west;
    }

    public void setWest(Limit west) {
        this.west = west;
    }

    public Limit getSouth() {
        return south;
    }

    public void setSouth(Limit south) {
        this.south = south;
    }

    public Limit getEast() {
        return east;
    }

    public void setEast(Limit east) {
        this.east = east;
    }
}
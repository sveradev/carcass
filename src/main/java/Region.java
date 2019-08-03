public abstract class Region {

    private String name;
    private Limit north;
    private Limit west;
    private Limit south;
    private Limit east;

    public Region (){
    }

    public Region(
            String name,
            Limit north,
            Limit west,
            Limit south,
            Limit east){
        this.name = name;
        this.north = north;
        this.west = west;
        this.south = south;
        this.east = east;
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
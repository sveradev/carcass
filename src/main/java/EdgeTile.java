public class EdgeTile implements Limit {

    private Tile origin;
    private Tile destination;
    private Region region;

    public EdgeTile(Tile origin, Tile destination,Region region) {
        this.origin = origin;
        this.destination = destination;
        this.region = region;
    }

    public Tile getOrigin() {
        return origin;
    }

    public void setOrigin(Tile origin) {
        this.origin = origin;
    }

    public Tile getDestination() {
        return destination;
    }

    public void setDestination(Tile destination) {
        this.destination = destination;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Region splitRegion(Region region) {
        return null;
    }
}

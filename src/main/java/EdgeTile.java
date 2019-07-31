public class EdgeTile implements Limit {

    private Tile origin;
    private Tile destination;

    public EdgeTile(Tile origin, Tile destination) {
        this.origin = origin;
        this.destination = destination;
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

    public Region splitRegion(Region region) {
        return null;
    }
}

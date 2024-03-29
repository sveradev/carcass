import java.util.ArrayList;
import java.util.List;

public class Tile {

    private Region north;
    private Region west;
    private Region south;
    private Region east;
    private Region center;

    private List<EdgeTile> edges;

    public Tile(Region north, Region west, Region south, Region east, Region center){
        this.north = north;
        this.west = west;
        this.south = south;
        this.east = east;
        this.center = center;
    }

    public Region getNorth() {
        return north;
    }

    public Region getWest() {
        return west;
    }

    public Region getSouth() {
        return south;
    }

    public Region getEast() {
        return east;
    }

    public Region getCenter() {
        return center;
    }

    public List<EdgeTile> getEdges() {
        return edges;
    }

    public void addEdge(EdgeTile edge) {
        if (edges == null) {
            edges = new ArrayList<EdgeTile>();
        }
        edges.add(edge);
    }
}
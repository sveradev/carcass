import java.util.List;

public class Tile {

    private Region north;
    private Region west;
    private Region south;
    private Region east;
    private Region center;
    List<EdgeTile> edges;

    public Tile(Region north,
                Region west,
                Region south,
                Region east,
                Region center){
        this.north = north;
        this.west = west;
        this.south = south;
        this.east = east;
        this.center = center;
    }
}
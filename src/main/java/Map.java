import java.util.ArrayList;
import java.util.List;

public class Map {

    private Tile startTile;
    private List<Tile> tiles;

    public Map(Tile startTile){
        this.startTile = startTile;
    }

    public Tile getStartTile() {
        return startTile;
    }

    public void setStartTile(Tile startTile) {
        this.startTile = startTile;
    }

    public void addTile(Tile tile) {
        if (tiles == null) {
            tiles = new ArrayList<Tile>();
        }
        tiles.add(tile);
    }

    public List<Tile> getTiles() {
        return tiles;
    }

    @Override
    public String toString() {
        return "Map [tiles=" + tiles + "]";
    }
}

import java.util.ArrayList;
import java.util.List;

public class Map {

    private List<Tile> tiles;

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

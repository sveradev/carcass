import java.util.ArrayList;
import java.util.List;

public class Rules {

    public final int MAX_PLAYERS = 5;
    private Tile startTile;
    private List<Tile> tiles;

    public Rules() {
        this.startTile = new Tile(0, new City(null,new Wall(),new Wall(),new Wall()), new Road(), new Field(), new Road());
        this.tiles = createTiles();
    }

    public Tile getStartTile() {
        return startTile;
    }

    public void setStartTile(Tile startTile) {
        this.startTile = startTile;
    }

    public List<Tile> getTiles() {
        return tiles;
    }

    public void setTiles(List<Tile> tiles) {
        this.tiles = tiles;
    }

    public void addTile(Tile tile) {
        if (tiles == null) {
            tiles = new ArrayList<Tile>();
        }
        this.tiles.add(tile);
    }

    public List<Tile> createTiles(){
        Region field = new Field();
        Region road = new Road();
        Region city = new City();
        Region monasterie = new Monasterie();
        List<Tile> tiles = new ArrayList<Tile>();
        return tiles;
    }
}

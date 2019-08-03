import java.util.ArrayList;
import java.util.List;

public class Game {

    private List<Player> players;
    private Map map;
    private List<Tile> tiles;
    private Rules Rules;
    private int round;

    public Game(Rules rules,List<Player> players){
        this.players = players;
        this.tiles = rules.getTiles();
        this.map = new Map(rules.getStartTile());
    }

    public List<Player> getPlayess() {
        return players;
    }

    public void setGamers(List<Player> players) {
        this.players = players;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
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
}

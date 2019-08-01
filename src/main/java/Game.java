import java.util.List;

public class Game implements Expansion {

    private List<Gamer> gamers;
    private Map map;
    private List<Tile> tiles;

    public Game(List<Gamer> gamers,List<Tile> tiles){
        this.gamers = gamers;
        this.tiles = tiles;
    }

    public List<Gamer> getGamers() {
        return gamers;
    }

    public void setGamers(List<Gamer> gamers) {
        gamers = gamers;
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
}

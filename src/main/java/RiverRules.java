import java.util.ArrayList;
import java.util.List;

public class RiverRules extends Rules {

    private final Tile START_TILE = new Tile(new Field(), new Field(), new River(), new Field(), new Field());
    private final List<Tile> TILES = createTiles();
    private final Tile END_TILE = new Tile(new River(), new Field(), new Field(), new Field(),new Field());

    public RiverRules(Tile startTile) {
        super(startTile);
        List<Tile> tiles = new ArrayList<Tile>();
        for (Tile tile : TILES ){
            tiles.add(tile);
        }
        tiles.add(END_TILE);
        tiles.addAll(super.getTiles());
    }

    public List<Tile> createTiles(){
        Region field = new Field();
        Region river = new River();
        Region city = new City(null,null,null,null);
        Region monastery = new Monastery();
        Region road = new Road();

        List<Tile> tiles = new ArrayList<Tile>();

        tiles.add(new Tile(field,river,field,river,river));
        tiles.add(new Tile(field,river,river,field,river));
        tiles.add(new Tile(road,river,river,road,field));
        tiles.add(new Tile(city,city,river,river,field));
        tiles.add(new Tile(field,river,road,river,monastery));
        tiles.add(new Tile(field,river,field,river,river));
        tiles.add(new Tile(field,field,river,river,field));
        tiles.add(new Tile(city,river,road,river,road));
        tiles.add(new Tile(city,river,city,river,river));
        tiles.add(new Tile(road,river,road,river,road));

        return tiles;
    }
}

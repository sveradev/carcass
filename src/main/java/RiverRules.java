import sun.plugin.javascript.navig4.Link;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class RiverRules extends Rules {

    private final Tile START_TILE = new Tile(0, new Field(), new Field(), new River(), new Field(), new Field());
    private final List<Tile> TILES = createTiles();
    private final Tile END_TILE = new Tile(11, new River(), new Field(), new Field(), new Field(),new Field());

    public RiverRules() {
        super.setStartTile(START_TILE);
        List<Tile> tiles = new ArrayList<Tile>();
        for (Tile tile : TILES ){
            tiles.add(tile);
        }
        tiles.add(END_TILE);
        tiles.addAll(super.getTiles());
    }

    private List<Tile> createTiles(int order){
        Region field = new Field();
        Region river = new River();
        Region city = new City();
        Region monasterie = new Monasterie();
        Region road = new Road();

        Tile tile_1 = new Tile(field,river,field,river,river);
        Tile tile_2 = new Tile(field,river,river,field,river);
        Tile tile_3 = new Tile(road,river,river,road,field);
        Tile tile_4 = new Tile(city.s



        )

        List<Tile> tiles =
        return tiles;
    }
}

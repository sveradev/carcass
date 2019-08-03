public class Carcass {
    public static Map getMap() {


        Region field = new Field()

        Tile tileStart = new Tile(0);
        Tile nextTile = new Tile(0);

        tileStart.addEdge(new EdgeTile(tileStart,nextTile,tileStart.get));


        Map map = new Map(tileStart);
        map.addTile(nextTile);
        return map;
    }

    public static void main(String[] args) {
        Map map = getMap();
        System.out.println(map);
    }
}


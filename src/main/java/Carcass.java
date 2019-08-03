public class Carcass {
    public static Map getMap() {


        Region field = new Field();
        Region city = new City(null,null,null,null);
        Region road = new Road();

        Tile tileStart = new Tile(city,road,field,road,road);
        Tile nextTile = new Tile(field,road,field,road,road);

        tileStart.addEdge(new EdgeTile(tileStart,nextTile,tileStart.getWest()));


        Map map = new Map(tileStart);
        //map.addTile(nextTile);
        return map;
    }

    public static void main(String[] args) {
        Map map = getMap();
        System.out.println(map);
    }
}


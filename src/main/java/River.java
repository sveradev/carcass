public class River extends Field implements Limit {

    public final String START = "tributary";
    public final String END = "lake";

    public Region splitRegion(Region region) {
        return new Field();
    }
}

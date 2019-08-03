public class City extends Region implements Available {

    private final String NAME = "CITY";
    private final int POINTS = 2;
    private boolean coat = false;
    private Follower follower;
    private boolean available;

    public City(Limit north, Limit west, Limit south, Limit east) {
        super(north, west, south, east);
        super.setName(NAME);
    }

    public City(Limit north, Limit west, Limit south, Limit east, boolean coat) {
        super(north, west, south, east);
        super.setName(NAME);
        this.coat = coat;
    }

    public boolean isCoat() {
        return coat;
    }

    public Follower getFollower() {
        return follower;
    }

    public void setFollower(Follower follower) {
        this.follower = follower;
    }

    public int getPoints() {
        return POINTS;
    }

    public boolean isAvailable() {
        return available;
    }
}

public class City extends Region implements Available {

    private final int POINTS = 2;
    private boolean coat = false;
    private Follower follower;

    public City(){
    }

    public City(Limit north, Limit west, Limit south, Limit east) {
        super(north, west, south, east);
    }

    public City(Limit north, Limit west, Limit south, Limit east, boolean coat) {
        super(north, west, south, east);
        this.coat = coat;
    }

    public boolean isCoat() {
        return coat;
    }

    public Follower getFollower() {
        return null;
    }

    public void setFollower(Follower follower) {
        this.follower = follower;
    }

    public int getPoints() {
        return POINTS;
    }

    public boolean isAvailable() {
        return false;
    }
}

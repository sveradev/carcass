public class Field extends Region implements Available{
    private Road road;
    private final int POINTS = 1;
    private Follower follower;
    private boolean available;

    public Field(Limit north, Limit west, Limit south, Limit east) {
        super(north, west, south, east);
    }

    public Field(Limit north, Limit west, Limit south, Limit east, Road road) {
        super(north, west, south, east);
        this.road = road;
    }

    public Road getRoad() {
        return road;
    }

    public int getPoints() {
        return POINTS;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public Follower getFollower() {
        return follower;
    }

    public void setFollower(Follower follower) {
        this.follower = follower;
    }
}

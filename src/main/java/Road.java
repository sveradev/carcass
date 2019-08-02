public class Road implements Available {

    private final int POINTS = 1;
    private Follower follower;
    private boolean available;

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

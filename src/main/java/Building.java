public class Building extends Region implements Available{

    private int points;
    private Tile basement;
    private boolean available;
    private Follower follower;

    public int getPoints() {
        return points;
    }

    public boolean isAvailable() {
        return false;
    }

    public Follower getFollower() {
        return null;
    }

    public void setFollower(Follower follower) {

    }
}

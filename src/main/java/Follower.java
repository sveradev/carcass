public class Follower {
    private int rank;
    private int points;
    private Player player;

    public Follower(Player player){
        this.player = player;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public Player getGamer() {
        return player;
    }
}

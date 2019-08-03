public class Follower {
    private int rank;
    private int points;
    private Gamer gamer;

    public Follower(Gamer gamer){
        this.gamer = gamer;
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

    public Gamer getGamer() {
        return gamer;
    }
}

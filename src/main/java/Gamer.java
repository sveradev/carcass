import java.util.ArrayList;
import java.util.List;

public class Gamer {

    private String name;
    private String color;
    private List<Follower> followers;

    public List<Follower> getFollowers() {
        return followers;
    }

    public void setFollowers(List<Follower> followers) {
        this.followers = followers;
    }

    public void addFollower(Follower follower){
        if (followers == null) {
            followers = new ArrayList<Follower>();
        }
        followers.add(follower);
    }
}

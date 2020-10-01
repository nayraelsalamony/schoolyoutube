package Model;

public class Channel {
    private int channelId;
    private String channelName;
    private String channelInstractorName;
    private String channelLink;
    private String channelCoursesName;
    private String channelRate;

    public void setChannelId(int channelId) {
        this.channelId = channelId;
    }

    public void setChannelName(String channelName) {
        this.channelName = channelName;
    }

    public void setChannelInstractorName(String channelInstractorName) {
        this.channelInstractorName = channelInstractorName;
    }

    public void setChannelLink(String channelLink) {
        this.channelLink = channelLink;
    }

    public void setChannelCoursesName(String channelCoursesName) {
        this.channelCoursesName = channelCoursesName;
    }

    public void setChannelRate(String channelRate) {
        this.channelRate = channelRate;
    }

    public int getChannelId() {
        return channelId;
    }

    public String getChannelName() {
        return channelName;
    }

    public String getChannelInstractorName() {
        return channelInstractorName;
    }

    public String getChannelLink() {
        return channelLink;
    }

    public String getChannelCoursesName() {
        return channelCoursesName;
    }

    public String getChannelRate() {
        return channelRate;
    }

    @Override
    public String toString() {
        return "Channel{" +
                "channelId='" + channelId + '\'' +
                ", channelName='" + channelName + '\'' +
                ", channelInstractorName='" + channelInstractorName + '\'' +
                ", channelLink='" + channelLink + '\'' +
                ", channelCoursesName='" + channelCoursesName + '\'' +
                ", channelRate=" + channelRate +
                '}';







    }
}


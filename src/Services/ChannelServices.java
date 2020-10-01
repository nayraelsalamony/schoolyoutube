package Services;

import Model.Channel;

public interface ChannelServices {
    public void addChannel(Channel channel);
    public void deleteChannel(Channel channel);
    public void updateChannel(Channel channel);
    public void ShowChannel();
    public void SearchChannel(String channelName);
    public Channel getTopRatedChannel();
    public int getNumberOfCourses();
}

package Model;

public class History {
    private int historyId;
    private int historyStidentId;
    private int historyChannelId;
    private int historyCoursesId;
    private int channelRate;
    private int StudentDegree;

    public void setHistoryId(int historyId) {
        this.historyId = historyId;
    }

    public void setHistoryStidentId(int historyStidentId) {
        this.historyStidentId = historyStidentId;
    }

    public void setHistoryChannelId(int historyChannelId) {
        this.historyChannelId = historyChannelId;
    }

    public void setHistoryCoursesId(int historyCoursesId) {
        this.historyCoursesId = historyCoursesId;
    }

    public void setChannelRate(int channelRate) {
        this.channelRate = channelRate;
    }

    public void setStudentDegree(int studentDegree) {
        StudentDegree = studentDegree;
    }

    public int getHistoryId() {
        return historyId;
    }

    public int getHistoryStidentId() {
        return historyStidentId;
    }

    public int getHistoryChannelId() {
        return historyChannelId;
    }

    public int getHistoryCoursesId() {
        return historyCoursesId;
    }

    public int getChannelRate() {
        return channelRate;
    }

    public int getStudentDegree() {
        return StudentDegree;
    }

    @Override
    public String toString() {
        return "History{" +
                "historyId=" + historyId +
                ", historyStidentId=" + historyStidentId +
                ", historyChannelId=" + historyChannelId +
                ", historyCoursesId=" + historyCoursesId +
                ", channelRate=" + channelRate +
                ", StudentDegree=" + StudentDegree +
                '}';
    }
}

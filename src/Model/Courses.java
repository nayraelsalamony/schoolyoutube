package Model;

public class Courses {
    private int coursesId;
    private String coursesName;
    private String coursesLevel;
    private int coursesPrice;

    public void setCoursesId(int coursesId) {
        this.coursesId = coursesId;
    }

    public void setCoursesName(String coursesName) {
        this.coursesName = coursesName;
    }

    public void setCoursesLevel(String coursesLevel) {
        this.coursesLevel = coursesLevel;
    }

    public void setCoursesPrice(int coursesPrice) {
        this.coursesPrice = coursesPrice;
    }

    public int getCoursesId() {
        return coursesId;
    }

    public String getCoursesName() {
        return coursesName;
    }

    public String getCoursesLevel() {
        return coursesLevel;
    }

    public int getCoursesPrice() {
        return coursesPrice;
    }

    @Override
    public String toString() {
        return "Courses{" +
                "coursesId='" + coursesId + '\'' +
                ", coursesName='" + coursesName + '\'' +
                ", coursesLevel='" + coursesLevel + '\'' +
                ", coursesPrice=" + coursesPrice +
                '}';





    }
}

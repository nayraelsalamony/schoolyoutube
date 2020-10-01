package Services;

import Model.Courses;

public interface CoursesServices{
    public void addCourses(Courses courses);
    public void deleteCourses(Courses courses);
    public void updateCourses(Courses courses);
    public void ShowCourses();
    public int GetNumberOfChannelTakeCourses();
    public void searchCourse(String coursename);//order by channelrate
}

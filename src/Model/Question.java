package Model;

public class Question {
    private int questionId;
    private String questionSiteName;
    private int  coursesId;
    private int  testDegree;

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public void setQuestionSiteName(String questionSiteName) {
        this.questionSiteName = questionSiteName;
    }

    public void setCoursesId(int coursesId) {
        this.coursesId = coursesId;
    }

    public void setTestDegree(int testDegree) {
        this.testDegree = testDegree;
    }

    public int getQuestionId() {
        return questionId;
    }

    public String getQuestionSiteName() {
        return questionSiteName;
    }

    public int getCoursesId() {
        return coursesId;
    }

    public int getTestDegree() {
        return testDegree;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionId=" + questionId +
                ", questionSiteName='" + questionSiteName + '\'' +
                ", coursesId=" + coursesId +
                ", testDegree=" + testDegree +
                '}';
    }
}

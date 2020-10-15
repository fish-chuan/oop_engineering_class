package oop_1015;

public class Teacher {
    String tName;
    private String email;
    Course[] courses = new Course[10];
    int courseCount = 0;

    public Teacher(String tName) {
        this.tName = tName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void offer(Course c) {
        if (courseCount < 10) {
            courses[courseCount++] = c;

        }
    }

    public void showCourse() {
        for (Course c: courses) {
            if (c != null)
                System.out.println(c.cName);
            else
                break;
        }
    }

    public void score(Course c, Student s, int g) { //++++++++++
        if (offeredByMe(c) && c.takenBy(s)) {
            c.score(s, g);
        }
    }

    private boolean offeredByMe(Course c) {
        for (int i=0; i<courseCount; i++) {
            if (courses[i] == c) {
                return true;
            }
        }
        return false;
    }

}

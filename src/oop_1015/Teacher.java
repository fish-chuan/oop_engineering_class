package oop_1015;

class Teacher extends Member implements Instructor {
    Course[] courses = new Course[10];
    int courseCount = 0;
    Qualification qualification;

    public Teacher(String tName) {
        super(tName);
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

    @Override
    public void setQualification(Qualification q) {
        this.qualification = q;
    }

    @Override
    public void showQualification() {
        System.out.println(name + " is a teacher because " + qualification);
    }
}

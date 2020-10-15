package oop_1015;

public class Student extends Member {
    Course[] courses = new Course[10];
    int courseCount = 0;


    public Student(String sName) {
        super(sName);
    }

    public void takeCourse(Course c) {
        if (courseCount <=9) {
            courses[courseCount++] = c;
            c.registeredBy(this);
        }
        else
            System.out.println("Hei, you take too many courses");
    }
    public void showGrade() { //++++++++++
        System.out.println("The grades of student " + name);
        for (int i=0; i<courseCount; i++) {
            Course c = courses[i];
            String gString = "no grade";
            int g = c.getGrade(this);
            if (g != -1) gString = Integer.toString(g);
            System.out.println("-- " + c.cName + ": " + gString);
        }
    }

}

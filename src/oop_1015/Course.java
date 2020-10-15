package oop_1015;

public class Course {
    String cName;
    private int degree;
    Student[] students = new Student[10];
    int studentCount = 0;
    Teacher teacher = new Teacher("None");
    int[] grades = new int[10];

    public Course(String cName, int degree) {
        this.cName = cName;
        this.degree = degree;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public boolean takeBy(Student s) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i] == s) {
                return true;
            }
        }
        return  false;
    }

    public void showCourseInfo() { //**********
        System.out.println("Course: "+ cName);
        System.out.println("-- Teacher: " + teacher.tName);
        StringBuilder s = new StringBuilder();
        StringBuilder g = new StringBuilder();
        for (int i=0; i<studentCount ; i++) {
            s.append(students[i].sName).append(", ");
            g.append(Integer.toString(grades[i])).append(", ");
        }
        System.out.println("-- Students: " + s);
        System.out.println("-- Grades: " + g);
    }

    public void registeredBy(Student s) {
        if (studentCount < 10) {
            students[studentCount++] = s;
        } else {
            System.out.println("Student full in class");
        }
    }

    public void score(Student s, int g) {
        int idx = getIndex(s);
        if (idx == -1) {
            System.out.println(s.sName + " is not in " + cName);
        } else {
            grades[idx] = g;
        }
    }

    private int getIndex(Student s) {
        for (int i = 0; i < studentCount; i++) {
            if (students[i] == s) {
                return i;
            }
        }
        return -1;
    }

    public int getGrade(Student s) {
        int idx = getIndex(s);
        if ((idx != -1)) {

            return grades[idx];
        }
        return  idx;
    }

    public boolean takenBy(Student s) {
        for (int i=0; i<studentCount ; i++) {
            if (students[i] == s) {
                return true;
            }
        }
        return false;
    }
}

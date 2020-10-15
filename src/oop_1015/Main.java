package oop_1015;

public class Main {

    public static void main(String[] args) {
        Student Jie = new Student ("Jie");
        Student Albert = new Student ("Albert");

        Teacher Nick = new Teacher ("Nick");

        Course Java = new Course ("Java", 3);
        Course Python = new Course ("Python", 3);

        Nick.offer(Java);
        Nick.offer(Python);

        Jie.takeCourse(Java);
        Albert.takeCourse(Java);

        Nick.score(Java, Jie, 100); //++++++++++
        Nick.score(Java, Albert, 98); //++++++++++
        Java.showCourseInfo(); //++++++++++
        Jie.showGrade(); //++++++++++
        Albert.showGrade();
    }
}

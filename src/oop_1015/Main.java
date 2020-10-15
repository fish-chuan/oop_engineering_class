package oop_1015;

public class Main {

    public static void main(String[] args) {
        Student Jie = new Student ("Jie");
        Student Albert = new Student ("Albert");
        Student Alex = new Student ("Alex");

        Teacher Nick = new Teacher ("Nick");

        IndustryExpert Peter = new IndustryExpert("Peter"); //++++++++++
        Nick.setQualification(new Qualification("IECS Ph.D")); //++++++++++
        Peter.setQualification(new Certification(2000, "Cisco")); //++++++++++
        Instructor tutors[] = {(Instructor)Nick, (Instructor)Peter}; //++++++++++
        System.out.println("\n=== INSTRUCTORS QUALIFICATION ==="); //++++++++++

        for (Instructor i: tutors)
            i.showQualification();

        Albert.setEmail("albert@gmail.com");
        Jie.setEmail("jie@gmail.com");
        Nick.setEmail("nick@gmail.com");

        Member[] members = {Albert, Jie, Nick};
        System.out.println("\n=== MEMBERS ==="); //++++++++++
        for (Member m: members)
            m.showInfo();

        Course Java = new Course ("Java", 3);
        Course Python = new Course ("Python", 3);

        Nick.offer(Java);
        Nick.offer(Python);

        Jie.takeCourse(Java);
        Albert.takeCourse(Java);
        Alex.takeCourse(Java);

        Nick.score(Java, Jie, 100);
        Nick.score(Java, Albert, 98);
        Nick.score(Java, Alex, 20);

        Course[] courses = {Java, Python};
        showCourses(courses);

    }

    public static void showCourses(Course[] courses) { //++++++++++
        System.out.println("\n=== COURSES ===");
        for (Course c: courses)
            c.showCourseInfo();
    }
}

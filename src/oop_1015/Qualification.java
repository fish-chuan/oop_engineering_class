package oop_1015;

public class Qualification {
    String description;
    public Qualification(String desc) {
        this.description = desc;
    }
    public String toString() {
        return description;
    }
}

class Certification extends Qualification { //++++++++++
    public Certification(int year, String desc) {
        super(desc + " " + Integer.toString(year));
    }
}

class IndustryExpert implements Instructor { //++++++++++
    Qualification q;
    String name;
    public IndustryExpert(String name) {
        this.name = name;
    }
    public void setQualification(Qualification q) {
        this.q = q;
    }
    public void showQualification() {
        System.out.println(name + " is qualified to be an instructor because " + q);
    }
}

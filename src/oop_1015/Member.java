package oop_1015;

public abstract class Member {
    String name;
    private String email;
    public Member(String name) {
        this.name = name;
    }
    public void setEmail(String e) {
        this.email = e;
    }
    public void showInfo() { //++++++++++
        System.out.println(name + ", email: " + email);
    }
}

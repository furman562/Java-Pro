package Homework2;

public class Employee {
    private String fullName;
    private String position;
    private String email;
    private int phoneNumber;
    private int age;

    public Employee(String fullName, String position, String email, int phoneNumber, int age) {
        this.fullName = fullName;
        this.position = position;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
    }


    String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}






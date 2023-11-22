package Homework2;

public class FirstEmployee {
    public static void main(String[] args) {
        Employee FirstEmployee = new Employee("Tom", "designer", "tomford@gmail.com", 188888800, 62);
        FirstEmployee.setFullName("Tom Ford ");
        String FullName = FirstEmployee.getFullName();
        System.out.println("Значення ФІО " + FullName);
        FirstEmployee.setPosition("businessman ");
        String Profession  = FirstEmployee.getPosition();
        System.out.println("Значення посади "+ Profession);

    }
}

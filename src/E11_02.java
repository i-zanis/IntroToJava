public class E11_02 {
    public static void main(String[] args) {

    }
}
class Person {
    private String name;
    private String address;
    private int phoneNumber;
    private String email;

    @Override
    public String toString() {
        return "Person: " + name;
    }
}

class Student extends Person {
    private String status;
    public static int FRESHMAN = 1;
    public static int SOPHOMORE = 2;
    public static int JUNIOR = 3;
    public static int SENIOR = 4;
}
class Employee extends Person {
    private double salary;
    private String office;
    private java.util.Date dateCreated;
}
class Faculty extends Employee {
   private double hours;
   private String rank;
}
class Staff extends Employee {
    private String title;
}


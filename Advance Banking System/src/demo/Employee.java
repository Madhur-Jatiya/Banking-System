package demo;

public class Employee {

    private String name;
    private String mobileNumber;
    private String emailId;
    private int age;
    private double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + ", " + mobileNumber + ", " + emailId + ", " + age + ", " + salary;
    }

    public Employee() {
    }

    public Employee(String name, String mobileNumber, String emailId, int age, double salary) {
        this.name = name;
        this.mobileNumber = mobileNumber;
        this.emailId = emailId;
        this.age = age;
        this.salary = salary;
    }

}

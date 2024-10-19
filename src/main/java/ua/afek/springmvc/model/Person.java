package ua.afek.springmvc.model;

public class Person {

    private int id;
    private final String name;
    private final int age;
    private String ssn;
    private int salary;

    public Person(int id, String name, int age, String ssn, int salary) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.ssn = ssn;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", ssn='" + ssn + '\'' +
                ", salary=" + salary +
                '}';
    }
}

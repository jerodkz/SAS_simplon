package exercices.lifeschool;

/**
 * Created by jerome on 20/01/17.
 */

import java.time.LocalDate;

public class Student {

    private String firstName;
    private String name;
    private LocalDate birth;
    private int age;

    public Student(String firstName, String name, LocalDate birth, int age) {
        this.firstName = firstName;
        this.name = name;
        this.birth = birth;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getName() {
        return name;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return  firstName + ", " + name + ", " + birth +", " + age+ " ans";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Student student = (Student) o;

        if (age != student.age) return false;
        if (firstName != null ? !firstName.equals(student.firstName) : student.firstName != null) return false;
        if (name != null ? !name.equals(student.name) : student.name != null) return false;
        return birth != null ? birth.equals(student.birth) : student.birth == null;
    }

    @Override
    public int hashCode() {
        int result = firstName != null ? firstName.hashCode() : 0;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (birth != null ? birth.hashCode() : 0);
        result = 31 * result + age;
        return result;
    }
}
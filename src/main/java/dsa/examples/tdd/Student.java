package dsa.examples.tdd;
import java.util.Random;

public class Student {
    public String name;
    public int age;
    public String id;
    private Object hashCode;

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setId(String id) {
        this.id = id;
    }

    public Student(String name, int age, String id) {
        this.name = name;
        this.age = age;
        this.id = id;
    }


    @Override
    public int hashCode() {
        return id.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.id.equals(((Student)obj).getId());
    }
}

package dsa.examples.tdd;

import java.util.*;

/**
 * Hello world!
 */
public class StudentManager {

    List<Student> studentList = new ArrayList<>();

    public void addStudent(Student student){
        this.studentList.add(student);
    }

    public void removeStudent(String id){

        for(Student student : studentList){
            if (student.id.equals(id))
                studentList.remove(student)   ;
        }
    }

    public Student findStudent(String id) {
        for (Student student : studentList) {
            if (student.id.equals(id)) {
                return student;
            }
        }
        return null;
    }

    public List getAllStudents(){
        return this.studentList;
    }

    public static void main(String[] args) {

    }
}

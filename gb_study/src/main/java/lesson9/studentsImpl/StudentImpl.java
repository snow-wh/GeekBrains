package lesson9.studentsImpl;

import lesson9.student.Course;
import lesson9.student.Student;

import java.util.List;

public class StudentImpl implements Student {

    private String name;
    private List<Course> courses;

    public StudentImpl(String name, List<Course> courses){
        this.name = name;
        this.courses=courses;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Course> getAllCourses() {
        return courses;
    }
}

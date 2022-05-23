package lesson9.studentsImpl;

import lesson9.student.Course;
import lesson9.student.Student;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudMain {

    public static void main(String[] args) {

        Course courseMath = new CourseImpl("math");
        Course coursePI = new CourseImpl("program engineer");
        Course coursePhysics = new CourseImpl("physics");
        Course courseChemistry = new CourseImpl("chemistry");
        Course courseGym = new CourseImpl("gym");
        Course courseNoName = new CourseImpl("noName");

        Student student1 = new StudentImpl("Name1", Arrays.asList(courseMath,coursePhysics,coursePI,courseChemistry));
        Student student2 = new StudentImpl("Name2", Arrays.asList(courseGym,coursePhysics,courseChemistry));
        Student student3 = new StudentImpl("Name3", Arrays.asList(courseChemistry,courseGym,coursePI));
        Student student4 = new StudentImpl("Name4", Arrays.asList(courseMath,coursePhysics,coursePI));
        Student student5 = new StudentImpl("Name5", Arrays.asList(courseMath,coursePhysics,courseGym,courseChemistry));

        courseStudent(Stream.of(student1,student2,student3,student4,student5),courseGym )
                .forEach(student -> System.out.println(student.getName() + " записаны на курс " + courseGym.courseName()));

    }

    public static List<Student> courseStudent(Stream<Student> studentStream, Course course){
        return studentStream
                .filter(student -> student.getAllCourses().contains(course))
                .collect(Collectors.toList());
    }

    public static List<Student> courseStudent2(Stream<Student> studentStream, Course course){
        return studentStream
                .filter(new Predicate<Student>() {
                    @Override
                    public boolean test(Student student) {
                        return student.getAllCourses().contains(course);
                    }
                })
                .collect(Collectors.toList());
    }

    public static List<Student> smartestStudent(Stream<Student> studentStream){

        Comparator<Student> studentComparator = Comparator.comparingInt(student -> student.getAllCourses().size());

        return studentStream
                .sorted(studentComparator.reversed())
                .limit(3)
                .collect(Collectors.toList());
    }

    // Stream<Student>
    // List<Stream<Course>>
    // List<List<Course>>

    public static List<Course> uniqueCourse(Stream<Student> studentStream){
        return studentStream
                .map(Student::getAllCourses)
                .flatMap(courses -> courses.stream())
                .distinct()
                .collect(Collectors.toList());
    }

}

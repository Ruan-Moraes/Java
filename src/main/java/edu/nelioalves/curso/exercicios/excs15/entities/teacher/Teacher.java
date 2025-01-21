package edu.nelioalves.curso.exercicios.excs15.entities.teacher;

import edu.nelioalves.curso.exercicios.excs15.entities.course.Course;
import edu.nelioalves.curso.exercicios.excs15.entities.student.Student;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Teacher {
    private String name;
    private int totalStudents = 0;
    private final Set<Course> courses = new HashSet<>();
    private final Set<Student> students = new HashSet<>();

    public Teacher(String name) {
        this.name = name;
    }

    public void addCourse(Course course) {
        courses.add(course);

        course.addTeacher(this);

        mapStudents();
    }

    private void mapStudents() {
        for (Course course : courses) {
            students.addAll(course.getStudents());
        }

        totalStudents = students.size();
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Teacher teacher = (Teacher) o;
        return Objects.equals(name, teacher.name);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStudents() {
        return "O Professor " + name + " tem " + totalStudents + " alunos e são eles: " + students;
    }
}

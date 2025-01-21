package edu.nelioalves.curso.exercicios.excs15.entities.student;

import edu.nelioalves.curso.exercicios.excs15.entities.course.Course;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Student {
    private int id;
    private String name;
    private final Set<Course> courses = new HashSet<>();

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void addCourse(Course course) {
        courses.add(course);

        course.addStudent(this);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return id == student.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

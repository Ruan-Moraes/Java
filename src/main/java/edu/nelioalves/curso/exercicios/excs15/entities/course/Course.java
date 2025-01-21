package edu.nelioalves.curso.exercicios.excs15.entities.course;

import edu.nelioalves.curso.exercicios.excs15.entities.student.Student;
import edu.nelioalves.curso.exercicios.excs15.entities.teacher.Teacher;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Course {
    private String name;
    private final Set<Teacher> teachers = new HashSet<>();
    private final Set<Student> students = new HashSet<>();

    public Course(String name) {
        this.name = name;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public String toString() {
        return "Course{" +
                "name='" + name + '\'' +
                ", teachers=" + teachers +
                ", students=" + students +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Course course = (Course) o;
        return Objects.equals(name, course.name);
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

    public Set<Student> getStudents() {
        return students;
    }
}

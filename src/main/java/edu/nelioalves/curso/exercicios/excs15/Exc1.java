package edu.nelioalves.curso.exercicios.excs15;

import edu.nelioalves.curso.exercicios.excs15.entities.course.Course;
import edu.nelioalves.curso.exercicios.excs15.entities.student.Student;
import edu.nelioalves.curso.exercicios.excs15.entities.teacher.Teacher;

public class Exc1 {
    public static void main(String[] args) {
        Course course1 = new Course("Java");
        Course course2 = new Course("Python");
        Course course3 = new Course("JavaScript");

        Student student1 = new Student(1, "Alex");
        Student student2 = new Student(2, "Bob");
        Student student3 = new Student(3, "Maria");
        Student student4 = new Student(4, "Anna");
        Student student5 = new Student(5, "John");
        Student student6 = new Student(6, "Alice");
        Student student7 = new Student(7, "Bob B");
        Student student8 = new Student(8, "Maria B");
        Student student9 = new Student(9, "Anna B");
        Student student10 = new Student(10, "John B");

        student1.addCourse(course1);
        student1.addCourse(course2);
        student1.addCourse(course3);

        student2.addCourse(course1);
        student2.addCourse(course2);

        student3.addCourse(course3);

        student4.addCourse(course1);
        student4.addCourse(course2);

        student5.addCourse(course1);
        student5.addCourse(course2);

        student6.addCourse(course3);

        student7.addCourse(course1);

        student8.addCourse(course2);

        student9.addCourse(course3);

        student10.addCourse(course1);

        Teacher teacher1 = new Teacher("Alex");
        Teacher teacher2 = new Teacher("Bob");
        Teacher teacher3 = new Teacher("Maria");

        teacher1.addCourse(course1);
        teacher1.addCourse(course2);
        teacher1.addCourse(course3);
        teacher1.addCourse(course1);

        teacher2.addCourse(course1);
        teacher2.addCourse(course2);

        teacher3.addCourse(course3);

        System.out.println(teacher1.getStudents());
        System.out.println(teacher2.getStudents());
        System.out.println(teacher3.getStudents());
    }
}

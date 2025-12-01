package at.tasks.stream_api;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("John", 17, 1));
        students.add(new Student("Jack", 19, 2));
        students.add(new Student("Albert", 35, 1));
        students.add(new Student("Sam", 40, 2));
        students.add(new Student("Frodo", 40, 1));
        students.add(new Student("Bolder", 18, 2));
        students.add(new Student("Peepin", 19, 2));
        students.add(new Student("Merry", 21, 1));
        students.add(new Student("Gandalf", 23, 1));
        students.add(new Student("Olorin", 74, 2));
        students.add(new Student("Tarkun", 55, 2));

        System.out.println(getStudentsList(students));
    }

    private static List<String> getStudentsList (List<Student> studentsList) {
        return studentsList.stream()
                .filter(student -> student.getAge() >= 18 && student.getAge() <= 30)
                .filter(student -> student.getStreamNumber() == 2)
                .map(Student::getName)
                .distinct()
                .toList();
    }
}

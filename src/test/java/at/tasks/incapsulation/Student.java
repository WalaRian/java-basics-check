package at.tasks.incapsulation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Student {
    private final String name;
    private final List<Integer> grades;

    // Конструктор с именем (обязательный) и оценками (опционально)
    public Student(String name, int... initialGrades) {
        this.name = name;
        this.grades = new ArrayList<>();
        if (initialGrades != null) {
            for (int grade : initialGrades) {
                addGrade(grade);
            }
        }
    }

    // Метод для добавления новой оценки
    public void addGrade(int grade) {
        if (grade < 2 || grade > 5) {
            throw new IllegalArgumentException("Оценка должна быть целым числом в диапазоне от 2 до 5");
        }
        grades.add(grade);
    }

    // Метод для получения всех оценок (возвращаем копию, чтобы защитить исходный список)
    public List<Integer> getGrades() {
        return new ArrayList<>(grades);
    }

    // Метод для текстового представления студента с его оценками
    public String toString() {
        return name + ": " + grades.toString();
    }
}
package school;

import java.util.ArrayList;
import java.util.List;

public class School {
    private List<Student> students = new ArrayList<>();

    public void addStudent(String name, int age) {
        try {
            Student student = new Student(name, age);
            students.add(student);
            System.out.println("✅ " + name + " успешно добавлен в список!");
        } catch (InvalidAgeException e) {
            System.out.println("⚠️ Ошибка: " + e.getMessage());
        }
    }

    public void printStudents() {
        System.out.println("\n📚 Список студентов:");
        for (Student s : students) {
            System.out.println(s);
        }
    }
}

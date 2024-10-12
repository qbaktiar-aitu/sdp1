package Assignment3;


import java.util.ArrayList;
import java.util.List;

// Класс Teacher отвечает за уведомление студентов о новых заданиях
public class Teacher {
    private List<Observer> students = new ArrayList<>();
    private String assignment;

    // Добавить студента для уведомлений
    public void addStudent(Observer student) {
        students.add(student);
        System.out.println("Teacher Miras: " + ((Student) student).getName() + " has been added.");
    }

    // Удалить студента из уведомлений
    public void removeStudent(Observer student) {
        students.remove(student);
        System.out.println("Teacher Miras: " + ((Student) student).getName() + " has been removed.");
    }

    // Уведомить всех студентов о новом задании
    public void notifyStudents() {
        for (Observer student : students) {
            student.update(assignment);
        }
    }

    // Добавить новое задание и уведомить студентов
    public void postAssignment(String newAssignment) {
        this.assignment = newAssignment;
        System.out.println("\nTeacher Miras: New assignment posted: " + newAssignment);
        notifyStudents();
    }
}


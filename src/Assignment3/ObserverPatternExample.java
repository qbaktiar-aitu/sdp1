package Assignment3;

// Главный класс для демонстрации работы Observer паттерна
public class ObserverPatternExample {
    public static void main(String[] args) {
        // Создать учителя (Subject)
        Teacher teacher = new Teacher();

        // Создать студентов (Observers)
        Student student1 = new Student("Baktiar");
        Student student2 = new Student("Alisher");

        // Зарегистрировать студентов для уведомлений
        teacher.addStudent(student1);
        teacher.addStudent(student2);

        // Опубликовать новое задание
        teacher.postAssignment("Math Homework");

        // Новый студент присоединяется к классу
        Student student3 = new Student("Sabina");
        teacher.addStudent(student3);

        // Опубликовать еще одно задание
        teacher.postAssignment("Software Design Patterns Homework");
    }
}


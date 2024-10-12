package Assignment3;


// Класс Student реализует интерфейс Observer
public class Student implements Observer {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    // Метод обновления вызывается при новом задании
    @Override
    public void update(String assignment) {
        System.out.println(name + " received a new assignment: " + assignment);
    }

    public String getName() {
        return name;
    }
}


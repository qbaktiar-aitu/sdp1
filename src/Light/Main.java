package Light;

public class Main {
    public static void main(String[] args) {
        Light light = new Light(); // Создаем объект света

        Command turnOn = new TurnOnLightCommand(light); // Команда включения
        Command turnOff = new TurnOffLightCommand(light); // Команда выключения

        RemoteControl remote = new RemoteControl(); // Создаем пульт

        // Включаем свет
        remote.setCommand(turnOn);
        remote.pressButton(); // Должно вывести: Light is ON

        // Выключаем свет
        remote.setCommand(turnOff);
        remote.pressButton(); // Должно вывести: Light is OFF
    }
}

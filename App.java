// Task 5: Abstract Factory Pattern

interface IButton {
    void render();
}

interface IWindow {
    void display();
}

class WindowsOSButton implements IButton {
    @Override
    public void render() {
        System.out.println("Rendering button in Windows style.");
    }
}

class WindowsOSWindow implements IWindow {
    @Override
    public void display() {
        System.out.println("Displaying window in Windows style.");
    }
}

class MacOSButton implements IButton {
    @Override
    public void render() {
        System.out.println("Rendering button in Mac style.");
    }
}

class MacOSWindow implements IWindow {
    @Override
    public void display() {
        System.out.println("Displaying window in Mac style.");
    }
}

interface IGUIFactory {
    IButton createButton();
    IWindow createWindow();
}

class WindowsFactoryGUI implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new WindowsOSButton();
    }

    @Override
    public IWindow createWindow() {
        return new WindowsOSWindow();
    }
}

class MacFactoryGUI implements IGUIFactory {
    @Override
    public IButton createButton() {
        return new MacOSButton();
    }

    @Override
    public IWindow createWindow() {
        return new MacOSWindow();
    }
}



public class App {
    public static void main(String[] args) {
        // Demonstrate Task 1: Factory Method Pattern
        System.out.println("=== Task 1: Factory Method Pattern ===");
        DeliveryFactory deliveryFactory = new WaterDelivery();
        deliveryFactory.initiateDelivery();
        System.out.println();

        // Demonstrate Task 2: Singleton Pattern
        System.out.println("=== Task 2: Singleton Pattern ===");
        LogManager logger1 = LogManager.getInstance();
        LogManager logger2 = LogManager.getInstance();
        logger1.logMessage("Application has started.");
        logger2.logMessage("Encountered an error.");
        System.out.println("Logger instances are the same: " + (logger1 == logger2));
        System.out.println();

        // Demonstrate Task 3: Builder Pattern
        System.out.println("=== Task 3: Builder Pattern ===");
        Residence house = new Residence.ResidenceBuilder()
                .configureRooms(3)
                .configureFloors(2)
                .withPool(true)
                .withGarage(false)
                .create();
        System.out.println(house);
        System.out.println();


        System.out.println("=== Task 4: Prototype Pattern ===");
        ProductItem originalItem = new ProductItem("Sample Product", 99.99);
        ProductItem clonedItem = (ProductItem) originalItem.makeCopy();
        System.out.println("Original: " + originalItem);
        System.out.println("Cloned: " + clonedItem);
        System.out.println();


        System.out.println("=== Task 5: Abstract Factory Pattern ===");
        IGUIFactory guiFactory = new WindowsFactoryGUI();
        IButton button = guiFactory.createButton();
        IWindow window = guiFactory.createWindow();
        button.render();
        window.display();
    }
}
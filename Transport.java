// Task 1: Factory Method Pattern

interface ITransport {
    void executeDelivery();
}

class LandTransport implements ITransport {
    @Override
    public void executeDelivery() {
        System.out.println("Transporting goods via truck on land.");
    }
}

class SeaTransport implements ITransport {
    @Override
    public void executeDelivery() {
        System.out.println("Transporting goods via ship on water.");
    }
}

class AirTransport implements ITransport {
    @Override
    public void executeDelivery() {
        System.out.println("Transporting goods via drone in the air.");
    }
}

abstract class DeliveryFactory {
    abstract ITransport createTransport();

    public void initiateDelivery() {
        ITransport transport = createTransport();
        transport.executeDelivery();
    }
}

class LandDelivery extends DeliveryFactory {
    @Override
    ITransport createTransport() {
        return new LandTransport();
    }
}

class WaterDelivery extends DeliveryFactory {
    @Override
    ITransport createTransport() {
        return new SeaTransport();
    }
}

class AirDelivery extends DeliveryFactory {
    @Override
    ITransport createTransport() {
        return new AirTransport();
    }
}
